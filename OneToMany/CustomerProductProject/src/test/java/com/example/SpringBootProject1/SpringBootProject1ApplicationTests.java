package com.example.SpringBootProject1;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class SpringBootProject1ApplicationTests {

	private Calculator c = new Calculator();

	@Test
	void contextLoads() {
	}

	@Test
	void testSum() {
		int exceptedResult = 20;
		int actualResult = c.doSum(10,5,5);
		assertThat(actualResult).isEqualTo(exceptedResult);
	}
	@Test
	@Disabled
	void testProduct() {
		int exceptedResult = 50;
		int actualResult = c.doProduct(10,5);
		assertThat(actualResult).isEqualTo(exceptedResult);
	}

	@Test
	void testCompare() {
		boolean actualResult = c.compareTwoNum(10,10);
		assertThat(actualResult).isTrue();
	}
}
