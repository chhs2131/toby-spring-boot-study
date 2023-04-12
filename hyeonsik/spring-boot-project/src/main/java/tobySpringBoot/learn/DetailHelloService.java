package tobySpringBoot.learn;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class DetailHelloService implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name + "this is detail service.";
    }
}
