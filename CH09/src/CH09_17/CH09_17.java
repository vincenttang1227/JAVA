package CH09_17;

import java.awt.event.*;
import javax.swing.*;

class CMouseAdapF extends JFrame
{
	private JLabel lblShow,lblPic;
	private ImageIcon icon1,icon2,icon3;

	CMouseAdapF()
	{
		setTitle("�ƹ����A");
		setLayout(null);
		setBounds(500, 400, 220, 220);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		lblShow = new JLabel("�ƹ����A");
		lblShow.setBounds(20, 10, 200, 30);
		add(lblShow);

		icon1 = new ImageIcon("..\\CH09\\src\\CH09_17\\images\\Scissor.gif");
		icon2 = new ImageIcon("..\\CH09\\src\\CH09_17\\images\\Stone.gif");
		icon3 = new ImageIcon("..\\CH09\\src\\CH09_17\\images\\Paper.gif");
		
		lblPic = new JLabel(icon1);
		lblPic.setBounds(70,70,60,60);
		add(lblPic);
		lblPic.addMouseListener(new CMouseAdap());

		repaint();
	}

	class CMouseAdap extends MouseAdapter
	{
		public void mouseEntered(MouseEvent e)
		{
			lblShow.setText("�ƹ����A�G�ƹ����в��J");
			lblPic.setIcon(icon2);
		}

		public void mouseExited(MouseEvent e)
		{
			lblShow.setText("�ƹ����A�G�ƹ����в��X");
			lblPic.setIcon(icon1);
		}
		
		public void mousePressed(MouseEvent e)
		{
			lblShow.setText("�ƹ����A�G�ƹ����U");
			lblPic.setIcon(icon3);
		}
		
		public void mouseReleased(MouseEvent e)
		{
			lblShow.setText("�ƹ����A�G�ƹ���}");
			lblPic.setIcon(icon2);
		}
	}
}

public class CH09_17
{
	public static void main(String[] args)
	{
		CMouseAdapF mouseF = new CMouseAdapF();
	}
}

