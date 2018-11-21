package CH09_10;

import java.awt.event.*;
import javax.swing.*;

class CAreaF extends JFrame implements ActionListener
{
	private JTextField txtLen = new JTextField("0");
	private JTextField txtArea = new JTextField();
	private JButton btnOK=new JButton("�T�w");
	private JButton btnCls=new JButton("�M��");

	CAreaF()
	{
		setTitle("���諬���n");
		setLayout(null);
		setBounds(100,100,220,180);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblTitle = new JLabel("����έ��n = L * L");
		lblTitle.setBounds(50,10,200,20);
		add(lblTitle);

		JLabel lblLen = new JLabel("��J����G");
		lblLen.setBounds(20,50,100,20);
		add(lblLen);

		txtLen.setBounds(90, 50, 100, 20);
		add(txtLen);

		txtArea.setBounds(20,80,170,20);
		txtArea.setEditable(false);
		add(txtArea);

		btnOK.setBounds(20,110,70,20);
		btnOK.addActionListener(this);
		add(btnOK);

		btnCls.setBounds(120,110,70,20);
		add(btnCls);

		repaint();
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == btnOK)
		{
			int len,area;
			len=Integer.parseInt(txtLen.getText());
			area=len*len;
			txtArea.setText("���n�G"+area);
			btnOK.removeActionListener(this);
			btnCls.addActionListener(this);
		}

		if (e.getSource() == btnCls)
		{
			txtLen.setText("0");
			txtArea.setText("");
			btnOK.addActionListener(this);
			btnCls.removeActionListener(this);
		}
	}
}

public class CH09_10
{
	public static void main(String[] args)
	{
		new CAreaF();
	}
}