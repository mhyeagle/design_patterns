package visitor;

public class PPTFile extends AbstractResourceFile {
    PPTFile(String fileName) {
        super(fileName);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
