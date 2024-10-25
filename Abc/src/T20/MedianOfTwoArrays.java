package T20;
import java.util.Arrays;

public class MedianOfTwoArrays {

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 5, 8};
        int[] arr2 = {10, 12, 14, 16, 18, 20};
        System.out.println("The median is: " + findMedianofArray(arr1, arr2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = mergeArrays(nums1, nums2);
        int n = mergedArray.length;

        if (n % 2 == 0) {
            return (mergedArray[n / 2 - 1] + mergedArray[n / 2]) / 2;
        } else {
            return mergedArray[n / 2];
        }
    }

    public static int[] mergeArrays(int[] nums1, int[] nums2) {

        int[] mergedArray = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, mergedArray, 0, nums1.length);
        System.arraycopy(nums2, 0, mergedArray, nums1.length, nums2.length);
        Arrays.sort(mergedArray);

        return mergedArray;
    }

    public static int[] mergeTwoArray(int[] firstArray, int[] secondArray){
        int[] newArr=new int[firstArray.length+secondArray.length];

        System.arraycopy(firstArray,0,newArr,0,firstArray.length);
        System.arraycopy(secondArray,0,newArr,firstArray.length,secondArray.length);

        return newArr;
    }

    public static double findMedianofArray(int[] arr1, int[] arr2){

        double median=0.0;

        int[] mergedArray=mergeTwoArray(arr1,arr2);

        int n=mergedArray.length;

        if(n%2==0){
            return (mergedArray[n/2 - 1]+mergedArray[n/2])/2;
        }
        else
            return mergedArray[n/2];


    }
}
