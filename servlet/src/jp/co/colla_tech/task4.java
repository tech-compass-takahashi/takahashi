package jp.co.colla_tech;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HtmlTemplate")
public class task4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//以下課題４追加部分
		Random r = new Random();
		String[]result = {"大吉", "中吉", "小吉","末吉", "凶","大凶"};
		String answer = result[r.nextInt(6)];
		response.setContentType("text/html ; charset = UTF-8 ");
		PrintWriter out = response.getWriter();
		HtmlTemplate.header(out);
		out.println("<h1>" + answer + "</h1>");
		HtmlTemplate.footer(out);
	}
}