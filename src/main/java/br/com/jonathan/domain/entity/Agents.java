package br.com.jonathan.domain.entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "agentes")
public class Agents {
	private String version;
	private List<Agent> agents;

	@XmlAttribute(name = "versao")
	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@XmlElement(name = "agente")
	public List<Agent> getAgents() {
		return agents;
	}

	public void setAgents(List<Agent> agents) {
		this.agents = agents;
	}

	@Override 
	public String toString() {
		return "agentes{" + "versao='" + version + '\'' + ", agentes=" + agents + '}';
	}
}
