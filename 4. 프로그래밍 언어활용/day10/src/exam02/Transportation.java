package exam02;

public enum Transportation {
    BUS(1350),
    SUBWAY(1450),
    TAXI(4800);

    private final int fare;

    Transportation(int fare) {
        this.fare = fare;
    }

    public int getFare() {
        return fare;
    }
}
