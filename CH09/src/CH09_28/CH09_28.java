package CH09_28;

import java.awt.*;
import javax.swing.*;

class MyOptionDialog extends JFrame
{
	MyOptionDialog()
	{
		ImageIcon icon=new ImageIcon();
		
		String[] options = {"����","����","�B��"};
		int ans = JOptionPane.showOptionDialog(null, "�п�ܤ��Ѫ��Ѯ�","�Ѯ�",0,0,icon,options,options[0]);
		
		JLabel lblAns;
		if(ans==0)
			lblAns=new JLabel("�X����������");
		else if(ans==1)
			lblAns=new JLabel("�X����ĳ��a�B��");
		else
			lblAns=new JLabel("�X������a�B��");
		
		add(lblAns);
		
		setTitle("�ﶵ��ܮ�");
		setLayout(new FlowLayout());
		setBounds(400,400,220,70);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class CH09_28
{

	public static void main(String[] args)
	{
		new MyOptionDialog();

	}

}
