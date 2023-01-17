package br.com.jonathan.infrastructure.repository;

import br.com.jonathan.domain.entity.Agents;
import br.com.jonathan.domain.repository.AgentsRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

@Repository
public class AgentsLoggerRepository implements AgentsRepository {
	private static final Logger logger = LogManager.getLogger(AgentsLoggerRepository.class);
	
	@Override
	public void save(Agents agents) {
		logger.info("Save agents={}", agents);
		System.out.println("----- Códigos Recebidos -----");
		agents.getAgents().forEach(agent -> {
			var code = agent.getCode();
			System.out.println("-> Código: " + code);
		});
		System.out.println("-----------------------------");
	}
}
