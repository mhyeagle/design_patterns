package visitor;

public abstract class AbstractResourceFile implements ResourceFile {
    private String fileName;

    public AbstractResourceFile(String fileName) {
        this.fileName = fileName;
    }
}
