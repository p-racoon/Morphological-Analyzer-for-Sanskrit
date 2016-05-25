package parser1;

public class VFuFirstPerson extends VFuture{
	char s[]=str.toCharArray();
	int l=s.length;
	void start()
	{
		vFuFirstp();
	}
	
	void vFuFirstp()
	{
		/* if(flag==0)vFuFiSing();
		if(flag==0)vFuFiDual();
		if(flag==0)vFuFiPlu();*/
		vFuFiSing();
		vFuFiDual();
		vFuFiPlu();
	}
	void vFuFiSing(){
		//apathat अपठत्
		if(s.length>6 && s[l-6]==2367 && s[l-5]==2359 && s[l-4]==2381 && s[l-3]==2351 && s[l-2]==2340 && s[l-1]==2367)
			pos(311);
	}
	void vFuFiDual(){
		if(s.length>6 &&  s[l-6]==2367 && s[l-5]==2359 && s[l-4]==2381 && s[l-3]==2351 && s[l-2]==2340 && s[l-1]==2307)
			pos(312);
	}
	void vFuFiPlu(){
		if(s.length>8 && s[l-8]==2367 && s[l-7]==2359 && s[l-6]==2381 && s[l-5]==2351 && s[l-4]==2344 && s[l-3]==2381 && s[l-2]==2340 && s[l-1]==2367 )
			pos(313);
	}
}

