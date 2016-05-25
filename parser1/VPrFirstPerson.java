package parser1;

public class VPrFirstPerson extends VPresent{
	char s[]=str.toCharArray();
	int l=s.length;
	void start()
	{
		vPrFirstp();
	}
	
	void vPrFirstp()
	{
		/*if(flag==0)vPrFiSing();
		if(flag==0)vPrFiDual();
		if(flag==0)vPrFiPlu();*/
		vPrFiSing();
		vPrFiDual();
		vPrFiPlu();
	}
	void vPrFiSing(){
		//aPrthat अपठत्
		if(s.length>2 && s[l-2]==2340 && s[l-1]==2367)
			pos(211);
	}
	void vPrFiDual(){
		if( s.length>2 && s[l-2]==2340 && s[l-1]==2307)
			pos(212);
	}
	void vPrFiPlu(){
		if(s.length>4 &&s[l-4]==2344 && s[l-3]==2381 && s[l-2]==2340 && s[l-1]==2367 )
			pos(213);
	}
}
