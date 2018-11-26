package CH10_03;

import java.io.*;
import java.sql.*;
import java.text.*;

class CStockOperation
{
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	private String db_name, db_table;

	public CStockOperation(String db_name, String db_table)
	{
		this.db_name = db_name;
		this.db_table = db_table;

		try
		{
			Class.forName("com.mysql.jdbc.Driver");
		} 
		catch (Exception e)
		{
			System.out.println("1�BMSQL�X�ʵ{���w�˥��ѡI\n");
		}

		try
		{
			conn = DriverManager.getConnection("jdbc:mysql://localhost/" + db_name + "?user=root&password=12345678");
		}
		catch (SQLException e)
		{
			System.out.println("2�BConnection���~�I\n");
		}
	}

	public void InsertDB(String v_code, String v_name, float v_price, int v_amount)
	{
		try
		{
			stmt = conn.createStatement();
			stmt.execute("INSERT INTO " + db_table + " (code, name, price, amount) VALUES (' " + v_code + " ', ' " + v_name
					+ " ', " + v_price + ", " + v_amount + ")");
		}
		catch (SQLException e)
		{
			System.out.println("3�B���J��ƿ��~�I\n");
		}
		finally
		{
			FileClose();
		}
	}

	public void DeleteDB(String search_code)
	{
		try
		{
			stmt = conn.createStatement();
			stmt.executeUpdate("DELETE FROM " + db_table + " WHERE code = ' " + search_code + " ' ");
		}
		catch (SQLException e)
		{
			System.out.println("4�B�R����ƿ��~�I\n");
		}
		finally
		{
			FileClose();
		}
	}

	public void Display()
	{
		float money, total = 0;
		Format nf = new DecimalFormat(",###.0");

		try
		{
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM " + db_table);

			while (rs.next())
			{
				System.out.print(rs.getString("code") + "\t\t" + rs.getString("name") + "\t\t" + rs.getFloat("price")
						+ "\t\t" + rs.getInt("amount"));
				money = rs.getFloat("price") * rs.getInt("amount");
				System.out.println("\t\t" + nf.format(money));
				total += money;
			}
			System.out.println("\n�`���B\t\t\t" + nf.format(total));
		}
		catch (SQLException e)
		{
			System.out.println("5�B�d�߸�ƿ��~�I\n");
		} 
		finally
		{
			FileClose();
		}
	}

	void FileClose()
	{
		if (rs != null)
		{
			try
			{
				rs.close();
			}
			catch (SQLException e)
			{
				System.out.println("6�B��Ʈw�������~�I\n");
			}
			rs = null;
		}

		if (stmt != null)
		{
			try
			{
				stmt.close();
			}
			catch (SQLException e)
			{
				System.out.println("7�B��Ʈw�������~�I\n");
			}
			stmt = null;
		}
	}
}

public class CH10_03
{
	public static void main(String[] args) throws IOException
	{
		String db_name = "mol";
		String db_table = "stock";

		CStockOperation CStOp = new CStockOperation(db_name, db_table);

		BufferedReader keyin;
		keyin= new BufferedReader(new InputStreamReader(System.in));

		while (true)
		{
			System.out.println("=======================================");
			System.out.print("1�B�s�W\t2�B�������~\t3�B�R��\t4�B�����G");
			int choice = Integer.parseInt(keyin.readLine());
			System.out.println("=======================================");

			switch (choice)
			{
			case 1:
				System.out.println("1�B�s�W���~");
				System.out.print("��J���~�N���G");
				String v_code = keyin.readLine();
				System.out.print("��J���~�W�١G");
				String v_name = keyin.readLine();
				System.out.print("��J���~����G");
				float v_price = Float.parseFloat(keyin.readLine());
				System.out.print("��J���~�ƶq�G");
				int v_amount = Integer.parseInt(keyin.readLine());
				CStOp.InsertDB(v_code, v_name, v_price, v_amount);
				break;
			case 2:
				System.out.println("2�B�������~���");
				System.out.println("\n���~�N�X\t���~�W��\t���\t�ƶq\t���B");
				CStOp.Display();
				break;
			case 3:
				System.out.println("3�B�R�����~");
				System.out.print("��J���~�N���G");
				String search_code = keyin.readLine();
				CStOp.DeleteDB(search_code);
				break;
			case 4:
				System.exit(0);
			}
		}
	}
}