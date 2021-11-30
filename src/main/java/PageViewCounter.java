import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "HelloWorldServlet", urlPatterns = "/count")
public class PageViewCounter extends HttpServlet {
    private int hitCount;

    public void init() {
        hitCount = 0;
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String count = req.getParameter("count");

        if (count.equals("reset")) {
            init();


        } else {
            out.println("<p>Site Count: " + hitCount);
            hitCount++;
        }

    }
}