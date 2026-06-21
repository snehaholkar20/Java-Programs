//2-D Array program 3
class Array2D
{
 public static void main(String args[])
 {
  int[][]num={{1,2,3},{4,5,6},{7,8,9}};
   int r,c;
    for(r=0;r<3;r++)
    {
     for(c=0;c<3;c++)
      {
         System.out.print("  "+num[r][c]);
      }
         System.out.println(" ");
   }
 }
}