package CH09_20;

import java.awt.*;
import javax.swing.*;

class MyJFrame extends JFrame
{
	MyJFrame()
	{
		JFrame frame = new JFrame();
		setTitle("BorderLayout");
		setLayout(new BorderLayout());
		setLocation(100, 100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btnNorth = new JButton("�_");
		add(btnNorth, BorderLayout.NORTH);

		JButton btnWest = new JButton("��");
		add(btnWest, BorderLayout.WEST);

		JButton btnEast = new JButton("�F");
		add(btnEast, BorderLayout.EAST);

		JButton btnCenter = new JButton("��");
		add(btnCenter, BorderLayout.CENTER);

		JButton btnSouth = new JButton("�n");
		add(btnSouth, BorderLayout.SOUTH);

		pack();
	}
}

public class CH09_20
{
	public static void main(String[] args)
	{
		new MyJFrame();
	}
}
