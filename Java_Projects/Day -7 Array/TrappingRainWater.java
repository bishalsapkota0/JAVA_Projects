/**
 * TrappingRainWater
 */
public class TrappingRainWater {
    public static int trappedRainwater (int height[], int height.length){
        //calculate left max boundry-array
         int leftMax [] = new int[height.length];
         leftMax[0]=height[0];
         for(int i = 1; i<height.length;i++){
            leftMax[i]= Math.max(height[i], height[i-1]);
         }

        //claculate right max boundry --array
         int rightMax[] = new int[height.length];
        rightMax[height.length-1]= height[height.length];
        for (int i= height.length-2; i>=0; i--) {
            rightMax[i]= Math.max(height[i], height[i+1]);


            
        }
         int trappedwater= 0;
        //loop
        for(int i = 0 ; i< height.length; i++)
        {
               int waterLevel = Math.min(leftMax[i], rightMax[i]);
                trappedwater += waterLevel - height[i];
        }
        return trappedwater;
        //water lever = min(leftmax bound , right max boundry)
        //trapped water  = water level  - size of that block ie.height[i]
    }
public static void main(String[] args) {
    int height[]={4,2,0,6,3,2,5};
   System.out.println(trappedRainwater(height, height.length));
}
   
}