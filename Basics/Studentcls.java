//creating and using class
 class Student
  {
   int no;         //Data members
    double per;
    public void getData()      //Method Member
     {
      no=90;         
      per=90.98;
     }
    public void disData()
       {
         System.out.println("Number="+no);
         System.out.println("per="+per);
       }
  }
     //Main Method
class Studentcls
   {
    public static void main(String args[])
      {
        Student obj=new Student();         //object creation
        obj.getData();
        obj.disData();
      }
   }