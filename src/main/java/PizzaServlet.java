import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "PizzaServlet", urlPatterns = "/pizza-order")
public class PizzaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/pizza-order.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String crustType = req.getParameter("crust-type");
        System.out.println("Crust Type: " + crustType);
        String sauceType = req.getParameter("sauce-type");
        System.out.println("Sauce Type: " + sauceType);
        String size = req.getParameter("size");
        System.out.println("Size: " + size);
        String [] toppings = req.getParameterValues("toppings");
            for(String topping : toppings){
                System.out.println(topping);
                System.out.println(" ");
            }
        System.out.println(" ");
        System.out.println(req.getParameter("address"));
        resp.sendRedirect("/");
    }
}
