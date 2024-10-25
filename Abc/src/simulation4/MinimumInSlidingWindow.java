package simulation4;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class MinimumInSlidingWindow {


    public static void main(String[] args) {
        int[] nums = {9, 1, 3, -1, 5, 3, 6, 7};
        int k = 3;
        List<Integer> result = minSlidingWindow(nums, k);
        System.out.println(result);
    }

    private static List<Integer> minSlidingWindow(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        if (nums == null || nums.length == 0 || k <= 0) {
            return result;
        }

        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {

            if (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }

            while (!deque.isEmpty() && nums[deque.peekLast()] > nums[i]) {
                deque.pollLast();
            }
            deque.offer(i);

            if (i >= k - 1) {
                result.add(nums[deque.peek()]);
            }
        }
        return result;
    }
}




