class Factorial
{
 int num;
 long fact;
 int i;
 Factorial()
 {
  num=20;
  fact=1;
  i=1;
 }
 public void dispData()
 {
  while(i<=num)
  {
   fact=fact*i;
   i++;
  }
 System.out.println("Factorial of "+ num +" is :" + fact);
 }
}
class useofFactorial
{
 public static void main(String args[])
 {
  Factorial obj=new Factorial();
   obj.dispData();
 }
}