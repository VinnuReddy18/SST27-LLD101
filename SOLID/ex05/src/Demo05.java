
public class Demo05 {
    static int areaAfterResize(Rectangle r) {
        r.setWidth(5);
        r.setHeight(4);
        return r.area();
    }

    static int squareArea(Square s) {
        s.setSide(4);
        return s.area();
    }

    public static void main(String[] args) {
        System.out.println(areaAfterResize(new Rectangle())); // 20
        System.out.println(squareArea(new Square())); // 16

        Rectangle rect = new Rectangle(5, 4);
        Square square = new Square(4);
        System.out.println("Rectangle area: " + rect.area());
        System.out.println("Square area: " + square.area());
    }
}
