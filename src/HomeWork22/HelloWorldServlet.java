package HomeWork22;


import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorldServlet extends HttpServlet {
    @Override
    public void service(ServletRequest request, ServletResponse response) throws IOException {
        try (PrintWriter writer = response.getWriter()) {
            writer.println("<h1>Hello World</h1>");
        }
    }
}

