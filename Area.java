class Rectangle {
    int width;
    int height;
    Rectangle() {
        width = 1;
        height = 1;
    }
    Rectangle(int w, int h) {
        width = w;
        height = h;
    }
    void printArea() {
        int area = width * height;
        System.out.println("Area: " + area);
    }
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        System.out.print("Default constructor - ");
        rect1.printArea();
        Rectangle rect2 = new Rectangle(5, 3);
        System.out.print("Parameterized constructor by PRATIMA JHA- ");
        rect2.printArea();
    }
}