package Algorithm.Sort;

public class BubbleSort {

    public static void main(String[] args) {

        int[] a  ={1,6,5,6,3,56,6,9};
        bubbleSort(a);
        for(int i =0 ; i< a.length ; i++){
            System.out.println(a[i]);
        }


    }
    public static void bubbleSort(int arr[]){

        for(int i = 0; i <  arr.length -1 ; i++ ){
            for(int j  = i ; j < arr.length -i-1; j ++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
