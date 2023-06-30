import java.util.Arrays;
import java.util.Scanner;
// timeComplexity
// bestCase : O(n)
// averageCase : O(n^2)
// worstCase : O(n^2)
public class bubbleSort {
        public static void main(String args[]){

                Scanner sc = new Scanner(System.in);
                int arr[]=new int[]{5,6,8,7,1,2,3,10,1,2,2,2};
                System.out.println("Before Sorting : "+Arrays.toString(arr));
                for(int i=0;i<arr.length-1;i++){
                        for(int j=0;j<arr.length-i-1;j++){
                                if(arr[j]>arr[j+1]){
                                        swap(arr, j, j+1);
                                }
                        }
                }
                System.out.println("After Sorting : "+Arrays.toString(arr));
                sc.close();

        }

        private static void swap(int[] arr, int i, int j) {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
        }
}
