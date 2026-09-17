package net.javaguides.java.RECURSION;

public class sorting {
    public static boolean isSorted(int arr[],int idx){
        if(idx==arr.length-1){
            return true;
            
        }
        if(arr[idx]<arr[idx+1]){
            return isSorted(arr, idx+1);
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,3,7,9};
        System.out.println(isSorted(arr1, 0));
    }
    
}
