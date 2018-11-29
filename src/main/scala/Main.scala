import com.google.inject.Guice
import lib.ModuleBuilder
import modules.upload.FileUploadService
import scala.collection.JavaConverters._

object Main extends App {
  val modules = ModuleBuilder.modules
  val injector = Guice.createInjector(ModuleBuilder.modules.asJava)
  injector getInstance classOf[FileUploadService]
}