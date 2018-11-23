package HOMEWORK;

import java.awt.event.*;
import javax.swing.*;

class CGameF extends JFrame
{
	private int playWin=0,compWin=0,same=0,compGue;
	private ImageIcon iconScis = new ImageIcon("..\\HOMEWORK\\src\\HOMEWORK\\images\\Scissor.gif");
	private ImageIcon iconStone = new ImageIcon("..\\HOMEWORK\\src\\HOMEWORK\\images\\Stone.gif");
	private ImageIcon iconPaper = new ImageIcon("..\\HOMEWORK\\src\\HOMEWORK\\images\\Paper.gif");
	private JLabel lblPlay = new JLabel("�ХX���E�E�E");
	private JLabel lblComp = new JLabel("�ݽ֥�Ĺ�����I�I");
	private JButton btnScis = new JButton("�ŤM",iconScis);
	private JButton btnStone = new JButton("���Y",iconStone);
	private JButton btnPaper = new JButton("��",iconPaper);
	private JButton btnRst = new JButton("����");
	private JLabel lblPlayWin = new JLabel("���aĹ���ơG0");
	private JLabel lblCompWin = new JLabel("�q��Ĺ���ơG0");
	private JLabel lblSame = new JLabel("���⦸�ơG0");
	private JLabel lblResult = new JLabel("��Ĺ���A�G");

	CGameF()
	{
		setTitle("�q���C��");
		setLayout(null);
		setBounds(200,100,500,550);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lblPlay.setBounds(80, 50, 220, 80);
		add(lblPlay);
		
		lblComp.setBounds(280,50,220,80);
		add(lblComp);
		
		btnScis.setBounds(50,150,150,50);
		btnScis.addActionListener(ListenerScis);
		add(btnScis);
		
		btnStone.setBounds(50,230,150,50);
		btnStone.addActionListener(ListenerStone);
		add(btnStone);
		
		btnPaper.setBounds(50,310,150,50);
		btnPaper.addActionListener(ListenerPaper);
		add(btnPaper);
		
		btnRst.setBounds(50,390,150,50);
		btnRst.addActionListener(ListenerRst);
		add(btnRst);
		
		lblPlayWin.setBounds(300,175,120,20);
		add(lblPlayWin);
		
		lblCompWin.setBounds(300,225,120,20);
		add(lblCompWin);
		
		lblSame.setBounds(300,325,230,20);
		add(lblSame);
		
		lblResult.setBounds(300,425,120,20);
		add(lblResult);
		
		repaint();
	}
	
	public ActionListener ListenerScis = new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			lblPlay.setIcon(iconScis);
			lblPlay.setText("���a�q�ŤM");
			compGue=(int)(Math.random()*3+1);
			if (compGue==3)
			{
				lblComp.setIcon(iconPaper);
				lblComp.setText("�q���q��");
				playWin += 1;
				lblPlayWin.setText("���aĹ���ơG"+playWin);
			}
			else if (compGue==2)
			{
				lblComp.setIcon(iconStone);
				lblComp.setText("�q���q���Y");
				compWin += 1;
				lblCompWin.setText("�q��Ĺ���ơG"+compWin);
			}
			else
			{
				lblComp.setIcon(iconScis);
				lblComp.setText("�q���q�ŤM");
				same += 1;
				lblSame.setText("���⦸�ơG"+same);
			}
			whoWin();
		}
	};
	
	public ActionListener ListenerStone = new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			lblPlay.setIcon(iconStone);
			lblPlay.setText("���a�q���Y");
			compGue=(int)(Math.random()*3+1);
			if (compGue==1)
			{
				lblComp.setIcon(iconScis);
				lblComp.setText("�q���q�ŤM");
				playWin += 1;
				lblPlayWin.setText("���aĹ���ơG"+playWin);
			}
			else if (compGue==3)
			{
				lblComp.setIcon(iconPaper);
				lblComp.setText("�q���q��");
				compWin += 1;
				lblCompWin.setText("�q��Ĺ���ơG"+compWin);
			}
			else
			{
				lblComp.setIcon(iconStone);
				lblComp.setText("�q���q���Y");
				same += 1;
				lblSame.setText("���⦸�ơG"+same);
			}
			whoWin();
		}
	};
	
	public ActionListener ListenerPaper = new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			lblPlay.setIcon(iconPaper);
			lblPlay.setText("���a�q��");
			compGue=(int)(Math.random()*3+1);
			if (compGue==2)
			{
				lblComp.setIcon(iconStone);
				lblComp.setText("�q���q���Y");
				playWin += 1;
				lblPlayWin.setText("���aĹ���ơG"+playWin);
			}
			else if (compGue==1)
			{
				lblComp.setIcon(iconScis);
				lblComp.setText("�q���q�ŤM");
				compWin += 1;
				lblCompWin.setText("�q��Ĺ���ơG"+compWin);
			}
			else
			{
				lblComp.setIcon(iconPaper);
				lblComp.setText("�q���q��");
				same += 1;
				lblSame.setText("���⦸�ơG"+same);
			}
			whoWin();
		}	
	};
	
	public ActionListener ListenerRst = new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			new CGameF();
		}
	};
	
	public void whoWin()
	{
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
