package exam01;

import java.util.StringTokenizer;

public class ex04 {
    public static void main(String[] args) {
        String fruits = "Apple#Orange#Melon#Banana#Mango";
        StringTokenizer st = new StringTokenizer(fruits, "#");

        while(st.hasMoreTokens()) {
            String fruit = st.nextToken();
            System.out.println(fruit);
        }
    }
}
