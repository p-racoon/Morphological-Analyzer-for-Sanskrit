package parser1;

public class VPast extends Verb{
	/*VPast()
	{
		अपठत्
	}*/
	
	void start()
	{
		vPast();
	}
	void vPast()
	{
		new VPaFirstPerson().start();
		new VPaSecondPerson().start();
		new VPaThirdPerson().start();
	}
	
}
