public class copyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name ="Bishal";
        s1.age = 45;
        s1.pass = "abcd";

        Student s2 = new Student(s1);
        s2.pass ="xyz";

    }
    
}
class Student{
    String name ;
    int age;
    String pass;
    //constructor


    Student(Student s1){
        this.name = s1.name;
        this.age = s1.age;
    }
    Student(){
        System.out.println("Constructor is called");
    }
    Student(String name)//parameteractized 
    {
        this.name = name;
    }
    Student(int age){
        this.age = age;
    }
}
//constructor overload
 


//copy constructor _> to copy the property of obejcct one to another object
//eg . obj2 = obje 2