public class adsa {
    public static void main(String[] args) {
        int[][] arr1 = new int[2][3];
        String[][] arr2 = new String[4][2];

        for(int[] d: arr1){
            for(int p: d){
                System.out.print(p +" ");
            }
            System.out.println();
        }
    
    for(String[] l: arr2){
        for(String f: l){
            System.out.print(f +" ");
        }
        System.out.println();
    }

    arr1[0][0]=1;
    arr1[0][1]=2;
    arr1[0][2]=3;
    arr1[1][0]=4;
    arr1[1][1]=5;
    arr1[1][2]=6;

    arr2[0][0]="a";
    arr2[0][1]="b";
    arr2[1][0]="c";
    arr2[1][1]="d";
    arr2[2][0]="e";
    arr2[2][1]="f";
    arr2[3][0]="g";
    arr2[3][1]="h";

    // int ad=1;
    // for(int i=0; i<arr1.length;i++){
    //     for(int j=0;j<arr1[0].length;j++){
    //         arr1[i][j]=ad;
    //         ad++;
    //     }
    // }

    for(int[] d: arr1){
        for(int p: d){
            System.out.print(p +" ");
        }
        System.out.println();
    }

    for(String[] l: arr2){
        for(String f: l){
            System.out.print(f +" ");
        }
        System.out.println();
    }

}
}
