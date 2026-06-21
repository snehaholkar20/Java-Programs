//Hierarchical Inheritance
class Person
{
 int code;
 String sname;
 public void getData(int x,String s) 
 {
  code=x;
  sname=s;
 }
 public void disData()
 { 
 System.out.println("CODE:"+code);
 System.out.println("Name:"+sname);
 }
}
class Teacher extends Person 
{
 double Salary;
 String subname;
 public void getInfo(double y,String n)
 {
  Salary=y;
  subname=n;
 }
 public void disInfo()
 {
 System.out.println("Teacher Salary:"+Salary);
 System.out.println("Subject Name:"+subname);
 }
}
class Student extends Person
{
 String cls;
 String sub;
 public void getStu(String h,String r)
 {
  cls=h;
  sub=r;
 }
 public void disStu()
 {
 System.out.println("Class:"+cls);
 System.out.println("Subject:"+sub);
 }
}
class HierarchicalIn 
{
 public static void main(String args[])
 {
  Teacher t1=new Teacher();
   t1.getData(101,"Panchal");
   t1.getInfo(1234.56,"JAVA");
   t1.disData();
   t1.disInfo();
 System.out.println("---------------");
  Student s1=new Student();
   s1.getData(418,"Sneha");
   s1.getStu("BSC.CS.SY","DSA");
   s1.disData();
   s1.disStu();
  }
}
 
