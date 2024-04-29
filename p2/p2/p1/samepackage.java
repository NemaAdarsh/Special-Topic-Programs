package p1;  //same package different class (default,protected,public)
class samepackage
{
	samepackage()
	{
		protection p = new protection(); //creating an instance of protection because same package
		System.out.println("Samepackage Constructor");
		System.out.println("n = " + p.n);
		//System.out.println("n_pri " + p.n_pri);
		System.out.println("n_pro = " + p.n_pro);
		System.out.println("n_pub = " + p.n_pub);
	}
}