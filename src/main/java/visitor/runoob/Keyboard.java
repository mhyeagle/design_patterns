package visitor.runoob;

public class Keyboard extends AbstractComputorPart {
    Keyboard() {
        super("keyBoard_v1");
    }

    @Override
    public void accept(ComputorPartVisitor computorPartVisitor) {
        computorPartVisitor.visit(this);
    }

    public static class KeyboardVisitor extends AbstractComputorPartVisitor {
        @Override
        public void visit(Keyboard keyboard) {
            System.out.println(keyboard.getIdentification());
        }
    }
}
