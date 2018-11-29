import com.google.inject.Guice
import modules.http.akka.AkkaHttpServerModule
import modules.http.play.PlayHttpServerModule
import upload.{FileUploadModule, FileUploadService}
object Main extends App {

  val akkaHttpServerModule = new AkkaHttpServerModule
  val playHttpServerModule = new PlayHttpServerModule
  val fileUploadModule = new FileUploadModule

  val injector = Guice.createInjector(
   // playHttpServerModule,
    //Switch to use
    akkaHttpServerModule,
    fileUploadModule
  )

  injector getInstance classOf[FileUploadService]
}
