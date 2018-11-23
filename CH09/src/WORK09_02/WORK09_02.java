package WORK09_02;

import java.awt.event.*;
import javax.swing.*;

class CGameF extends JFrame
{
	private int playWin=0,compWin=0,same=0;
	private JLabel lblPlay = new JLabel("�ХX���E�E�E");
	private JLabel lblComp = new JLabel("�ݽ֥�Ĺ�����I�I");
	private JButton btnScis = new JButton("�ŤM");
	private JButton btnStone = new JButton("���Y");
	private JButton btnPaper = new JButton("��");
	private JButton btnRst = new JButton("����");
	private JLabel lblPlayWin = new JLabel("���aĹ���ơG0");
	private JLabel lblCompWin = new JLabel("�q��Ĺ���ơG0");
	private JLabel lblSame = new JLabel("���⦸�ơG0");
	private JLabel lblResult = new JLabel("��Ĺ���A�G");
	ImageIcon iconScis = new ImageIcon("..\\CH09\\src\\WORK09_02\\images\\Scissor.gif");
	ImageIcon iconStone = new ImageIcon("..\\CH09\\src\\WORK09_02\\images\\Stone.gif");
	ImageIcon iconPaper = new ImageIcon("..\\CH09\\src\\WORK09_02\\images\\Paper.gif");
	
	public CGameF()
	{
		setTitle("�q���C��");
		setLayout(null);
		setBounds(500,500,300,325);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lblPlay.setBounds(20, 30, 120, 50);
		add(lblPlay);
		
		lblComp.setBounds(160,30,120,50);
		add(lblComp);
		
		btnScis.setBounds(20,100,100,30);
		btnScis.addActionListener(ListenerScis);
		add(btnScis);
		
		btnStone.setBounds(20,145,100,30);
		btnStone.addActionListener(ListenerStone);
		add(btnStone);
		
		btnPaper.setBounds(20,190,100,30);
		btnPaper.addActionListener(ListenerPaper);
		add(btnPaper);
		
		btnRst.setBounds(20,235,100,30);
		btnRst.addActionListener(ListenerRst);
		add(btnRst);
		
		lblPlayWin.setBounds(150,100,120,20);
		add(lblPlayWin);
		
		lblCompWin.setBounds(150,125,120,20);
		add(lblCompWin);
		
		lblSame.setBounds(150,175,120,20);
		add(lblSame);
		
		lblResult.setBounds(150,225,120,20);
		add(lblResult);
		
		repaint();
	}
	
	public ActionListener ListenerScis = new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			lblPlay.setIcon(iconScis);
			lblPlay.setText("���a�q�ŤM");
			int comp=(int)(Math.random()*3+1);
			if (comp==3)
			{
				compChoose(3);
				playWin += 1;
				lblPlayWin.setText("���aĹ���ơG"+playWin);
			}
			else if (comp==2)
			{
				compChoose(2);
				compWin += 1;
				lblCompWin.setText("�q��Ĺ���ơG"+compWin);
			}
			else
			{
				compChoose(1);
				same += 1;
				lblSame.setText("���⦸�ơG"+same);
			}
			whichWin();
		}
	};
	
	public ActionListener ListenerStone = new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			lblPlay.setIcon(iconStone);
			lblPlay.setText("���a�q���Y");
			int comp=(int)(Math.random()*3+1);
			if (comp==1)
			{
				compChoose(1);
				playWin += 1;
				lblPlayWin.setText("���aĹ���ơG"+playWin);
			}
			else if (comp==3)
			{
				compChoose(3);
				compWin += 1;
				lblCompWin.setText("�q��Ĺ���ơG"+compWin);
			}
			else
			{
				compChoose(2);
				same += 1;
				lblSame.setText("���⦸�ơG"+same);
			}
			whichWin();
		}
	};
	
	public ActionListener ListenerPaper = new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			lblPlay.setIcon(iconPaper);
			lblPlay.setText("���a�q��");
			int comp=(int)(Math.random()*3+1);
			if (comp==2)
			{
				compChoose(2);
				playWin += 1;
				lblPlayWin.setText("���aĹ���ơG"+playWin);
			}
			else if (comp==1)
			{
				compChoose(1);
				compWin += 1;
				lblCompWin.setText("�q��Ĺ���ơG"+compWin);
			}
			else
			{
				compChoose(3);
				same += 1;
				lblSame.setText("���⦸�ơG"+same);
			}
			whichWin();
		}
		
	};
	
	public ActionListener ListenerRst = new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			new CGameF();
		}
	};
	
	public void whichWin()
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
	
	public void compChoose(int x)
	{
		if (x==1)
		{
			lblComp.setIcon(iconScis);
			lblComp.setText("�q���q�ŤM");
		}
		else if (x==2)
		{
			lblComp.setIcon(iconStone);
			lblComp.setText("�q���q���Y");
		}
		else
		{
			lblComp.setIcon(iconPaper);
			lblComp.setText("�q���q��");
		}
	}
}

public class WORK09_02
{

	public static void main(String[] args)
	{
		new CGameF();
	}
}
