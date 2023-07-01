import java.util.*;
//Time Complexity
//BestCase :O(nlogn)
//AverageCase:O(nlogn)
// WorstCase:O(n^2)
//Space Complexity: O(1)
public class QuickSort{
        private static void quickSort(int[] nums, int start, int end) {
                if(start<end){
                        int partionsIdx=partion(nums,start,end);
                        quickSort(nums,start,partionsIdx-1);
                        quickSort(nums,partionsIdx+1,end);
                }
        }
        private static int partion(int[] nums, int start, int end) 
        {
                int pivot=nums[start];
                int i=start,j=end;
                while(i<j){
                        while(i<nums.length && nums[i]<=pivot)i++;
                        while(j>=0 && nums[j]>pivot)j--;
                        if(i<j)swap(nums,i,j);
                }
                swap(nums,start,j);
                return j;
        }
        private static void swap(int[] nums, int i, int j) {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
        }
        public static void main(String args[]){
                int nums[]={5,3,4,1,2};
                System.out.println("Before Sorting: "+Arrays.toString(nums));
                quickSort(nums, 0, nums.length-1);
                System.out.println("After Sorting: "+Arrays.toString(nums));
        }


}