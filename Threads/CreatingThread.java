//Creating Thread
class MyThread extends Thread
{
 public void run()
 {
  System.out.println("Thread is Creating");
 }
}
class CreatingThread
{
 public static void main(String args[])
 {
  MyThread obj=new MyThread();
   obj.start();
 }
}
