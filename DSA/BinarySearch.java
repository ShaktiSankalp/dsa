public class BinarySearch {

    public static int binarySearch(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6,7,8,9};
        int t = 89;
        System.out.println(binarySearch(a, t));

    }
    
}
