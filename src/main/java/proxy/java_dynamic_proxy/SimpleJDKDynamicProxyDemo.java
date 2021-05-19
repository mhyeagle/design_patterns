package proxy.java_dynamic_proxy;

import java.lang.reflect.Proxy;

public class SimpleJDKDynamicProxyDemo {
    public static void main(String[] args) {
        IService realService = new RealService();

        IService proxyService = (IService) Proxy.newProxyInstance(
                IService.class.getClassLoader(),
                new Class<?>[] {IService.class},
                new SimpleInvocationHandler(realService)
        );

        proxyService.sayHello();
    }
}
