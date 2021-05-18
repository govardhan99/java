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
class Check extends Even{
       public void iseven(int x){
           int res;
           res=x%2;
           if(res==0){
           System.out.println("It is even");
           }
           else{
           System.out.println("It is odd");
           }
     }
}
class HybridI{
int a,b;
 public static void main(String[] args){
   Odd obj=new Odd();
   obj.display();
  Even obj1=new Even();
   obj1.display();
  Check obj2=new Check();
  obj2.iseven(7);
 obj2.display();
   obj.add(5,3);
   obj1.substraction(6,4);
}
}