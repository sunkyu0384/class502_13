package exam01;

import java.util.Arrays;

public class ex01 {
    public static void main(String[] args) {
        String[] fruits = { "Apple", "Orange", "Apple", "Banana", "Melon", "Mango"};

        int[] nums = Arrays.stream(fruits).distinct().mapToInt(String::length).toArray();

        System.out.println(Arrays.toString(nums));
    }
}
