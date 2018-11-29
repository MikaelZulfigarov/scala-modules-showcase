package modules.shapes

trait HttpServer {
  def addEndpoint[Request, Response](route: String)(req2Res: Request => Response)
}
