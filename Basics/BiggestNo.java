//Display Biggest No of Two No
class BigNo
 {
   public void No(int a,int b)
   {
    if(a>b)
     {
     System.out.println("Big="+a);
     }
   else
     {
    System.out.println("Big="+b);
     }
   }
 }
 class BiggestNo
 {
  public static void main(String args[])
   {
     BigNo obj=new BigNo();
     obj.No(20,24);
   }
 }