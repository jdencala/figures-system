package figures;

public class Square {
    private int length;

    public Square() {}
    public Square(int length) {
        this.length = length;
    }

    //method that draws a Square
    public void drawSquare() {
        System.out.println("****************************************");
        System.out.println("Drawing a Square with length: " + length + "\n");
        System.out.println("========================================");
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println("========================================");
        //Print Area
    }

    public int calculatePerimeter() {
        return length * 4;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
