class MethodOverride
{
 public void display()
 {
  System.out.println("I am From Parent");
 }
}
class Method extends MethodOverride
{
 public void display()
 {
  System.out.println(" I am From Child");
 }
}
class MethodOverriding
{
 public static void main(String args[])
 {
  Method obj=new Method();
  obj.display();
  MethodOverride m1=new MethodOverride();
  m1.display();
 }
}