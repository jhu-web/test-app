package testPackage; // Always use packages. Never use default package.

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

/**
 * Very simplistic servlet that generates plain text. Uses the @WebServlet
 * annotation that is supported by Tomcat 7 and other servlet 3.0 containers.
 */
@WebServlet("/hello")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = -9059823631559295524L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("Hello World");
	}
}
