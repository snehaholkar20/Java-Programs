//2-D Array program 2
 class Array2D2
  { 
   public static void main(String args[])
    {
      int[] []num=new int[3][3];
        int r,c;
        num[0][1]=24;
        num[1][1]=20;
        num[2][2]=44;
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