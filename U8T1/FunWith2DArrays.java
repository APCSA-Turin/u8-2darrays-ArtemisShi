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

   static double average(int[][] arr){
    double av=0;
    for(int[] d:arr){
        for(int ds: d){
    av+=ds;
        }
    }
        return av/totalElements(arr);
   }

   static int edgeSum(int[][] arr){
    int sum=0;
    for(int i=0;i<arr[0].length;i++){
        sum+=arr[0][i];
        sum+=arr[arr.length-1][i];
    }
    for(int i=1;i<arr.length-1;i++){
        sum+=arr[i][0];
        sum+=arr[i][arr[0].length-1];
    }
    return sum;
   }

   static int[] indexFound(String[][] arr, String target){
    int[] ind= {-1,-1};
    for(int i=0; i<arr[0].length;i++){
        for(int j=0; j<arr.length;j++){
            if(arr[j][i].equals(target)){
                ind[0]=j;
                ind[1]=i;
                return ind;
            }
        }
    }
    return ind;
   }

   static int[][] split(int[][] arr, int row, int column){
    int[][] spl=new int[row+1][column+1];
    if(arr.length>row&&arr[0].length>column){
        for(int i=0; i<=row;i++){
            for(int j=0; j<=column;j++){
                spl[i][j]=arr[i][j];
            }
        }
    }
    else{
        return new int[0][0];
    }
    return spl;
   }

   static int[][] invert(int[][] arr){
    int[][] inv= new int[arr[0].length][arr.length];
    for(int i=0; i<arr[0].length;i++){
        for(int j=0; j<arr.length;j++){
            inv[i][j]=arr[j][i];
        }
    }
    return inv;
   }
}
