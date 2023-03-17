package mate.academy;

public class BinaryString {

    public static void main(String[] args) {
        System.out.println(toBinaryString(23));
    }
    public static String toBinaryString(int value) {
        int x = value;
        int y;
        StringBuilder builder = new StringBuilder();
        while (x != 0) {
            y = x % 2;
            x = x / 2;
            builder.append(y);
        }
        return builder.reverse().toString();
    }
}
