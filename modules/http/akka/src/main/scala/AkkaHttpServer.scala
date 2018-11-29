package modules.http.akka

import modules.shapes.HttpServer

class AkkaHttpServer extends HttpServer {
  override def addEndpoint[Request, Response](route: String)(req2Res: Request => Response): Unit = println {
    s"[AKKA-HTTP] Added endpoint with route: '$route'"
  }
}

