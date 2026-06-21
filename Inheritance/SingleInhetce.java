//Single Inheritance
class Student
{
 int rno;
 String sname;
 public void getData(int x,String s)
 {
  rno=x;
  sname=s;
 }
 public void disData()
 {
  System.out.println("Roll No:"+rno);
  System.out.println("Name:"+sname);
 }
}
class Teacher extends Student
{
 double Salary;
 public void getSalary(double r)
 {
  Salary=r;
 }
 public void disSalary()
 {
 System.out.println("Salary="+Salary);
 }
}
class SingleInhetce
{
 public static void main(String args[])
 {
  Teacher obj=new Teacher ();
   obj.getData(418,"Sneha");
   obj.getSalary(1234.45);
   obj.disData();
   obj.disSalary();
 }
}
   