class Const {
   String name;
   int days;

  // constructor
  Const() {
    System.out.println("Constructor Called:");
    name = "Java Project";
    days=10;
  }

  public static void main(String[] args) {

    
    Const obj = new Const();
    System.out.println("The name is " + obj.name);
    System.out.println("The no of days:" + obj.days);
  }
}