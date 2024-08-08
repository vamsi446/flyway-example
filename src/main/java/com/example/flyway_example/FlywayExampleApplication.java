package com.example.flyway_example;

import com.example.flyway_example.Repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlywayExampleApplication implements CommandLineRunner {



	private final BookRepository bookrepo;

    public FlywayExampleApplication(BookRepository bookrepo) {
        this.bookrepo = bookrepo;
    }

    public static void main(String[] args) {
		SpringApplication.run(FlywayExampleApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception{

		bookrepo.findAll().forEach(book -> {
			System.out.println(book);
		});

	}
}
