class School extends Thread {
         Thread t;
	 String tname;
	School(String name){
                tname=name;
		
		System.out.println("creating"+tname);
	}

 public void run()
    {   
        
        try {
          	int n = 10; 
        for (int i = 0; i < n; i++) {
				System.out.println("Thread:--"+tname  + i + "is present");
				Thread.sleep(100);
        }
     }
        catch (Exception e) {
            
            System.out.println("Exception is caught");
        }
    }

 
public void start() {
		System.out.println("Starting"+tname);
		if(t==null) {
			t = new Thread(this,tname);
			t.start();

}
}
}

public class Multithread {
    public static void main(String[] args)
    {
       
            School object = new School("Student");
            object.start();
          School  obj1 = new School("teacher");
           obj1.start();
          
        }
    }
