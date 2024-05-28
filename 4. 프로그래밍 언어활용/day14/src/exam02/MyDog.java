package exam02;

public class MyDog {
    public String name;
    public String type;

    public MyDog(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return type + " " + name;
    }
}