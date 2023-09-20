import java.util.*;
public class ifelse {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int age = 16;
    if(age>=18)
    {
        System.out.println("Can Vote");
    }
    if(age>13 && age<18)
    {
        System.out.println("Teenage");
    }
    else if(age<18){
        System.out.println("Cannot vote");
    }
}
    
}