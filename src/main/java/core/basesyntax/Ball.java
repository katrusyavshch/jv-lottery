package core.basesyntax;

public class Ball {
    public String color;
    public int number;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }
    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", number=" + number +
                '}';
    }
}
