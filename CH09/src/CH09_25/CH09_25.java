package CH09_25;

import javax.swing.*;

class MyMessageDialog extends JFrame
{
	MyMessageDialog()
	{
		JOptionPane.showMessageDialog(null, "�ӥ𮧤F","����",JOptionPane.INFORMATION_MESSAGE);
	}
}

public class CH09_25
{

	public static void main(String[] args)
	{
		new MyMessageDialog();

	}

}
