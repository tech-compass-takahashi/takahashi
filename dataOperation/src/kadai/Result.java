package kadai;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Result")
public class Result extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String contactUs = request.getParameter("contactUs");
		String Inquiry = request.getParameter("Inquiry");

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>問い合わせ内容</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>以下の内容でお問い合わせしました。回答をお待ちください。</p>");
		out.println("名前：" + name + "様<br>");
		out.println("性別：" + gender + "<br>");
		out.println("お問い合わせ種類：" + contactUs + "<br>");
		out.println("お問い合わせ内容：" + Inquiry + "<br>");
		out.println("</body>");
		out.println("</html>");
	}
}