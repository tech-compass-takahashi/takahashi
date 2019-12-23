package jp.co.colla_tech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HtmlTemplate")
public class HtmlTemplate extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String[]luckArray = {"大吉", "中吉", "小吉", "末吉", "凶", "大凶"};
		int index = (int) (Math.random()*6);
		String luck = luckArray[index];

		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset = 'UTF-8'>");
		out.println("<title>Servlet Kadai</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>↓占いの結果↓</p>");
		out.println("<h1>" + luck +"</h1>");
		out.println("</body>");
		out.println("</html>");
	}

	public static void header(PrintWriter out){
	    out.println("<!DOCTYPE html>");
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<meta charset = 'UTF-8'>");
	    out.println("<title>Servlet Kadai</title>");
	    out.println("</head>");
	    out.println("<body>");
	 }

	 public static void footer(PrintWriter out){
	    out.println("</body>");
	    out.println("</html>");
	 }
}