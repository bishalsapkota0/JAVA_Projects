public class paraconstructor {
    public static void main(String[] args) {
        Student s2 = new Student("Shradha");
        Student s3 = new Student(123);
    }
    
}
class Student{
    String name ;
    int age;
    //constructor
    Student(String name)//parameteractized 
    {
        this.name = name;
    }
    Student(int age){
        this.age = age;
    }
}