package parser1;

public class VPresent extends Verb{

	void start()
	{
		vPresent();
	}
	void vPresent()
	{
		new VPrFirstPerson().start();
		new VPrSecondPerson().start();
		new VPrThirdPerson().start();
	}
}
