package exam02;

public class ex03 {
    public static void main(String[] args) {
        String str = "ABC";
        System.out.printf("str wnth: %d%n", System.identityHashCode(str));

        str += "DEF";
        System.out.printf("str wnth: %d%n", System.identityHashCode(str));

        str += "GHI";
        System.out.printf("str wnth: %d%n", System.identityHashCode(str));
    }
}
