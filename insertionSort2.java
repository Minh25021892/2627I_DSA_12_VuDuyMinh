package edu.princeton.cs.algs4;

public class insertionSort2 {
    public static void printArray(int[] arr){
        for(int a = 0; a <arr.length; a++){
            System.out.print(arr[a] + " ");
        }
        System.out.println();
    }
    public static void insertionSort(int[] arr){
        for(int i = 1; i <arr.length; i++){
            int temp = arr[i];
            int j;
            for(j = i - 1; j >= 0; j--){
                if(arr[j] > temp){
                    arr[j+1] = arr[j];
                    printArray(arr);
                }
                else{
                    break;
                }
            }
            arr[j+1] = temp;
            printArray(arr);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 6, 3, 2, 8, 5, 4, 7, 9};
        insertionSort(arr);
    }
}
