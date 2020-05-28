package com.joaomarcos.aplicationoauth2.config;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.joaomarcos.aplicationoauth2.entity.User;
import com.joaomarcos.aplicationoauth2.repository.ClientRepository;
import com.joaomarcos.aplicationoauth2.repository.PhoneTypeRepository;
import com.joaomarcos.aplicationoauth2.repository.UserRepository;

@Configuration
public class testConfig implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;

	@Autowired
	ClientRepository clientRepository;

	@Autowired
	PhoneTypeRepository phoneTypeRepository;

	@Override
	public void run(String... args) throws Exception {

		userRepository.deleteAll();
		clientRepository.deleteAll();
		phoneTypeRepository.deleteAll();

		List<User> users = Stream.of(new User(1, "joao", "easy", "joao@gmail.com"),
				new User(2, "marcos", "facil", "marcos@gmail.com"), new User(3, "camila", "mila", "camila@gmail.com"),
				new User(4, "emanuelly", "manu", "manu@gmail.com")).collect(Collectors.toList());

		userRepository.saveAll(users);

		/*List<PhoneType> phoneTypes = Stream
				.of(new PhoneType(null, "Fixo", Instant.now()), new PhoneType(null, "Fixo", Instant.now()),
						new PhoneType(null, "Fixo", Instant.now()), new PhoneType(null, "Fixo", Instant.now()))
				.collect(Collectors.toList());*/

		/*Phone p1 = new Phone(null, "062999243838", "personal phone");
		Phone p2 = new Phone(null, "062996492144", "My father's phone");
		Phone p3 = new Phone(null, "062996454128", "personal phone");
		Phone p4 = new Phone(null, "062985803748", "personal phone operator OI");
		Phone p5 = new Phone(null, "062999049560", "personal phone operator OI");
		Phone p6 = new Phone(null, "062999049560", "personal phone");
		Phone p7 = new Phone(null, "062996492144", "personal phone");
		Phone p8 = new Phone(null, "062996492145", "personal phone operator claro");
		Phone p9 = new Phone(null, "062999384038", "personal phone");
		Phone p10 = new Phone(null, "062999384038", "WhatsApp");

		Client c1 = new Client(null, false, true, true, "João Marcos Rodrigues", Arrays.asList(p1, p2, p3));
		Client c2 = new Client(null, false, true, true, "Camila Silva de Siqueira", Arrays.asList(p4, p5));
		Client c3 = new Client(null, false, true, true, "Hellena Emanuelly Nascimento", Arrays.asList(p6, p7, p8));
		Client c4 = new Client(null, false, true, true, "Ilmecina de Morais Rodrigues Nascimento", Arrays.asList(p9));
		Client c5 = new Client(null, false, true, true, "João Santana do Nascimento", null);
		Client c6 = new Client(null, false, true, true, "João Vinicius Rodrigues", Arrays.asList(p10));
		
		

		System.out.println("Telefones " + Arrays.asList(c1, c2, c3, c4, c5, c6));*/

		/*
		 * consumers.get(0).getPhones().addAll(Arrays.asList(phones.get(0),
		 * phones.get(1), phones.get(2)));
		 * consumers.get(1).getPhones().addAll(Arrays.asList(phones.get(3),
		 * phones.get(4), phones.get(5)));
		 * consumers.get(2).getPhones().addAll(Arrays.asList(phones.get(6),
		 * phones.get(7)));
		 * consumers.get(3).getPhones().addAll(Arrays.asList(phones.get(8)));
		 * consumers.get(4).getPhones().addAll(Arrays.asList(phones.get(9)));
		 */

		//phoneTypeRepository.saveAll(phoneTypes);
		//clientRepository.saveAll(Arrays.asList(c1, c2, c3, c4, c5, c6));

	}

}
