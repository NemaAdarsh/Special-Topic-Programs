package p2;
import p1.*;

class otherpackage
{
	otherpackage()
	{
		p1.protection p = new p1.protection();
		System.out.println("Other Package Constructor");

		//System.out.println("n = " + p.n);
		//System.out.println("n_pri = " + p.n_pri);
		//System.out.println("n_pro = " + p.n_pro);
		System.out.println("n_pub = " + p.n_pub);
	}
}
