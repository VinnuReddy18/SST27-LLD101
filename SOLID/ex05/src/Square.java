
public class Square extends Shape {
    private int side;
    
    public Square() {}
    
    public Square(int side) {
        this.side = side;
    }
    
    void setSide(int side) { this.side = side; }
    
    public int area() { return side * side; }
}