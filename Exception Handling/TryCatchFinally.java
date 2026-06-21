//Try Catch Finally Example
class TryCatchFinally
{
 public static void main(String args[])
 {
  try
  {
   int divisor = 0;
   int num = 10 / divisor;
   System.out.println(num);
  }
  catch(ArithmeticException obj)
  {
  System.out.println("Error:Divided by zero!");
  }
  finally
  {
   System.out.println("this block always run");
  }
 }
}