package com.example.mongodb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class MongoDbCrudTest {
//
//	MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
//	String dbName = "myDb";
//	MongoDatabase database = mongoClient.getDatabase(dbName);
//
//
//	@Test
//	@DisplayName("몽고DB 연결 및 Credential 생성 테스트")
//	void test1() {
//
//		// given
//		final var userName = "sampleUser";
//
//		// when
//		final var credential = MongoCredential.createCredential(userName, dbName, "password".toCharArray());
//
//		// then
//		Assertions.assertEquals(userName, credential.getUserName());
//		Assertions.assertEquals(dbName, credential.getSource());
//
//
//	}
//
//	@Test
//	@DisplayName("Show DatabaseNames")
//	void test2() {
//
//		database.createCollection("sampleCollection");
//
//		// Inserting document into the collection
//		final MongoCollection<Document> collection = database.getCollection("sampleCollection");
//		Document document = new Document("title", "MongoDB")
//				.append("description", "database")
//				.append("likes", 100)
//				.append("by", "tutorials point");
//
//
//		collection.insertOne(document);
//
//		// retrieve databaseNames
//		for (final String name : mongoClient.listDatabaseNames()) {
//			log.info(name);
//		}
//
//	}
//
//	@Test
//	@DisplayName("Show CollectionNames")
//	void test3() {
//
//		// before
//		final var sampleCollection2 = database.getCollection("sampleCollection2");
//		sampleCollection2.drop();
//
//		// given
//		database.createCollection("sampleCollection2");
//
//		// retrieve databaseNames
//		final var databaseNames = Lists.newArrayList(database.listCollectionNames());
//
//		// then
//		Assertions.assertTrue(databaseNames.contains("sampleCollection2"));
//	}

}
