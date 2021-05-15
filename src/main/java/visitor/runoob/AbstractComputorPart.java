package visitor.runoob;

public class AbstractComputorPart implements ComputorPart {
    private String identification;

    AbstractComputorPart(String identification) {
        setIdentification(identification);
    }

    @Override
    public void accept(ComputorPartVisitor computorPartVisitor) {
        System.out.println(identification);
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getIdentification() {
        return identification;
    }
}
