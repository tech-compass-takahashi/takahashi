package operationDB;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String birthday = request.getParameter("birthday");
		String age = request.getParameter("age");

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>登録内容をemployeeテーブルに登録</title>");
		out.println("</head>");
		out.println("<body>");

		Connection con = null;
		try {
			//JDBCドライバの読み込み（MySQL）
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("JDBCドライバの読み込み成功");

			//データベースの接続
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/task1", "root", "");
			System.out.println("データベースの接続成功");

			//SQL文の実行
			String sql = "insert into employee(id,name,birthday,age) values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("SQL文の実行に成功");

			//条件の「?」に値を設定
			ps.setInt(1,Integer.parseInt(id));
			ps.setString(2,name);
			ps.setString(3,birthday);
			ps.setInt(4,Integer.parseInt(age));

			//SQL文の結果を取得する
			int num = ps.executeUpdate();
			System.out.println("SQL文の結果を取得に成功");

			//使用が終わったら切断
			ps.close();
			System.out.println("使用が終わったので切断します");

		}catch(SQLException e) {
			//DB接続やSQL処理の失敗時の処理
			e.printStackTrace();
			System.out.println("DB接続やSQL処理の失敗");

		}catch(ClassNotFoundException e) {
			//JDBCドライバが見つからない時の処理
			e.printStackTrace();
			System.out.println("JDBCドライバが見つからない");

		}finally {
			//データベースの切断
			if(con != null){
				try {
					con.close();
					System.out.println("データベースの切断成功");

				}catch(SQLException e) {
					//DB切断失敗時の処理
					e.printStackTrace();
					System.out.println("データベースの切断失敗");
				}
			}
		}
		out.println("</body>");
		out.println("</html>");
	}
}