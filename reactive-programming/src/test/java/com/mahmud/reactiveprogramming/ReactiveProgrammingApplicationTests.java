package com.mahmud.reactiveprogramming;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

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

    }
}
