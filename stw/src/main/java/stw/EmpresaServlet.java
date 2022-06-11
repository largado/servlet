package stw;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class EmpresaServlet
 */
public class EmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("efetuando cadastro");
		PrintWriter out = response.getWriter();
		
		
		//Pra pegar o parâmetro de entrada
		
		String nomeRecebidoComoParametro = request.getParameter("login");
		
		out.println("<html>");
		out.println("<body>");
		out.println("Servlet de teste dentro do java com servlet 2 - Cadastro");
		out.println(nomeRecebidoComoParametro);
		out.println("</body>");
		out.println("</html>");
		
		System.out.println(nomeRecebidoComoParametro);
		
		
		//url configurada neste servlet para teste: http://localhost:8080/stw/kenametalEmpresa
		//url configurada neste servlet para teste com envio de parâmetro: http://localhost:8080/stw/kenametalEmpresa=?nome=Claro
		
		
		
		
		
		
		
	}

}
