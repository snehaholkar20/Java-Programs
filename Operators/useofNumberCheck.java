//Program for Check Number is Positive or Negative or Zero
class NumberCheck
{
  NumberCheck(int num)
 {
  if(num>0)
  {
    System.out.println(num+":is Positive.");
  }
   else if(num<0)
  {
   System.out.println(num+":is Negative.");
  }
   else
  {
   System.out.println("The Number Is Zero.");
  }
 }
}
class useofNumberCheck
{
  public static void main(String args[])
  {
   NumberCheck obj=new NumberCheck(18);
   NumberCheck obj1=new NumberCheck(-20);
   NumberCheck obj2=new NumberCheck(0);
  }
}

   