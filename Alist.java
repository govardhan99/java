import java.util.*; 
import java.util.Comparator;
class Alist{
 public static void main(String args[]){
  String i,j;
  ArrayList<String> a1=new ArrayList<String>();
    a1.add("23");
    a1.add("54");
    a1.add("87");
    a1.add("54");
    a1.add(0,"67");
    a1.set(2,"76");
    System.out.println(a1);
   i=a1.get(3);
   j=a1.remove(1);
   a1.sort(Comparator.reverseOrder());
    System.out.println("The descending order is:"+a1);
    Collections.sort(a1);
  System.out.println("The ascending array:"+a1);
  
  System.out.println("The accesed element is:"+i);
  System.out.println("The removed Element is:"+j);
   System.out.println("the array contains 67"+a1.contains("67"));
  System.out.println("the index of 67 is:"+a1.indexOf("67"));
    a1.toString();
    System.out.println(a1);
  
   
    
}
}