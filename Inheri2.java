
class Human1
{
 //private String name;
 int age;
 Human1()
 {

System.out.println("Human class constructor");
 }
 void sleep()
 {
  age=18;
  System.out.println("Human needs good sleep");
  System.out.println(age);

 }


}

class Student1 extends Human1
{
 /*public Student1()
 {
  super();

 }  THIS IS AUTOMATICALLY GENERATED BEHIND THE SEEN*/  

void disp()
{
    System.out.println("the age is:"+age);
    //System.out.println("the name is:"+name);
    /*WE CAN NOT INHERIT NAME BECOUSE IT IS PRIVATE ,SO  WE CAN NOT ACCESS OUT OF
     Human1 class AND ALSO WE CAN NOT INHERIT Human1 constructor */
                                                                 
}

}

public class Inheri2 {
public static void main(String[] args) {
Student1 st1=new Student1();
 st1.sleep();
 st1.disp();   
    
}
    
}
