//Big No in Constructor
 class BigNo
  {
    BigNo(int x,int y)
    {
     if(x>y)
      {
       System.out.println("Big No="+x);
      }
     else
      {
       System.out.println("BigNo="+y);
      }
    }
  }
class useofBigNo
 {
  public static void main(String args[])
   {
     BigNo obj=new BigNo(20,24);
   }
 }