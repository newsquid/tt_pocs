import com.trunktrunk._
import com.trunktrunk.servlets._
import org.scalatra._
import javax.servlet.ServletContext

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {
    context.mount(new PostServlet, "/api/posts/*")
    context.mount(new UserServlet, "/api/users/*")
  }
}
