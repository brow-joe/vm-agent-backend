package br.com.jonathan.userinterface.controller;

import br.com.jonathan.application.usecase.agents.UploadAgentsUseCase;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.xml.bind.JAXBException;
import java.io.IOException;

@RestController
@RequestMapping(path = AgentController.PATH, produces = { MediaType.APPLICATION_JSON_VALUE })
public class AgentController {
	public static final String PATH = "v1/agent";
	
	private final UploadAgentsUseCase uploadAgentsUseCase;

	public AgentController(UploadAgentsUseCase uploadAgentsUseCase) {
		this.uploadAgentsUseCase = uploadAgentsUseCase;
	}

	@PostMapping(consumes = {MediaType.MULTIPART_FORM_DATA_VALUE, MediaType.TEXT_XML_VALUE})
	public void upload(@RequestPart("file") MultipartFile file) throws IOException, JAXBException {
		uploadAgentsUseCase.execute(file.getInputStream());
	}
}
