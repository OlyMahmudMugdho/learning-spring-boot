package com.mahmud.junit_learning;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class JunitLearningApplicationTests {

	@Test
	void contextLoads() {
	}

	@BeforeAll
    static void setup(){
		log.info("setup before all tests");
	}

	@BeforeEach
	void init(){
		log.info("this method runs before every tests");
	}

	@Test
    void sample(){
		log.info("sample test");
	}

	@Test
	void sample2(){
		log.info("sample test 2");
	}

	@DisplayName("for displaying custom test name")
	@Test
	void displayingName(){
		log.info("displaying name test");
	}

	@Disabled("this test is not implemented yet")
	@Test
	void disabledTest(){
		log.info("disabled test");
	}
}
