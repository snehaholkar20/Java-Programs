//Running Thread
class MyRunnable implements Runnable
{
 public void run()
 {
 System.out.println("Thread is Running...");
 }
}
class RunningThread
{
 public static void main(String args[])
 {
  Thread obj=new Thread(new MyRunnable());
   obj.start();
  System.out.println("Main Running Thread...");
 }
}