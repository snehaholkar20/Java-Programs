class MOver
{
 int a,b;
 double num1,num2;
 public void Add(int x,int y)
 {
  System.out.println("Addition is="+(x+y));
 }
 public void Add(double x,double y)
 {
 double z;
  z=x+y;
  System.out.println("Addition is="+z);
 }
}
class MethodOver
{
 public static void main(String args[])
 {
  MOver obj=new MOver();
   obj.Add(20,10);
   obj.Add(20.0,30.0);
 }
}
