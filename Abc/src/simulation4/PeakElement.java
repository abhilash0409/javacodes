package simulation4;


public class PeakElement {
    public static int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 20, 4, 1, 0};
        int output = findPeakElement(nums);
        System.out.println("Peak element's index: " + output);

        int[] nums2= {10, 20, 15, 5, 2};
        output = findPeakElement(nums2);
        System.out.println("Peak element's index: " + output);

        int[] nums3 = {5, 10, 20, 19, 6};
        output = findPeakElement(nums3);
        System.out.println("Peak element's index: " + output);
    }
}
