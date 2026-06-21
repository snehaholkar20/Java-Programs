//Try Catch Example
class TryCatch
{
 public static void main(String args[])
 {
  int arr[]={11,22,33,44,55,66};
  int a=0,i,c=0;
  for(i=0;i<7;i++)
  {
    try
   {
     System.out.println("Array is="+arr[i]);
     c=arr[i]/a;
   }
    catch(Exception obj)
   {
    System.out.println("Error:"+obj.getMessage());
   }
    System.out.println("C="+c);
  }
 }
}
  
