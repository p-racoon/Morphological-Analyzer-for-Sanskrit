package parser1;

public class VPrThirdPerson extends VPresent{
	char s[]=str.toCharArray();
	int l=s.length;
	void start()
	{
		vPrThrstp();
	}
	
	void vPrThrstp()
	{
		/*if(flag==0)vPrThSing();
		if(flag==0)vPrThDual();
		if(flag==0)vPrThPlu();*/
		vPrThSing();
		vPrThDual();
		vPrThPlu();
	}
	void vPrThSing(){
		//aPrthat अपठत्
		if(s.length>2 && s[l-2]==2366 && s[l-2]==2350 && s[l-1]==2367)
			pos(231);
	}
	void vPrThDual(){
		if(s.length>3 && s[l-3]==2366 && s[l-2]==2357 && s[l-1]==2307)
			pos(232);
	}
	void vPrThPlu(){
		if(s.length>3 && s[l-3]==2366 && s[l-2]==2350 && s[l-1]==2307)
			pos(233);
	}
}
