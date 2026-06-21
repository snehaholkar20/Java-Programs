//2-D Array program 1
 class Array2D1
  { 
   public static void main(String args[])
    {
      int[] []num=new int[3][3];
        int r,c;
         for(r=0;r<3;r++)
         {
           for(c=0;c<3;c++)
           {
         System.out.print(" "+num[r][c]);
           }
         System.out.println(" ");
        }
     }
   }