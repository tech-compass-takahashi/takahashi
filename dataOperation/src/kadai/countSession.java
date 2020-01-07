package kadai;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/countSession")
public class countSession extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html; charset=Shift_JIS");
	    PrintWriter out = response.getWriter();
	    HttpSession session = request.getSession(false);

	    out.println("<html>");
	    out.println("<head>");
	    out.println("<title>訪問回数テスト</title>");
	    out.println("</head>");
	    out.println("<body>");
	    out.println("<h> 訪問回数テスト（セッション)</h>");

	    if (session == null){
	      out.println("<p>初回訪問です</p>");
	      session = request.getSession(true);
	      session.setAttribute("visited", "1");
	    }else{
	      String visitedStr = (String)session.getAttribute("visited");
	      int visited = Integer.parseInt(visitedStr);
	      visited++;

	      out.println("<p>訪問回数は");
	      out.println(visited);
	      out.println("回目です</p>");

	      session.setAttribute("visited", Integer.toString(visited));
	    }

	    out.println("<a href=/dataOperation/countSession>画面を再訪問</a>");
	    out.println("</body>");
	    out.println("</html>");
	  }
	}