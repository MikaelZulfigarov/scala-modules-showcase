package modules.http.play

import modules.shapes.HttpServer

class PlayHttpServer extends HttpServer {
  override def addEndpoint[Request, Response](route: String)(req2Res: Request => Response): Unit = println {
    s"[PLAY2-HTTP] Added endpoint with route: '$route'"
  }
}
