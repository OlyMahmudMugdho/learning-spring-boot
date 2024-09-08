package com.mahmud.junit_learning;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

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

	@AfterEach
	void tearDown(){
		log.info("this method runs after every tests");
	}

	@AfterAll
	static void tearDownAll(){
		log.info("tear down all tests");
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

	@Test
	void assertingEquals(){
		double pi = 3.14;
        assertEquals(3.14, pi, () -> "pi should be equal to 3.14");
	}

	@Test
	void groupAssertion(){
		int[] nums = {5,7,9};
		assertAll("nums",
				() -> assertEquals(5,nums[0]),
				() -> assertEquals(9,nums[2])
		);
	}
}
