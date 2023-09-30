public class gettersandsetters {
    public static void main(String[] args) {
        Pen p1 = new Pen();//constructor - > to allocate memory
        p1.setColor("Blue");
        p1.settip(5);
        //System.out.println(p1.tip);
        //System.out.println(p1.color);
        System.out.println(p1.getTip());
        System.out.println(p1.getColor());
        
    } 
}
    class Pen{
      private  String color;
       private int tip;

        String getColor(){
            return this.color;  //this is current object
        }
        int getTip()
        {
            return this.tip;
        }
        void setColor(String newColor)
        {
            color = newColor;
        }
        void settip(int num){
            tip = num;
        }
    }

