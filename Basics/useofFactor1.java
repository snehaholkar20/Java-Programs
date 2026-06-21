//Factor of Number using Constructor
class Factor
{
 int num;
 Factor(int x)
 {
   num=x;
 }
  public void dispData()
 {
  int i=1;
  System.out.println("Factor of:"+num+"are");
   while(i<=num)
   {
    if(num % i==0)
     {
    System.out.print("  "+i);
     }
    i++;
   }
 }
}
class useofFactor1
{
 public static void main(String args[])
 {
  Factor obj=new Factor(10);
  obj.dispData();
 }
}
    