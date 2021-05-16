package visitor;

public interface Visitor {
    public void visit(PDFFile resourceFile);
    public void visit(PPTFile pptFile);
}
