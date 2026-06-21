//Default Constructor 2
class Constructor
 {
  int no;
  String sname;
  Constructor()
   {
     no=18;
     sname="Sneha";
   }
 public void dispData()
    {
      System.out.println("No="+no);
      System.out.println("Name="+sname);
    }
 }
class defaultConstructor
 {
  public static void main(String args[])
   {
    Constructor obj=new Constructor();
    obj.dispData();
   }
 }