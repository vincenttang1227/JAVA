package CH09_27;

import javax.swing.*;

class MyInputDialog extends JFrame
{
	MyInputDialog()
	{
		String ans = JOptionPane.showInputDialog(null, "�п�J�Ʀr����T�w","��J",JOptionPane.QUESTION_MESSAGE);
		
		if(ans==null)
			System.exit(0);
		
		JOptionPane.showMessageDialog(null,ans, "��J���G",JOptionPane.INFORMATION_MESSAGE);
	}
}

public class CH09_27
{

	public static void main(String[] args)
	{
		new MyInputDialog();

	}

}
