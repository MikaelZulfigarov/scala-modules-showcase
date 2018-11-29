package upload

import com.google.inject.Inject
import modules.shapes.HttpServer

trait FileUploadService

class FileUploadServiceImpl @Inject() (httpServer: HttpServer) extends FileUploadService {
  httpServer.addEndpoint("/upload") {
    _ => //File upload logic
  }

  httpServer.addEndpoint("/drop-storage") {
    _ => //File storage dropping logic
  }
}
