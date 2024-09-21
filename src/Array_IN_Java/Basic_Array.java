package Array_IN_Java;
// Collection of similar type of data
//  Data structure which store a coolection of homogenous items.
//  Array have 0 base indexing
// Contiguous memory location
public class Basic_Array{
    public static void main(String[] args) {
        // Creation array
        // Data_type [] Name_of_array=new Data_type[size]
        // int [] arr=new int[10];
        // Store data in array 
        // Method-01
        // arr[0]=12;
        // arr[1]=13;
        // arr[2]=14;
        // arr[3]=15;
        // arr[4]=16;
        // arr[5]=17;
        // arr[6]=18;
        // arr[7]=19;
        // arr[8]=20;
        // arr[9]=21;
        // Method 02:-Array Literal
        // float [] weight=new float[3];
        int [] brr={10,20,30,40,50,60,70,80,90};
        // Now Print Data in array
        // System.out.println(arr[2]);
        // we use for loops to print arrays data
        for (int i=0;i<brr.length;i++){
            System.out.print(brr[i]+" ");
        }
        System.out.println();
        // Many Data types array 
        String [] name={"Example That Provide in this aura","sandeep","Good Boy"};
        for (int i=0;i<name.length;i++){
            System.out.print (name[i]+" ");
        }



    }
}