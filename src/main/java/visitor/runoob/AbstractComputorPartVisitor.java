package visitor.runoob;

public abstract class AbstractComputorPartVisitor implements ComputorPartVisitor {

    @Override
    public void visit(Keyboard keyboard) {
        throw new RuntimeException("not support");
    }

    @Override
    public void visit(Mouse mouse) {
        throw new RuntimeException("not support");
    }
}
