package visitor;

public class ExtractorVisitor implements Visitor {
    @Override
    public void visit(PDFFile resourceFile) {
        System.out.println("extract PFDFile");
    }

    @Override
    public void visit(PPTFile pptFile) {
        System.out.println("extract PPTFile");
    }
}
