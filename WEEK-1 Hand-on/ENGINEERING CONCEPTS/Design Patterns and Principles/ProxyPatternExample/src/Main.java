public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");
        image.display();  // Loads and displays
        image.display();  // Only displays (cached)
    }
}
