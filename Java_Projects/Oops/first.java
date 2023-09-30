
 public class first {
  public static void main(String[] args) {
    Pen p1 = new Pen(); //created new object for class pen
    //new keyword is nothing but keyword to reserve memory in heap
    p1.setColour("Blue");
    p1.setTip(5);
    System.out.println(p1.tip);
    System.out.println(p1.colour);

    
  }
    
 }
 class Pen{

    String colour ;
    int tip;
    void setColour(String newColour)
    {
        colour = newColour;
    }
    void setTip(int newTip)
    {
        tip= newTip;
    }
 }
 class Student{
    int age;
    String name ;
    int percent;

    void calPercent(int phy, int chem, int math){
        percent = (phy +chem +math)/3 ;
    }

 }
 class Nepal{

 }