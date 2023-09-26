public class a3 {
public static void update(int marks[]){
    for(int i = 0 ; i<marks.length;i++){
        marks[i] +=1;
    }
    
}
     public static void main(String[] args) {
        int marks []={10,20,30};
        update(marks);

        //to prove array is under passed by reference i.e any changes made in any function will affefct orginal arra
        
        for(int i =0 ;i<marks.length; i++){

        System.out.println(marks[i]);
    }

    }
}
