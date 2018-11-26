package CH10_02;

import javax.swing.*;
import java.sql.*;

class CCreate_DB_Table
{
	private Connection conn;
	private Statement stmt;
	private String db_name = "mol";
	private String db_table = "stock";

	void ErrMsg(String msg, Exception e)
	{
		JOptionPane.showMessageDialog(null, msg + "\n�T���G" + e, "���~�T��", JOptionPane.ERROR_MESSAGE);
		
		System.exit(0);
	}

	public CCreate_DB_Table()
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
			Create_TB += "(code TEXT CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '���~�N�X', ";
			Create_TB += "name TEXT CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '���~�W��', ";
			Create_TB += "price FLOAT NOT NULL COMMENT '���', ";
			Create_TB += "amount INT NOT NULL COMMENT '�ƶq', ";
			Create_TB += "PRIMARY KEY (code(5))) ENGINE = InnoDB";
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

public class CH10_02
{
	public static void main(String[] arge)
	{
		new CCreate_DB_Table();
	}
}