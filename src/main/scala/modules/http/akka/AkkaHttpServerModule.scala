package modules.http.akka

import modules.shapes.HttpServer
import net.codingwell.scalaguice.ScalaModule

class AkkaHttpServerModule extends ScalaModule {
  override def configure(): Unit = {
    bind[HttpServer].to[AkkaHttpServer]
  }
}