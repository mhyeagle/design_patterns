package proxy.java_dynamic_proxy;

public class RealService implements IService {
    @Override
    public void sayHello() {
        System.out.println("RealService say hello!");
    }
}
