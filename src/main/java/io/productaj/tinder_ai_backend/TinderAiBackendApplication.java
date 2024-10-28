package io.productaj.tinder_ai_backend;

import io.productaj.tinder_ai_backend.conversations.ConversationRepository;
import io.productaj.tinder_ai_backend.profiles.Gender;
import io.productaj.tinder_ai_backend.profiles.Profile;
import io.productaj.tinder_ai_backend.profiles.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class TinderAiBackendApplication implements CommandLineRunner {

	@Autowired
	ProfileRepository profileRepository;

	@Autowired
	ConversationRepository conversationRepository;

	public static void main(String[] args) {
		SpringApplication.run(TinderAiBackendApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("My Application is running");
		profileRepository.deleteAll();
		conversationRepository.deleteAll();

		Profile profile = new Profile(
				"1",
				"Akash",
				"Jain",
				40,
				"Indian",
				Gender.MALE,
				"Software Programmer",
				"foo.jpg",
				"INTROVERT"

		);
		profileRepository.save(profile);

	}
}
