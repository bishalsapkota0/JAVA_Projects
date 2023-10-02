public class kunal1 {
    public static void main(String[] args) {
        Student kunal = new Student();//declearing or reference variable to reserve memory in stack
        //kunal namded variable for class type student => memory allocation
        // new variable - dinamically allocates the memory(at runtime) and
        // return a reference variable to it
        //eg. Student1  = new Student();
       System.out.println(kunal.rno);
        System.out.println(kunal); 
    }
    
    //creating class
    class Student{
        int rno  ;
        String name  ;
        float marks  ;
       } 
       //blue print 
       //templates
       //name group of properties and method/function


}
