package net.javaguides.java;

public class selectionSort {
    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
       

    }
    public static void main(String[] args) {
        int arr[]={2,4,9,1,7};
        for(int i=0;i<arr.length-1;i++){
            int selection=i;{
                for(int j=i+1;j<arr.length;j++){
                    if(arr[selection]>arr[j]){
                        selection=j;
                    }
                   

                }
                 int temp=arr[selection];
                    arr[selection]=arr[i];
                    arr[i]=temp;
            }
            printArray(arr);
        }
    }
    
}
