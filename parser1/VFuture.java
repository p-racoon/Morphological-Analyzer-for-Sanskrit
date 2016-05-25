package parser1;

public class VFuture extends Verb {
	void start()
	{
		vFuture();
	}
	void vFuture()
	{
		new VFuFirstPerson().start();
		new VFuSecondPerson().start();
		new VFuThirdPerson().start();
	}
}
