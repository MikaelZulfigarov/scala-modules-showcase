package modules.http.akka

import com.google.inject.AbstractModule
import modules.shapes.HttpServer

class AkkaHttpServerModule extends AbstractModule {
  override def configure(): Unit = {
    bind(classOf[HttpServer]).to(classOf[AkkaHttpServer])
  }
}