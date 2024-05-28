package com.mahmud.reactiveprogramming;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class ReactiveProgrammingApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void createFluxTest() {
        Flux<String> fruitFlux = Flux.just("Apple", "Mango", "Banana");

        fruitFlux.subscribe(
                f -> System.out.println("Fruit name : " + f)
        );

        StepVerifier.create(fruitFlux)
                .expectNext("Apple")
                .expectNext("Mango")
                .expectNext("Banana")
                .verifyComplete();
    }

    @Test
    public void fluxFromArray() {
        String[] names = {"Mila","Meghla","Mugdho"};
        Flux<String> nameFlux =  Flux.fromArray(names);
        nameFlux.subscribe(
                name -> System.out.println(name)
        );

        StepVerifier.create(nameFlux)
                .expectNext("Mila")
                .expectNext("Meghla")
                .expectNext("Mugdho")
                .verifyComplete();
    }

    @Test
    public void fluxFromIterable(){
        List<String> departments = new ArrayList<>();
        departments.add("IT");
        departments.add("MSE");
        departments.add("CSE");

        Flux<String> deptFlux = Flux.fromIterable(departments);

        deptFlux.subscribe(
                dept -> System.out.println(dept)
        );
    }
}
