package lib

import java.io.File

import com.google.inject.Module
import com.typesafe.config.ConfigFactory
import net.codingwell.scalaguice.ScalaModule
import org.clapper.classutil.ClassFinder

import scala.language.postfixOps
import scala.collection.JavaConverters._

object ModuleBuilder {
  private val finder = ClassFinder(Seq(new File(".")))
  private val moduleShape = classOf[ScalaModule].getName
  private val requiredModuleNames: Seq[String] = ConfigFactory.load("modules.conf").getAnyRefList("modules").asScala.map(_.asInstanceOf[String])
  private val requiredModuleClassNames = requiredModuleNames.map(name => name.split("-").map(_.capitalize).mkString + "Module")
  private val requiredModuleClasses = finder.getClasses.filter {
    c => (c implements moduleShape) && (requiredModuleClassNames contains c.name.split("\\.").last)
  }

  lazy val modules: List[Module] = requiredModuleClasses.map {
    module => ClassLoader.getSystemClassLoader.loadClass(module.name).newInstance.asInstanceOf[Module]
  }.toList
}
