package br.com.jonathan.domain.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Price {
	private Double value;

	@XmlElement(name = "valor")
	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	@Override 
	public String toString() {
		return "{" + "valor=" + value + '}';
	}
}
