package br.com.jonathan.domain.entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "regiao")
public class Region {
	private String acronym;
	private List<Price> generation;
	private List<Price> purchase;
	private List<Price> average;

	@XmlAttribute(name = "sigla")
	public String getAcronym() {
		return acronym;
	}

	public void setAcronym(String acronym) {
		this.acronym = acronym;
	}

	@XmlElement(name = "geracao")
	public List<Price> getGeneration() {
		return generation;
	}

	public void setGeneration(List<Price> generation) {
		this.generation = generation;
	}

	@XmlElement(name = "compra")
	public List<Price> getPurchase() {
		return purchase;
	}

	public void setPurchase(List<Price> purchase) {
		this.purchase = purchase;
	}

	@XmlElement(name = "precoMedio")
	public List<Price> getAverage() {
		return average;
	}

	public void setAverage(List<Price> average) {
		this.average = average;
	}

	@Override 
	public String toString() {
		return "regiao{" + "sigla='" + acronym + '\'' + ", geracao=" + generation + ", compra=" + purchase + ", precoMedio=####" + '}';
	}
}
