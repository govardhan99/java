class Numb{
int z;
int a,b;
 
public void add(int a,int b){
  z=a+b;
 System.out.println("the sum is:"+z);
 
 }

 public void substraction(int a,int b){
   
  z=a-b;
  System.out.println("the sub is:"+z);
   }
}
class Even extends Numb{
  public void display(){
   System.out.println("The Even numbers are factors of 2");
  }
 
}
class Odd extends Numb{
 public  void display(){
   System.out.println("odd is  + or - 1 to even");
  }
  
}
class HierarchyI{
int a,b;
 public static void main(String[] args){
   Odd obj=new Odd();
   obj.display();
  Even obj1=new Even();
   obj1.display();
   obj.add(5,3);
   obj1.substraction(6,4);
}
}