package modules.http.play

import modules.shapes.HttpServer
import net.codingwell.scalaguice.ScalaModule

class PlayHttpServerModule extends ScalaModule {
  override def configure(): Unit = {
    bind[HttpServer].to[PlayHttpServer]
  }
}