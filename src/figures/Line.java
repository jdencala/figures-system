package figures;

public class Line {
    private int length;

    public Line() {}

    public Line(int length) {
        this.length = length;
    }

    //method that draws line
    public void drawLine() {
        System.out.println("-------------------------");
        if (length <= 1) {
            System.out.println("Line length must be > 1");
        } else {
            System.out.println("Drawing Line with length: " + length + " [u]" + "\n");
            for(int i = 0; i < length; i++) {
                System.out.print(" * ");
            }
            System.out.print("\n");
            System.out.println("-------------------------");
        }
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
