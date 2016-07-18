package cl.tinet.devops.metrics.gen.bitbucket.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Branch {

	@JsonProperty("name")
	private String name;

	public Branch() {
	}

	public Branch(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Branch [name=" + name + "]";
	}
}
