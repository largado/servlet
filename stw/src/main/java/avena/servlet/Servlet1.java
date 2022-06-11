package avena.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//página inicial
@WebServlet(urlPatterns = "/inicio")
public class Servlet1 extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse resposta) throws IOException {
		
		PrintWriter out = resposta.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Servlet de teste dentro do java");
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("imprimindo linha no console");
		
		
		
		
		
	}

}
