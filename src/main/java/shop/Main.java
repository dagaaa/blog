package shop;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import shop.services.PostServiceStubImpl;

import java.util.Calendar;

@SpringBootApplication
public class Main {
    public static void main(String []args){
        SpringApplication.run(Main.class);
        PostServiceStubImpl postServiceStub= new PostServiceStubImpl();
        postServiceStub.findLatest5().forEach(System.out::println);

    }
}
