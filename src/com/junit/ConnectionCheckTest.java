package com.junit;

import static org.junit.jupiter.api.Assertions.fail;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.util.ConnectionHelper;

class ConnectionCheckTest {

	@Test
	void check() throws IOException {
		ConnectionHelper junit = new ConnectionHelper();
		StringBuilder search = new StringBuilder("&t=300");
		int entity = junit.checkStatus(search);
		if(entity!=200) {
			fail("Status is not 200");
		}
	}

}
