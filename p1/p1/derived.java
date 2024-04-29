package p1; 
class derived extends protection //inheritance
{
	derived()
	{
		System.out.println("Derived Constructor");
		System.out.println("n = " + n);
		//System.out.println("n_priv = " + n_pri);
		System.out.println("n_pro = " + n_pro);
		System.out.println("n_pub = " + n_pub);
	}
}