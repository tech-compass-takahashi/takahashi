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


@WebServlet("/UpdateEmpolyee")
public class UpdateEmpolyee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String name = request.getParameter("name");

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>employeeテーブルに更新</title>");
		out.println("</head>");
		out.println("<body>");

		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/task1", "root", "");

			String sql = "update employee set name = ? where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1,name);
			ps.setInt(2,Integer.parseInt(id));

			int num = ps.executeUpdate();

			ps.close();

		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("DB接続やSQL処理の失敗");

		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("JDBCドライバが見つからない");

		}finally {
			if(con != null){
				try {
					con.close();

				}catch(SQLException e) {
					e.printStackTrace();
					System.out.println("データベースの切断失敗");
				}
			}
		}
		out.println("</body>");
		out.println("</html>");
	}
}