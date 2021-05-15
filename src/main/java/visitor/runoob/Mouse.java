package visitor.runoob;

public class Mouse extends AbstractComputorPart {
    Mouse() {
        super("mouse_v1");
    }

    @Override
    public void accept(ComputorPartVisitor computorPartVisitor) {
        computorPartVisitor.visit(this);
    }

    public class MouseVisitor extends AbstractComputorPartVisitor {
        @Override
        public void visit(Mouse mouse) {
            System.out.println(mouse.getIdentification());
        }
    }
}
