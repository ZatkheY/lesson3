package HomeWork22;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("<html>" +
                "<head> " +
                "</head>" +
                "<body>" +
                "<center>" +
                "<h1>" +
                "<form action='HelloWorldServlet' method= 'POST'>" +
                "number " +
                "<input type='text' name= 'number'/>" +
                "pow " +
                "<input type='text' name= 'pow'/>" +
                "<button>" + "START" + "</button>" +
                "</form>" +
                "</h1>" +
                "</center>" +
                "</body>" +
                "</html>"
        );
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String number = req.getParameter("number");
        String pow = req.getParameter("pow");
        double result = pow(Double.parseDouble(number), Integer.parseInt(pow));
        resp.getWriter().write("<html>" +
                "<head></head>" +
                "<body>" +
                "<center>" +
                "<h1>" +
                "Result = " + result +
                "<form action='HelloWorldServlet' method= 'GET'>" +
                "<button>" + "Back" + "</button>" +
                "</h1>" +
                "</center>" +
                "</body>" +
                "</html>"
        );
    }

    private static double pow(double number, int pow) {
        if (pow == 0) {
            return 1;
        }
        if (pow < 0) {
            number = 1.0 / number;
            pow = -pow;
        }
        double newPow = pow(number, pow / 2);
        newPow = newPow * newPow;
        if (pow % 2 != 0) {
            newPow = newPow * number;
        }
        return newPow;
    }
}


