package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        String userString = input.getString();
        System.out.printf("User input: %s%n", userString);
        System.out.println(input.yesNo());
        System.out.println(input.getInt(1,100));
        System.out.println(input.getDouble(1,100));
        System.out.println(input.getInt());
        System.out.println(input.getDouble());
    }
}
