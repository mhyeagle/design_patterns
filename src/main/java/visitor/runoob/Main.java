package visitor.runoob;

public class Main {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard();
        keyboard.accept(new Keyboard.KeyboardVisitor());
    }
}
