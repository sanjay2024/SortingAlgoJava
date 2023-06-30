import java.util.Arrays;
//Time Complexity
// BestCase: O(nlogn);
// AvergeCase: O(nlogn)
// WorstCase: O(nlogn);
//Space Complexity---> O(n) for extra array for merging
public class MergeSort{
        static public void sort(int nums[],int start,int end){
                if(start>=end)return;
                int mid=(start+end)/2;
                sort(nums,start,mid);
                sort(nums,mid+1,end);
                merge(nums,start,mid,end);
                
        }
        private static void merge(int[] nums, int start, int mid, int end) {
                int n1=mid-start+1;
                int n2=end-mid;
                int arr1[]=new int[n1];
                int arr2[]=new int[n2];
                for(int i=0;i<n1;i++)arr1[i]=nums[start+i];
                for(int i=0;i<n2;i++)arr2[i]=nums[mid+1+i];  
                int i=0,j=0,k=start;
                while(i<n1 && j<n2){
                        if(arr1[i]<=arr2[j])nums[k++]=arr1[i++];
                        else nums[k++]=arr2[j++];
                }
                while(i<n1)nums[k++]=arr1[i++];
                while(j<n2)nums[k++]=arr2[j++];

        }
        public static void main(String args[]){
                int nums[]={5,3,4,1,2};
                System.out.println("Before Sorting: "+Arrays.toString(nums));
                sort(nums, 0, nums.length-1);
                System.out.println("After Sorting: "+Arrays.toString(nums));
        }

}