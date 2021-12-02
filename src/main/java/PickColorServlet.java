import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/pickColor")
public class PickColorServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/pickColor.jsp").forward(req, resp);

    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        resp.setContentType("text/html");
        String color = req.getParameter("color");

        PrintWriter out = resp.getWriter();
        if(color.equals("red"))
                out.println("<body> bgColor = red </body>");
        if(color.equals("blue"))
                out.println("<body> bgColor = blue</body>");
        if(color.equals("yellow"))
            out.println("<body> bgColor = yellow </body>");
        if(color.equals("green"))
            out.println("<body> bgColor = green </body>");


        resp.sendRedirect("/viewcolor?color=" + color);


    }
}
