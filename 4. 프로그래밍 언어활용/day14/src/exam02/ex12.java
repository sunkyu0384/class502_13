package exam02;

import java.util.Arrays;

public class ex12 {
    public static void main(String[] args) {
        int[] nums = { 33, 10, 4, 1, 3, 88, 100, 10 };
        int[] nums2 = Arrays.stream(nums).sorted().toArray();
        System.out.println(Arrays.toString(nums2));
    }
}
