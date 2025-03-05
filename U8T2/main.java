public class main {
public static void main(String[] args) {
    /* --- PROBLEM 1 --- */
System.out.println("PROBLEM 1:");
int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};

System.out.println("---------");
// write code below that uses nested ENHANCED for loops
// to print each element in nums in ROW-MAJOR order again;
// print all the numbers in a row on the same line
// with a space in between

for(int[] d: nums){
    for(int sd: d){
        System.out.print(sd+ " ");
    }
    System.out.println();
}

// now, write code below that uses nested INDEX-BASED for loops
// to print each element in nums in ROW-MAJOR order;
// print all the numbers in a row on the same line
// with a space in between
System.out.println("---------");

for(int i=0; i<nums.length;i++){
    for(int ij=0; ij<nums[0].length;ij++){
        System.out.print(nums[i][ij] + " ");
    }
    System.out.println();
}

System.out.println("---------");
// finally, write code below that uses nested for loops
// to print each element in nums in COLUMN-MAJOR order;
// print all the numbers in a COLUMN on the same line
// with a space in between

for(int i=0;i<nums[0].length;i++){
for(int ij=0;ij<nums.length;ij++){
    System.out.print(nums[ij][i] +" ");
}
System.out.println();
}


/* --- PROBLEM 2 --- */
System.out.println("---------");
System.out.println("PROBLEM 2:");

String[][] animals = {
        {"anteater", "bird"},
        {"camel", "dog"},
        {"elephant", "giraffe"},
        {"hyena", "jackal"}
};
// write code below using a nested loop to update each element
// in animals to its plural form, e.g. bird --> birds;
// (no printing yet)

for(int i=0;i<animals.length;i++){
    for(int j=0; j<animals[0].length;j++){
        animals[i][j]=animals[i][j]+"s";
    }
}

// write code here
// next, write code below to print out the 2D
// array in column-major order, showing each
// animal in inside a bracketed "enclosure"
// using "|" (like fences separating animal pens
// in a zoo)

for(int i=0; i<animals[0].length;i++){
    for(int j=0; j<animals.length;j++){
        System.out.print("|"+animals[j][i]);
    }
    System.out.print("|");
    System.out.println();
}


}
    
}