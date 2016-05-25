package parser1;

public class VPaFirstPerson extends VPast {
	char s[]=str.toCharArray();
	int l=s.length;
	void start()
	{
		vPaFirstp();
	}
	
	void vPaFirstp()
	{
		/*if(flag==0)vPaFiSing();
		if(flag==0)vPaFiDual();
		if(flag==0)vPaFiPlu();*/
		vPaFiSing();
		vPaFiDual();
		vPaFiPlu();
	}
	void vPaFiSing(){
		//apathat अपठत्
		if(s.length>2 && s[0]==2309 && s[l-2]==2340 && s[l-1]==2381)
			pos(111);
	}
	void vPaFiDual(){
		if(s.length>4 && s[0]==2309 && ((s[l-4]==2340 && s[l-3]==2366 && s[l-2]==2350 && s[l-1]==2381)||(s[l-3]==2340 && s[l-2]==2366 && s[l-1]==2350)))
			pos(112);
	}
	void vPaFiPlu(){
		if(s.length>2 && s[0]==2309 && ((s[l-2]==2344 && s[l-1]==2381)||(s[l-1]==2344)))
			pos(113);
	}
}
