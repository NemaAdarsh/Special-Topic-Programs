class BitDemo
{
	public static void main(String[] args)
	{
		int bitmask = 0x000F;
		int val = 0x2222;
		// prints "2"
		System.out.println(val & bitmask);
	}
}

// 0000 0000 0000 1111  bitmask
// 0010 0010 0010 0010  val
// 0000 0000 0000 0010  2 = result (and gate of both of them)