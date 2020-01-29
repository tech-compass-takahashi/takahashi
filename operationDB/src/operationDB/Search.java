package operationDB;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");

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
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/task1", "root", "");

			String sql = "select * from employee where name = ?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1,name);
			System.out.println("検索結果");

			ResultSet rs = ps.executeQuery();
		      while (rs.next()) {
		        System.out.println("ID：" + rs.getInt("id"));
		        System.out.println("名前：" + rs.getString("name"));
		        System.out.println("生年月日：" + rs.getString("birthday"));
		        System.out.println("年齢：" + rs.getInt("age"));
		      }

			//使用が終わったら切断
			ps.close();

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