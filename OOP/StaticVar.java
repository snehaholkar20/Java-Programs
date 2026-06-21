class SRH
{
  int no;
  static int count;
  SRH()
 {
  no++;
  count++;
 }
static void Show()
 {
  System.out.println("Count="+count);
 }
public void Open()
 {
  System.out.println("NO="+no);
 }
}
class StaticVar
{
public static void main(String args[])
 {
  SRH obj=new SRH();
  obj.Open();
  SRH.Show();
  obj.Open();
  SRH.Show();
 }
}