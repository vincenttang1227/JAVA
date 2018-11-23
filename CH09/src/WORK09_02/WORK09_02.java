package WORK09_02;

import java.awt.event.*;
import javax.swing.*;

class CGameF extends JFrame
{
	private int playWin=0,compWin=0,same=0,compGue;
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

	public CGameF()
	{
		setTitle("�q���C��");
		setLayout(null);
		setBounds(250,250,300,325);
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
	
	ImageIcon iconScis = new ImageIcon("..\\CH09\\src\\WORK09_02\\images\\Scissor.gif");
	ImageIcon iconStone = new ImageIcon("..\\CH09\\src\\WORK09_02\\images\\Stone.gif");
	ImageIcon iconPaper = new ImageIcon("..\\CH09\\src\\WORK09_02\\images\\Paper.gif");
	
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
	};
	
	public ActionListener ListenerRst = new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			new CGameF();
		}
	};
}

public class WORK09_02
{

	public static void main(String[] args)
	{
		new CGameF();
	}
}
