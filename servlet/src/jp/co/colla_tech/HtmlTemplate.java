package jp.co.colla_tech;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/HtmlTemplate")
public class HtmlTemplate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	 public static void header(PrintWriter out) {
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset = 'UTF-8'>");
		out.println("<title>Servlet Kadai</title>");
		out.println("</head>");
		out.println("<body>");
		//課題４で追加
		out.println("<p>↓占い結果↓</p>");

	}

	public static void footer(PrintWriter out) {
		out.println("</body>");
		out.println("</html>");

	}
}