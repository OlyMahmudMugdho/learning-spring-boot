package com.mahmud.spring_data_mongo_db;

import com.mahmud.spring_data_mongo_db.models.Student;
import com.mahmud.spring_data_mongo_db.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.mahmud.spring_data_mongo_db")
public class SpringDataMongoDbApplication implements CommandLineRunner {

	public MongoTemplate mongoTemplate;

	@Autowired
	public SpringDataMongoDbApplication(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDataMongoDbApplication.class, args);
	}

	@Override
	public void run(String[] args) throws Exception {
		Student student = new Student();
		student.setName("M. Oly Mahmud");
		student.setRoll(210614);
		mongoTemplate.save(student, "student");
	}
}

