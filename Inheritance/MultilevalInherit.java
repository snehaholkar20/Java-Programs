//MultiLeval Inheritance
class Person
{
 String sname;
 public void getData(String s)
 {
  sname=s;
 }
public void disData()
 { 
  System.out.println("Student Name:"+sname);
 }
}
class Student extends Person
{
 int rno;
 String cls;
 public void getInfo(int x,String c)
 {
  rno=x;
  cls=c;
 }
 public void disInfo()
 {
 System.out.println("Roll No:"+rno);
 System.out.println("Class:"+cls);
 }
}
class Percentage extends Student
{
 double per;
 public void getPer(double y)
 {
  per=y;
 }
 public void disPer()
 {
 System.out.println("Percentage:"+per);
 }
}
class MultilevalInherit
{
public static void main(String args[])
 {
  Percentage obj=new Percentage();
  obj.getData("Sneha");
  obj.getInfo(418,"BSC.CS.SY");
  obj.getPer(82.00);
  obj.disData();
  obj.disInfo();
  obj.disPer();
 }
}
 
