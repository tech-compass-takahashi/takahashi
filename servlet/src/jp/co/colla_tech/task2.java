package jp.co.colla_tech;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletKadai2")
public class task2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Date date = new Date();
		SimpleDateFormat stringToday = new SimpleDateFormat("yyyy/MM/dd");
		String today = stringToday.format(date);

		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset = 'UTF-8'>");
		out.println("<title>Servlet Kadai</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>今日の日付：" + today + "</h1>");
		out.println("<p></p>");
		out.println("</body>");
		out.println("</html>");
	}
}