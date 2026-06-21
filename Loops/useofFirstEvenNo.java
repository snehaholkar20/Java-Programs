//program for First10Even Numbers
class FirstEvenNo
{
  int count;
  int num;
  FirstEvenNo()
  {
   count=1; //counter for how many even number are printed
   num=2;   //Starting even number
  }
  public void dispData()
  {
    while(count<=10)
    {
       System.out.println(num);
       num+=2;   //move to next even number
       count++;  //increase the counter
    }
  }
}
class useofFirstEvenNo
{
 public static void main(String args[])
  {
   FirstEvenNo obj=new FirstEvenNo();
    obj.dispData();
  }
}


    
  
