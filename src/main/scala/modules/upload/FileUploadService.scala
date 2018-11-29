package modules.upload

import com.google.inject.Inject
import modules.shapes.HttpServer

class FileUploadService @Inject() (httpServer: HttpServer) {
  httpServer.addEndpoint("/upload") {
    _ => //File upload logic
  }

  httpServer.addEndpoint("/drop-storage") {
    _ => //File storage dropping logic
  }
}
