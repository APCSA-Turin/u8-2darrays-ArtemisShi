public class FunWith2DArrays {
    
   static int totalElements(int[][] arr){
    int count=0;
    for(int i=0; i<arr.length;i++){
        for(int j=0; j<arr[0].length;j++){
        count++;
        }
    }
    return count;
   }
    
   static void fourCorners(String[][] arr){
    System.out.println(arr[0][0]);
    System.out.println(arr[0][arr[0].length-1]);
    System.out.println(arr[arr.length-1][0]);
    System.out.println(arr[arr.length-1][arr[0].length-1]);
   }

   static void swapFrontAndBackRows(String[][] arr){
    String[] place = arr[0];

    arr[0]=arr[arr.length-1];
    arr[arr.length-1]=place;

   }
}
