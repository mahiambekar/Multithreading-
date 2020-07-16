/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Test implements Runnable{
    Thread t;
    Test(){
        t=new Thread(this);
        t.start();
    }
    @Override
    public void run(){
        int i;
        try{
            for(i=0;i<5;i++){
                System.out.println("Child Thread"+i);
                Thread.sleep(500);
            }
        }catch(Exception e){
            
        }
        
    }
}
public class Main
{
	public static void main(String[] args) {
		Test t1=new Test();
		int i;
		try{
		    for(i=0;i<5;i++){
		        System.out.println("Main thread"+i);
		        Thread.sleep(1000);
		    }
		}catch(Exception e){
		    
		}
	}
}
