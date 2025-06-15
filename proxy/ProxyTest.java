package proxy;

public class ProxyTest {
    public static void main(String[] args) {
        Image img1 = new ProxyImage("mountains.jpg");

        // First time - loads from server
        img1.display();
        System.out.println();

        // Second time - uses cached
        img1.display();
        System.out.println();

        // Another image
        Image img2 = new ProxyImage("river.png");
        img2.display();
    }
}
