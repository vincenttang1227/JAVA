package CH09_26;

import java.awt.*;
import javax.swing.*;

class MyConfirmDialog extends JFrame
{
	MyConfirmDialog()
	{
		int ans=JOptionPane.showConfirmDialog(null, "�{�b�U�B�ܡH","�լd",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
		
		JLabel lblAns;
		if (ans==JOptionPane.YES_OPTION)
			lblAns=new JLabel("�X���бa�B��");
		else
			lblAns=new JLabel("�X����������");
		
		add(lblAns);
		
		setTitle("�T�{��ܮ�");
		setLayout(new FlowLayout());
		setBounds(400, 350, 220, 70);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class CH09_26
{

	public static void main(String[] args)
	{
		new MyConfirmDialog();

	}

}
