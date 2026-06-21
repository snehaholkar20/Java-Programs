interface A
{
public void calc(int x,int y);
}
class B implements A
{
public void calc(int x , int y)
 {
 System.out.println("Addition is ="+(x+y));
 }
}
class Interface
{
 public static void main(String args[])
 {
 B obj=new B();
 obj.calc(15,18);
 }
}