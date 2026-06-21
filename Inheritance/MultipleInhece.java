//Multiple Inheritance
interface Multiple
{
 public void Data(); 
}
class MultipleCls
{
 public void Data()
 {
  System.out.println("Method of Interface");
 }
public void Show()
 {
  System.out.println("Method of Class");
 }
} 
class MultiInherit extends MultipleCls implements Multiple
{
 public void Display()
 {
  System.out.println("Class of Multiple Inheritance");
 }
}
class MultipleInhece
{
 public static void main(String args[])
 {
  MultiInherit obj=new MultiInherit ();
   obj.Data();
   obj.Show();
   obj.Display();
 }
}