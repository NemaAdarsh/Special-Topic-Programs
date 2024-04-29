class program2
{
	public static void main(String[] args)
	{
		int x = 123456;
       	float f = 100.12;
        System.out.println("Integer value="+x);
        System.out.println("Float Value="+f);
    }
}

//because we didnt put suffix it treats it as float, to convert it to double we need to put suffix
//correct line is float f = 100.12F;
//this happens in semantic analysis