/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Share{
    void show(String msg){
        try{
            System.out.println("["+msg);
            Thread.sleep(500);
            System.out.println("]");
        }catch(Exception e){
            
        }
    }
}
class Test implements Runnable{
    Thread t;
    String str;
    Share ob;
    Test(String n, Share ob){
        str=n;
        ob=ob1;
        t= newThread(this);
        t.start();
    }
    @Override
    public void run(){
        ob.print(str);
    }
}
public class Main
{
	public static void main(String[] args) throws Exception {
		Share ob=new Share();
		Test t1=new Test("A",ob);
		Test t2=new Test("B",ob);
		Test t3=new Test("C",ob);
		try{
		    t1.t.join();
		    t2.t.join();
		    t3.t.join();
		    
		}catch(Exception e){
		    
		}
	}
}
