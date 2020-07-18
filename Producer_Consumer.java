/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Share{
    int a;
    int x;
    synchronized void put(int a){
        x=a;
        System.out.println("Put"+x);
    }
    synchronized void get(){
        System.out.println("Got"+x);
    }
}
class Producer implements Runnable{
    Thread t;
    Share ob;
    public Producer(Share ob1){
        
        ob=ob1;
        t=new Thread(this);
        t.start();
    }
    @Override 
    public void run(){
        int i=0;
        while(true){
            ob.put(i);
            i++;
        }
    }
}
class Consumer implements Runnable{
    Thread t;
    Share ob;
    public Consumer(Share ob1){
        ob=ob1;
        t=new Thread(this);
        t.start();
    }
    @Override 
    public void run(){
        int i=0;
        while(true){
            ob.get();
            i++;
        }
    }
    
}
public class Main
{
	public static void main(String[] args) {
		Share ob=new Share();
		Producer p=new Producer(ob);
		Consumer c=new Consumer(ob);
		try{
		    p.t.join();
		    c.t.join();
		}catch(Exception e){
		    
		}
	}
}
