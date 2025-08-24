public class Rectangle extends Shape {
    protected int w, h;
    
    public Rectangle() {}
    
    public Rectangle(int width, int height) {
        this.w = width;
        this.h = height;
    }
    
    void setWidth(int w) { this.w = w; }
    void setHeight(int h) { this.h = h; }
    
    public int area() { return w * h; }
}