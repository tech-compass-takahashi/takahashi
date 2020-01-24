package operationDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectDB {

	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/task1", "root", "");
			System.out.println("DB接続が成功しました。");

			//SQL文の実行
			String sql = "SELECT name FROM employee WHERE age = ?";
			PreparedStatement ps = con.prepareStatement(sql);

			//条件の「?」に値を設定
			ps.setInt(1,10);

			//SQL文の結果を取得する
			ResultSet rs = ps.executeQuery();

			//使用が終わったら切断
			rs.close();
			ps.close();

		}catch(SQLException e) {
			//DB接続やSQL処理の失敗時の処理
			e.printStackTrace();

		}catch(ClassNotFoundException e) {
			//JDBCドライバが見つからない時の処理
			e.printStackTrace();

		}finally {
			//データベースの切断
			if(con != null){
				try {
					con.close();

				}catch(SQLException e) {
					//DB切断失敗時の処理
					e.printStackTrace();
				}
			}
		}
	}
}