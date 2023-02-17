

public class D {

    public static void main(String[] args) {

        Square mySquare = new Square(5.0);
        System.out.println(mySquare.getArea());
        System.out.println(mySquare.getPerimeter());
        System.out.println(mySquare.toString());



    }
}

class Square {
    public double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square with side " + side;
    }


}
//





