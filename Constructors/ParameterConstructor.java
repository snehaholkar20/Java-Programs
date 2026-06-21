//Program for Parameterized Constructor
 class Constructor12
  {
   int no;
   String sname;
   double per;
   Constructor12(int x, String s,double y)
    {
     no=x;
     sname=s;
     per=y;
    }
 public void dispData()
     {
     System.out.println("No="+no);
     System.out.println("Name="+sname);
     System.out.println("Per="+per);
     }
  }
class ParameterConstructor
  {
   public static void main(String args[])
    {
     Constructor12 obj=new Constructor12(18,"Sneha",82.0);
     obj.dispData();
    }
  }

