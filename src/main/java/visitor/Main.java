package visitor;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----visitor-----");
        List<ResourceFile> files = listAllFiles();
        ExtractorVisitor extractorVisitor = new ExtractorVisitor();
        for (ResourceFile resourceFile : files) {
            resourceFile.accept(extractorVisitor);
        }

        CompressorVisitor compressorVisitor = new CompressorVisitor();
        for (ResourceFile resourceFile : files) {
            resourceFile.accept(compressorVisitor);
        }
    }

    private static List<ResourceFile> listAllFiles() {
        List<ResourceFile> files = new LinkedList<>();
        files.add(new PDFFile("pdfFile"));
        files.add(new PPTFile("pptFile"));

        return files;
    }
}
