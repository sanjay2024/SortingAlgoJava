import java.util.*;
// timeComplexity
// bestCase : O(n)
// averageCase : O(n^2)
// worstCase : O(n^2)
public class insertionSort{

       public static void main(String args[]){

                Scanner sc = new Scanner(System.in);
                int arr[]=new int[]{2,45,5,15,15,15,15,145,15,15,45,45,1};
                System.out.println("Before Sorting : "+Arrays.toString(arr));
                for(int i=1;i<arr.length;i++){
                        int j=i,value=arr[i];
                        while(j>0 && arr[j-1]>value){
                                arr[j]=arr[j-1];
                                j--;
                        }
                        arr[j]=value;
                }
                System.out.println("After Sorting : "+Arrays.toString(arr));
                sc.close();

        }
}