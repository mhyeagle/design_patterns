package visitor;

public class CompressorVisitor implements Visitor {
    @Override
    public void visit(PDFFile resourceFile) {
        System.out.println("compress PDFFile");
    }

    @Override
    public void visit(PPTFile pptFile) {
        System.out.println("compress PPTFile");
    }
}
