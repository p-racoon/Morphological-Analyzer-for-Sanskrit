package parser1;

public class VPrSecondPerson extends VPresent{
	char s[]=str.toCharArray();
	int l=s.length;
	void start()
	{
		vPrSerstp();
	}
	
	void vPrSerstp()
	{
		/*if(flag==0)vPrSeSing();
		if(flag==0)vPrSeDual();
		if(flag==0)vPrSePlu();*/
		vPrSeSing();
		vPrSeDual();
		vPrSePlu();
	}
	void vPrSeSing(){
		//apathat अपठत्
		if(s.length>2 && s[l-2]==2360 && s[l-1]==2367)
			pos(221);
	}
	void vPrSeDual(){
		if(s.length>2 && s[l-2]==2341 && s[l-1]==2307)
			pos(222);
	}
	void vPrSePlu(){
		if(s.length>2 && s[l-1]==2341)
			pos(223);
	}
}
