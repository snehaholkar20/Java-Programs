class Student 
{
    String name;
    int age;
    Student()           // Constructor 1: No parameters
    {
        name = "Sneha";
        age = 18;
    }
    Student(String n)    // Constructor 2: One parameter
    {
        name = n;
        age = 19;
    }
     Student(String n, int a)         // Constructor 3: Two parameters
    {
        name = n;
        age = a;
    }
     public void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Construoverloading
{
    public static void main(String[] args)
   {
        Student obj1= new Student();               // calls Constructor 1
        Student obj2= new Student("Ram");          // calls Constructor 2
        Student obj3= new Student("Aakash",20);    // calls Constructor 3
             obj1.display();
             obj2.display();
             obj3.display();
   }
 }
