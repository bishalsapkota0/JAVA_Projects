public class half_pyramid {
    public static void main(String[] args) {
        for(int line = 1 ; line<= 4; line++)
        {
            for(int chars = 1 ; chars<= line; chars++){
                System.out.print(chars);
            }
            System.out.println();
        }
    }
}
