package exam01;

import java.util.Optional;

public class ex08 {
    public static void main(String[] args) {
        String str = "ABC";
        Optional<String> opt = Optional.of(str);
        System.out.println(opt.get());
    }
}
