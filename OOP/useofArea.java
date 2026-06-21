class Area
{ 
//Area of Circle
 double pi=3.142;
 public void Area(double r)
  {
   double A=pi*r*r;
   System.out.println("Area of Circle="+A);
  }
//Area of Triangle
 int area,base,height;
 public void Area(int base,int height)
  {
   area=((base*height)/2);
   System.out.println("Area of Triangle="+area);
  }
 //Area of Rectangle
 long a,length,width;
  public void Area(long length,long width)
 {
 a=length*width;
 System.out.println("Area of Rectangle="+a);
 } 
}
class useofArea
{ 
 public static void main(String args[])
 { 
  Area obj=new Area();
  obj.Area(4);
  obj.Area(5,10);
  obj.Area(4L,4L);
 }
}

