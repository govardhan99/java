interface AnimalColor {
   void color();
}
interface AnimalState {
   void run();
   void eat();
}
class Animal implements AnimalEat, AnimalState {
  public void color(){
   System.out.println("Animal is Brown in colour");
}
   public void eat() {
      System.out.println("Animal is eating");
   }
   public void run() {
      System.out.println("Animal is travelling");
   }
}
public class MultipleI {
   public static void main(String args[]) {
      Animal a = new Animal();
      a.eat();
      a.run();
      a.color();
   }
}