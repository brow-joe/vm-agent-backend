package br.com.jonathan.application.usecase.agents;

import br.com.jonathan.domain.entity.Agents;
import br.com.jonathan.domain.repository.AgentsRepository;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.InputStream;

@Component
public class UploadAgentsUseCase {
	private final AgentsRepository repository;

	public UploadAgentsUseCase(AgentsRepository repository) {
		this.repository = repository;
	}

	@Async
	public void execute(InputStream stream) throws JAXBException {
		var context = JAXBContext.newInstance(Agents.class);
		var parse = context.createUnmarshaller();
		var data = (Agents) parse.unmarshal(stream);
		repository.save(data);
	}
}
