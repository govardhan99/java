
 class Vehicle {
	private int serialno=145;
	public int getSerialno() {
		return serialno;
}
	 void display() {
		System.out.println("Car");
	}
}
class Exm1 extends Vehicle {
       void run(){
          System.out.println("running");
	}

}
class MainI{

public static void main(String[] args) {
	
	       Exm1 obj=new Exm1();
		obj.display();
                obj.run();
              Vehicle obj1=new Vehicle();
               System.out.println("the s.no :" + obj1.getSerialno());
                
	}

}