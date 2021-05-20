package proxy.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;

@Component
@Aspect
public class BrokerAspect {
    @Before("execution(* proxy.aop.Landlord.bussiness())")
    public void before() {
        System.out.println("带租客看房");
        System.out.println("谈价格");
    }

    @After("execution(* proxy.aop.Landlord.bussiness())")
    public void after() {
        System.out.println("交钥匙");
    }
}
