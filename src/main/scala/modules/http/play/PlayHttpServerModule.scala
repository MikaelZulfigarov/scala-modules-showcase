package modules.http.play

import com.google.inject.AbstractModule
import modules.shapes.HttpServer

class PlayHttpServerModule extends AbstractModule {
  override def configure(): Unit = {
    bind(classOf[HttpServer]).to(classOf[PlayHttpServer])
  }
}