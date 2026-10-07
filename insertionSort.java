package edu.princeton.cs.algs4;

public class insertionSort{
    public static void printArray(int[] arr){
        for(int a = 0; a <arr.length; a++){
            System.out.print(arr[a] + " ");
        }
        System.out.println();
    }
    public static void insertIntoSorted(int[] arr){
        int n = arr.length;
        int x = arr[n - 1];
        for(int i = n - 1; i >= 0; i--){
            if(x < arr[i - 1]){
                arr[i] = arr[i - 1];
                printArray(arr);
            }
            else{
                arr[i] = x;
                printArray(arr);
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 4};
        insertIntoSorted(arr);
    }
}

