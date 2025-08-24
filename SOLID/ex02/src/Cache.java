public class Cache {
    private Frame lastFrame;
    
    public void store(Frame frame) {
        this.lastFrame = frame;
    }
    
    public void showStatus() {
        System.out.println("Cached last frame? " + (lastFrame != null));
    }
}
