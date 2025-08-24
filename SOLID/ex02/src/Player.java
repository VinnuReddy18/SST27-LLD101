public class Player {
    Decoder decoder = new Decoder();
    Display display = new Display();
    Cache cache = new Cache();

    void play(byte[] fileBytes) {
        Frame frame = decoder.decode(fileBytes);
        display.showPlaying(fileBytes.length);
        cache.store(frame);
        cache.showStatus();
    }
}