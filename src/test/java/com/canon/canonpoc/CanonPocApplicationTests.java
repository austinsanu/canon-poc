package com.canon.canonpoc;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CanonPocApplicationTests {

	@Test
	public void contextLoads() {
		int a = 1;
		int b = 2;
		assertTrue(a + b == 5);
	}

}
