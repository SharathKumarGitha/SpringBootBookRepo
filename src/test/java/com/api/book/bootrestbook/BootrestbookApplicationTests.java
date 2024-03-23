package com.api.book.bootrestbook;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.springframework.boot.test.context.SpringBootTest;

import com.api.book.bootrestbook.entities.User;

@SpringBootTest
class BootrestbookApplicationTests {
//
//	@Test
//	void contextLoads() {
//	}

	@Test
	@DisplayName("normal testcase")
	public void testUsernameIsNull() {

		System.out.println("this is executing.....");

		assertThrows(IllegalArgumentException.class, new Executable() {

			@Override
			public void execute() throws Throwable {
				User user = new User();
				user.setName(null);
			}
		});

	}

	@Test
	@DisplayName("this is second case to check the exception")
	public void testUsernameIsNull2() {

		Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
			User user = new User();
			user.setName(null);
		});

		Assertions.assertThat("Username cannot be blank".equals(exception.getMessage()));

	}

	@Test
	@DisplayName("this is third testcase")
	public void thirdTestcase() {

		Throwable exception = assertThrows(IllegalArgumentException.class, () -> {

			User user = new User();
			user.setName("Pablo Diego Jose Franciso Picasso");

		});

		Assertions.assertThat("Username is too long".equals(exception.getMessage()));

	}
}
