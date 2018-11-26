package Ch10_DB;

import javax.swing.*;
import java.sql.*;

class CCreateMember
{
	private Connection conn;
	private Statement stmt;
	private String db_name = "member";
	private String db_table = "donation";

	void ErrMsg(String msg, Exception e)
	{
		JOptionPane.showMessageDialog(null, msg + "\n�T���G" + e, "���~�T��", JOptionPane.ERROR_MESSAGE);

		System.exit(0);
	}

	public CCreateMember()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch (Exception e)
		{
			ErrMsg("1�BMSQL�X�ʵ{���w�˥��ѡI", e);
		}

		try
		{
			conn = DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=12345678");
			stmt = conn.createStatement();
			String Create_DB = "CREATE DATABASE " + db_name;
			stmt.executeUpdate(Create_DB);
		} 
		catch (SQLException e)
		{
			if (stmt != null)
				ErrMsg("2�B" + db_name + "��Ʈw�w�s�b�I", e);
			else
				ErrMsg("3�BMySQL�L�k�ҰʡI", e);
		}
		catch (Exception e)
		{
			ErrMsg("4�B�o�ͨ�L���~�I", e);
		}

		try
		{
			conn = DriverManager.getConnection("jdbc:mysql://localhost/" + db_name + "?user=root&password=12345678");
			stmt = conn.createStatement();

			String Create_TB = "CREATE TABLE " + db_table;
			Create_TB += "(id VARCHAR(10) PRIMARY KEY, ";
			Create_TB += "password VARCHAR(10), ";
			Create_TB += "name VARCHAR(10), ";
			Create_TB += "money INT)";
			stmt.executeUpdate(Create_TB);

			JOptionPane.showMessageDialog(null, "5�B" + db_name + "��Ʈw�M" + db_table + "��ƪ�إߦ��\�I");

			stmt.close();

			System.exit(0);
		}
		catch (SQLException e)
		{
			if (stmt != null)
				ErrMsg("6�B" + db_table + "��ƪ�w�s�b�I", e);
			else
				ErrMsg("7�BMySQL�L�k�ҰʡI", e);
		} 
		catch (Exception e)
		{
			ErrMsg("8�B�o�ͨ�L���~�I", e);
		}
	}
}

public class CH10_DB1
{
	public static void main(String[] arge)
	{
		new CCreateMember();
	}
}
