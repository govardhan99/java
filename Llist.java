import java.util.*;
class Llist{
 public static void main(String[] args){

  int i,j;
  List<Integer>  l=new LinkedList<>();

  l.add(777);
  l.add(8888);
  l.add(545);
  l.add(898);
  l.add(9876);
  System.out.println(l);
  System.out.println("Size of the list :"+l.size());
 
    Iterator<Integer> itr=l.iterator();  
    while(itr.hasNext()){  
    System.out.println(itr.next()); 
    }
   i=l.get(1);
   j=l.remove(2);
  System.out.println("The accessed element is:"+i);
  System.out.println("The removed element is:"+j);
  System.out.println("The last index of list is :"+l.lastIndexOf(0));
   l.toString();
  System.out.println(l);
  l.clear();
  System.out.println("After clear:"+l);

}
}