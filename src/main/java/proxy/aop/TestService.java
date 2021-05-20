package proxy.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestService {
    @Autowired
    private Landlord landlord;

    public void test() {
        landlord.bussiness();
    }
}
