package Divide_Conquer;

public class Basics {

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+ " ");
        }
    }

    public static void mergeSort(int arr[],int si,int ei){
        if(si>=ei){ // Base Case
            return;
        }
        int mid = si + ((ei-si)/2); 
        mergeSort(arr, si, mid); // left part
        mergeSort(arr, mid+1 , ei); // right part
        merge(arr, si, mid, ei); // conquer 
    }
    
    public static void merge(int[] arr , int si , int mid , int ei){
        int[] temp = new int[ei-si+1];
        int i = si; // interator for left part
        int j = mid+1; // iterator for right part 
        int k = 0; // iterator for temporary array

        while(i<=mid && j<=ei){
            if(arr[i]<=arr[j]){  // equal to condition preserves the relative order of equal elements, making Merge Sort stable.
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // reamaning left part
        while (i<=mid) {
            temp[k++] = arr[i++];
        }

        // right reamining part
        while(j<=ei){
            temp[k++] = arr[j++]; 
        }

        // Copy the temp array to arr
        for(i=si,k=0;k<temp.length;i++,k++){
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int[] arr= {1,5,2,2,3,3,4,-2};

        mergeSort(arr,0,arr.length-1);
        printArr(arr);
        

    }
    
    
}
