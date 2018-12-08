package HOMEWORK;

import java.awt.event.*;
import java.awt.Font;
import javax.swing.*;

class CGameF extends JFrame
{
  ImageIcon iconScis = new ImageIcon("..\\HOMEWORK\\src\\HOMEWORK\\images\\Scissor.gif");
	ImageIcon iconStone = new ImageIcon("..\\HOMEWORK\\src\\HOMEWORK\\images\\Stone.gif");
	ImageIcon iconPaper = new ImageIcon("..\\HOMEWORK\\src\\HOMEWORK\\images\\Paper.gif");
	JLabel lblPlay = new JLabel("�ХX���E�E�E");
	JLabel lblComp = new JLabel("�ݽ֥�Ĺ�����I�I");
	JButton btnScis = new JButton("�ŤM", iconScis);
	JButton btnStone = new JButton("���Y", iconStone);
	JButton btnPaper = new JButton("��", iconPaper);
	JButton btnRst = new JButton("����");
	JLabel lblPlayWin = new JLabel("���aĹ���ơG0");
	JLabel lblCompWin = new JLabel("�q��Ĺ���ơG0");
	JLabel lblSame = new JLabel("���⦸�ơG0");
	JLabel lblResult = new JLabel("��Ĺ���A�G");
	Font f = new Font("�L�n������", Font.BOLD, 16);
	int playWin = 0;
	int compWin = 0;
	int same = 0;

	CGameF()
	{
		setTitle("�q���C��");
		setLayout(null);
		setBounds(200, 100, 500, 550);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		lblPlay.setBounds(80, 50, 220, 80);
		lblPlay.setFont(f);
		add(lblPlay);

		lblComp.setBounds(280, 50, 220, 80);
		lblComp.setFont(f);
		add(lblComp);

		btnScis.setBounds(50, 150, 150, 50);
		btnScis.addActionListener(ListenerScis);
		add(btnScis);

		btnStone.setBounds(50, 230, 150, 50);
		btnStone.addActionListener(ListenerStone);
		add(btnStone);

		btnPaper.setBounds(50, 310, 150, 50);
		btnPaper.addActionListener(ListenerPaper);
		add(btnPaper);

		btnRst.setBounds(50, 390, 150, 50);
		btnRst.addActionListener(ListenerRst);
		add(btnRst);

		lblPlayWin.setBounds(275, 175, 120, 20);
		lblPlayWin.setFont(f);
		add(lblPlayWin);

		lblCompWin.setBounds(275, 225, 120, 20);
		lblCompWin.setFont(f);
		add(lblCompWin);

		lblSame.setBounds(275, 325, 230, 20);
		lblSame.setFont(f);
		add(lblSame);

		lblResult.setBounds(275, 425, 200, 20);
		lblResult.setFont(f);
		add(lblResult);

		repaint();
	}

	public ActionListener ListenerScis = new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			lblPlay.setIcon(iconScis);
			lblPlay.setText("���a�q�ŤM");
			checkWin(1);
		}
	};

	public ActionListener ListenerStone = new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			lblPlay.setIcon(iconStone);
			lblPlay.setText("���a�q���Y");
			checkWin(2);
		}
	};

	public ActionListener ListenerPaper = new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			lblPlay.setIcon(iconPaper);
			lblPlay.setText("���a�q��");
			checkWin(3);
		}
	};

	public ActionListener ListenerRst = new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			lblPlay.setText("�ХX���E�E�E");
			lblPlay.setIcon(new ImageIcon(""));
			lblComp.setText("�ݽ֥�Ĺ�����I�I");
			lblComp.setIcon(new ImageIcon(""));
			lblPlayWin.setText("���aĹ���ơG0");
			lblCompWin.setText("�q��Ĺ���ơG0");
			lblSame.setText("���⦸�ơG0");
			lblResult.setText("��Ĺ���A�G");
			playWin = 0;
			compWin = 0;
			same = 0;

			btnScis.addActionListener(ListenerScis);
			btnStone.addActionListener(ListenerStone);
			btnPaper.addActionListener(ListenerPaper);
			btnRst.addActionListener(ListenerRst);
		}
	};

	public void checkWin(int playGue)
	{
		int compGue = (int) (Math.random() * 3 + 1);
		if (playGue == 1)
		{
			if (compGue == 3)
			{
				lblComp.setIcon(iconPaper);
				lblComp.setText("�q���q��");
				playWin ++;
				lblPlayWin.setText("���aĹ���ơG" + playWin);
				lblResult.setText("��Ĺ���A�G�A�qĹ�o�I");
			}
			else if (compGue == 2)
			{
				lblComp.setIcon(iconStone);
				lblComp.setText("�q���q���Y");
				compWin ++;
				lblCompWin.setText("�q��Ĺ���ơG" + compWin);
				lblResult.setText("��Ĺ���A�G�A�q���o�I");
			}
			else
			{
				lblComp.setIcon(iconScis);
				lblComp.setText("�q���q�ŤM");
				same ++;
				lblSame.setText("���⦸�ơG" + same);
				lblResult.setText("��Ĺ���A�G�o������I");
			}
		}

		else if (playGue == 2)
		{
			if (compGue == 1)
			{
				lblComp.setIcon(iconScis);
				lblComp.setText("�q���q�ŤM");
				playWin ++;
				lblPlayWin.setText("���aĹ���ơG" + playWin);
				lblResult.setText("��Ĺ���A�G�A�qĹ�o�I");
			}
			else if (compGue == 3)
			{
				lblComp.setIcon(iconPaper);
				lblComp.setText("�q���q��");
				compWin ++;
				lblCompWin.setText("�q��Ĺ���ơG" + compWin);
				lblResult.setText("��Ĺ���A�G�A�q���o�I");
			}
			else
			{
				lblComp.setIcon(iconStone);
				lblComp.setText("�q���q���Y");
				same ++;
				lblSame.setText("���⦸�ơG" + same);
				lblResult.setText("��Ĺ���A�G�o������I");
			}
		}

		else
		{
			if (compGue == 2)
			{
				lblComp.setIcon(iconStone);
				lblComp.setText("�q���q���Y");
				playWin ++;
				lblPlayWin.setText("���aĹ���ơG" + playWin);
				lblResult.setText("��Ĺ���A�G�A�qĹ�o�I");
			}
			else if (compGue == 1)
			{
				lblComp.setIcon(iconScis);
				lblComp.setText("�q���q�ŤM");
				compWin ++;
				lblCompWin.setText("�q��Ĺ���ơG" + compWin);
				lblResult.setText("��Ĺ���A�G�A�q���o�I");
			}
			else
			{
				lblComp.setIcon(iconPaper);
				lblComp.setText("�q���q��");
				same ++;
				lblSame.setText("���⦸�ơG" + same);
				lblResult.setText("��Ĺ���A�G�o������I");
			}
		}

		if (playWin == 5)
		{
			btnScis.removeActionListener(ListenerScis);
			btnStone.removeActionListener(ListenerStone);
			btnPaper.removeActionListener(ListenerPaper);
			lblResult.setText("�z�qĹ�F�A�ӴΤF�I");

		}
		else if (compWin == 5)
		{
			btnScis.removeActionListener(ListenerScis);
			btnStone.removeActionListener(ListenerStone);
			btnPaper.removeActionListener(ListenerPaper);
			lblResult.setText("�z�q��F�I");

		}
	}
}

public class HOMEWORK
{
	public static void main(String[] args)
	{
		new CGameF();
	}
}
