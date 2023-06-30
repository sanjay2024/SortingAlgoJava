import java.util.Arrays;
//Time Complexity
//BesCase : O(n+k)
//AvergeCase : O(n+k)
//Worst Case : O(n+k)
public class cycleSort {
         public static void sort(int nums[]){
                int i=0;
                while(i<nums.length){
                        int correct=nums[i]-1;
                        if(nums[i]!=nums[correct])swap(nums,i,correct);
                        else i++;    
                }
        }
        private static void swap(int[] nums, int i, int correct) {
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
        }
        public static void main(String args[]){
                int arr[]={1,5,6,9,7,2,3,4,8};
                System.out.println("BeforeSort: "+Arrays.toString(arr));
                sort(arr);
                System.out.println("AfterSort: "+Arrays.toString(arr));
        }
}
