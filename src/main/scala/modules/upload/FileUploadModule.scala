package modules.upload

import net.codingwell.scalaguice.ScalaModule

class FileUploadModule extends ScalaModule {
  override def configure(): Unit = {
    bind[FileUploadService].to[FileUploadServiceImpl]
  }
}
