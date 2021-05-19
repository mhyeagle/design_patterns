package proxy.aop;

import org.springframework.stereotype.Component;

@Component("landlord")
public class Landlord {
    public void bussiness() {
        System.out.println("签合同");
        System.out.println("收房租");
    }
}
