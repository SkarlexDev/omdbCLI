package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.apache.http.HttpEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.jupiter.api.Test;

import com.util.ConnectionCheck;

class ConnectionCheckTest {

	@Test
	void check() {
		ConnectionCheck junit = new ConnectionCheck();
		String search = "&t=300";
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpEntity entity = junit.check(httpClient, search);
		if(entity==null) {
			fail("Result is null");
		}else {
			return;
		}
	}

}
