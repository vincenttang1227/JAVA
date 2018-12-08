package new09_02;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
//import java.awt.*;
//import javax.swing.JFrame;

class RPSF extends JFrame
{
	int cCount = 0;
	int pCount = 0;
	int pushCount = 0;
	ImageIcon Scissor = new ImageIcon("..\\WORK09_02\\src\\new09_02\\images\\Scissor.gif");
	ImageIcon Stone = new ImageIcon("..\\WORK09_02\\src\\new09_02\\images\\Stone.gif");
	ImageIcon Paper = new ImageIcon("..\\WORK09_02\\src\\new09_02\\images\\Paper.gif");
	JLabel lblp = new JLabel("�ХX��~~");
	JLabel lblc = new JLabel("�ݽ֥�Ĺ����!!");
	JLabel pWin = new JLabel("���aĹ���ơG");
	JLabel lblpWin = new JLabel(""+pCount);
	JLabel cWin = new JLabel("�q��Ĺ���ơG");
	JLabel lblcWin = new JLabel(""+cCount);
	JLabel push = new JLabel("���⦸�ơG");
	JLabel lblpush = new JLabel(""+pushCount);
	JLabel lbl6 = new JLabel("��Ĺ���A�G");
	JLabel status = new JLabel();
	JButton btnScissor = new JButton(" �ŤM ", Scissor);
	JButton btnStone = new JButton(" ���Y ", Stone);
	JButton btnPaper = new JButton(" �� ", Paper);
	JButton btnReset = new JButton("����");

	public RPSF()
	{
		setTitle("�q���C��");
		setLayout(null);
		setBounds(500, 100, 600, 680);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Font f = new Font("�s�ө���", Font.BOLD, 20);

		lblp.setFont(f);
		lblp.setBounds(50, 80, 200, 80);
		add(lblp);

		lblc.setFont(f);
		lblc.setBounds(300, 80, 200, 80);
		add(lblc);

		pWin.setFont(f);
		pWin.setBounds(280, 205, 150, 80);
		add(pWin);

		lblpWin.setFont(f);
		lblpWin.setBounds(430, 205, 150, 80);
		add(lblpWin);

		cWin.setFont(f);
		cWin.setBounds(280, 305, 150, 80);
		add(cWin);

		lblcWin.setFont(f);
		lblcWin.setBounds(430, 305, 150, 80);
		add(lblcWin);

		push.setFont(f);
		push.setBounds(280, 405, 150, 80);
		add(push);

		lblpush.setFont(f);
		lblpush.setBounds(430, 405, 150, 80);
		add(lblpush);

		lbl6.setFont(f);
		lbl6.setBounds(280, 505, 150, 80);
		add(lbl6);

		status.setFont(f);
		status.setBounds(400, 505, 150, 80);
		add(status);

		btnScissor.setFont(f);
		btnScissor.setBounds(50, 200, 170, 80);
		add(btnScissor);
		btnScissor.addActionListener(ListenerbtnScissor);

		btnStone.setFont(f);
		btnStone.setBounds(50, 300, 170, 80);
		add(btnStone);
		btnStone.addActionListener(ListenerbtnStone);

		btnPaper.setFont(f);
		btnPaper.setBounds(50, 400, 170, 80);
		add(btnPaper);
		btnPaper.addActionListener(ListenerbtnPaper);

		btnReset.setFont(f);
		btnReset.setBounds(50, 500, 170, 80);
		add(btnReset);
		btnReset.addActionListener(ListenerbtnReset);

		repaint();
	}

	public void check(int play)
	{
		int num = (int) (Math.random() * 3) + 1;
		if (play == 1)
		{
			if (num == 1)
			{
				lblc.setIcon(Scissor);
				lblc.setText("�q���X�ŤM");
				status.setText("����!");
				pushCount += 1;
				push.setText("" + pushCount);
			}
			else if (num == 2)
			{
				lblc.setIcon(Stone);
				lblc.setText("�q���X���Y");
				status.setText("�q��Ĺ�F!");
				cCount += 1;
				lblcWin.setText("" + cCount);
			}
			else
			{
				lblc.setIcon(Paper);
				lblc.setText("�q���X��");
				status.setText("�AĹ�F!");
				pCount += 1;
				lblpWin.setText("" + pCount);
			}
		}
		
		if (play == 2)
		{
			if (num == 1)
			{
				lblc.setIcon(Scissor);
				lblc.setText("�q���X�ŤM");
				status.setText("�AĹ�F!");
				pushCount += 1;
				push.setText("" + pushCount);
			}
			else if (num == 2)
			{
				lblc.setIcon(Stone);
				lblc.setText("�q���X���Y");
				status.setText("����!");
				cCount += 1;
				lblcWin.setText("" + cCount);
			}
			else
			{
				lblc.setIcon(Paper);
				lblc.setText("�q���X��");
				status.setText("�q��Ĺ�F!");
				pCount += 1;
				lblpWin.setText("" + pCount);
			}
		}
		
		if (play == 3)
		{
			if (num == 1)
			{
				lblc.setIcon(Scissor);
				lblc.setText("�q���X�ŤM");
				status.setText("�q��Ĺ�F!");
				pushCount += 1;
				push.setText("" + pushCount);
			}
			else if (num == 2)
			{
				lblc.setIcon(Stone);
				lblc.setText("�q���X���Y");
				status.setText("�AĹ�F!");
				cCount += 1;
				lblcWin.setText("" + cCount);
			}
			else
			{
				lblc.setIcon(Paper);
				lblc.setText("�q���X��");
				status.setText("����!");
				pCount += 1;
				lblpWin.setText("" + pCount);
			}
		}

		if (pCount == 5)
		{
			status.setText("�AĹ�F");
			btnScissor.removeActionListener(ListenerbtnScissor);
			btnStone.removeActionListener(ListenerbtnStone);
			btnPaper.removeActionListener(ListenerbtnPaper);
		}
		if (cCount == 5)
		{
			status.setText("�q��Ĺ�F");
			btnScissor.removeActionListener(ListenerbtnScissor);
			btnStone.removeActionListener(ListenerbtnStone);
			btnPaper.removeActionListener(ListenerbtnPaper);
		}
	}

	public ActionListener ListenerbtnReset = new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			pCount = 0;
			cCount = 0;
			pushCount = 0;

			lblpWin.setText("" + pCount);
			lblcWin.setText("" + cCount);
			lblpush.setText("" + pushCount);
			status.setText("");

			btnScissor.addActionListener(ListenerbtnScissor);
			btnStone.addActionListener(ListenerbtnStone);
			btnPaper.addActionListener(ListenerbtnPaper);
		}
	};
	public ActionListener ListenerbtnScissor = new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			lblp.setText("���a�X�ŤM");
			lblp.setIcon(Scissor);
			check(1);
		}
	};
	public ActionListener ListenerbtnStone = new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			lblp.setText("���a�X���Y");
			lblp.setIcon(Stone);
			check(2);
		}
	};
	public ActionListener ListenerbtnPaper = new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			lblp.setText("���a�X��");
			lblp.setIcon(Paper);
			check(3);
		}
	};
}

public class new09_02
{
	public static void main(String[] args)
	{
		new RPSF();
	}
}
