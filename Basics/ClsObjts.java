class ClsObjt
{
  int rno;
  String name;
public void getData()
 {
  rno=418;
  name="Sneha";
 }
public void disData()
 {
System.out.println("ROLL NO:"+rno);
System.out.println("Name:"+name);
}
}
class ClsObjts
{ 
 public static void main(String args[])
 {
  ClsObjt obj= new ClsObjt();
  obj.getData();
  obj.disData();
 }
}
 
 

