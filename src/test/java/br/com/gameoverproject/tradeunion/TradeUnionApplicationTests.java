package br.com.gameoverproject.tradeunion;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;

@SpringBootTest
class TradeUnionApplicationTests {

	ApplicationModules modules = ApplicationModules.of(TradeUnionApplication.class);

	@Test
	void contextLoads() {
	}

	@Test
	void verifiesModularStructure() {
		modules.verify();
	}

	@Test
	void createModuleDocumentation() {
		new Documenter(modules)
				.writeDocumentation()
				.writeIndividualModulesAsPlantUml();
	}

	@Test
	void createApplicaionModuleModel() {
		modules.forEach(System.out::println);
	}

}
