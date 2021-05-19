package proxy.java_dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SimpleInvocationHandler implements InvocationHandler {
    private Object realObj;

    SimpleInvocationHandler(Object readObj) {
        this.realObj = readObj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Entering " + method.getName());
        Object result = method.invoke(realObj, args);
        System.out.println("Leaving " + method.getName());
        return result;
    }
}
