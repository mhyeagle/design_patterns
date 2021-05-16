package visitor;

public class PDFFile extends AbstractResourceFile {
    PDFFile(String fileName) {
        super(fileName);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
