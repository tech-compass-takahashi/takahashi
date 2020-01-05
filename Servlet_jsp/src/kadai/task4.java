package kadai;

import java.io.IOException;
import java.util.Date;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/task4")
public class task4 extends HttpServlet {
	final String[] fortune = {"大吉","中吉","小吉","末吉","凶","大凶"};

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Random random = new Random();
		int i = random.nextInt(fortune.length);
		Date today = new Date();

		FortuneBean fortuneBean = new FortuneBean();
        fortuneBean.setToday(today);
        fortuneBean.setFortune(fortune[i]);
        request.setAttribute("fortuneBean", fortuneBean);

		request.getRequestDispatcher("/WEB-INF/jsp/fortune_result.jsp").forward(request,response);
	}
}