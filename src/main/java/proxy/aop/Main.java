package proxy.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
//    @Autowired
//    private static Landlord landlordAuto;

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Landlord landlord = (Landlord) context.getBean("landlord");
        landlord.bussiness();

//        TestService testService = context.getBean(TestService.class);
//        testService.test();

//        landlordAuto.bussiness();
    }
}
