class MOverri
{
 public void Show()
 {
  System.out.println("From Base Class");
 }
}
class Methorid extends MOverri
{
 public void open()
 {
 super.Show();
 System.out.println("From Child Class");
 }
}
class MethodOverride
{
 public static void main(String args[])
 {
  Methorid obj=new Methorid();
   obj.open();
 }
}