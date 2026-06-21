interface A
{
 public void Data();
}
class B implements A
{
 public void Data()
 {
  System.out.println("I am From A");
 }
 public void Show()
 {
 System.out.println("I am from B");
 }
}
class InterfaceEx
{
public static void main(String args[])
 {
  B obj=new B();
  obj.Data();
  obj.Show();
 }
}