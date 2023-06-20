package com.example.mongodb;

import com.mongodb.MongoCredential;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MongoDbCrudTest {


	@Test
	@DisplayName("몽고DB 연결 및 Credential 생성 테스트")
	void test1() {

		// given
		final var dbName = "myDb";
		final var userName = "sampleUser";

		// when
		MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
		MongoDatabase database = mongoClient.getDatabase(dbName);

		final var credential = MongoCredential.createCredential(userName, dbName, "password".toCharArray());

		// then
		Assertions.assertEquals(userName, credential.getUserName());
		Assertions.assertEquals(dbName, credential.getSource());
	}


}
