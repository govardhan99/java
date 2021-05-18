class Shape {
   public void display() {
      System.out.println("Inside display");
   }
}
class Rectangle extends Shape {
   public void area(int a,int b) {
     int result;
      result=a * b;
      System.out.println("The area of rectangle"+ result);
   }
}
class Cube extends Rectangle {
   public void volume(int x) {
     int res;
     res=x * x * x ;
      System.out.println("The volume of cube is:"+res);
   }
}
class Multilevel {
   public static void main(String[] arguments) {
      Cube cube = new Cube();
      cube.display();
      cube.area(3,6);
      cube.volume(6);
   }
}