package CH07_01;

class CPenScore
{
	protected String name;
	protected int pen_score;

	public void SetPenData(String name, int score)
	{
		this.name = name;
		pen_score = score;
	}
	public void ShowPenScore()
	{
		System.out.println("\n���զ��Z�G");
		System.out.println("�m�W�G" + name);
		System.out.println("���դ��ơG" + pen_score);
	}
}

class CTotalScore extends CPenScore
{
	private int oral_score;
	private int tot_score;

	public void SetOralData(int score)
	{
		oral_score = score;
	}

	public void ShowTotScore()
	{
		System.out.println("\n���զ��Z�G");
		System.out.println("�m�W�G" + name);
		System.out.println("���դ��ơG" + pen_score);
		System.out.println("�f�դ��ơG" + oral_score);
		System.out.println("================");
		tot_score = pen_score + oral_score;
		System.out.println("�`���G" + tot_score);
	}
}

public class CH07_01
{

	public static void main(String[] args)
	{
		CPenScore p1 = new CPenScore();
		p1.SetPenData("�i�T", 50);
		p1.ShowPenScore();

		CTotalScore p2 = new CTotalScore();
		p2.SetPenData("���|", 60);
		p2.SetOralData(20);
		p2.ShowTotScore();
	}

}
