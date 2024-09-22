package Array_IN_Java;

import java.util.Scanner;

class Operation_Array{
    public static void display_array(int [] arr,int value){
        for(int i=0;i<value;i++){
            System.out.print(arr[i]+" ");
        }

    }
}

public class Input_Array_from_User {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the array:-");
        int size=sc.nextInt();
        int [] arr=new int[size];
    //     // using loops
        for(int i=0;i<size;i++){
            System.out.print("Enter "+i+" Element of array:-");
            arr[i]=sc.nextInt();
        }
    //     // Print array
    //     System.out.println("Printing Array:))");
    //     for(int i=0;i<size;i++){
    //         System.out.print(arr[i]+" ");
    //     }

    // Make A function TO print array:
    System.out.println("Printing Array:))");
    Operation_Array.display_array(arr, size);






    }
    
}
