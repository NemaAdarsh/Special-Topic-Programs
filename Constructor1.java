class Constructor1 {

    int i;

  
    // constructor with no parameter
    private Constructor1() {
      i = 5;
      System.out.println("Constructor is called");
    }
  
    public static void main(String[] args) {
  
      // calling the constructor without any parameter
      Constructor1 obj = new Constructor1();
      System.out.println("Value of i: " + obj.i);
    }
  }