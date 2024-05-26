import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(generateWord(8));
    }
    public static String generateWord(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append((char) ThreadLocalRandom.current().nextInt('a', 'z' + 1));
        }
        return sb.toString();
    }
}