package modules.upload

import com.google.inject.AbstractModule

class FileUploadModule extends AbstractModule {
  override def configure(): Unit = {
    bind(classOf[FileUploadService]).to(classOf[FileUploadService])
  }
}
