package com.verizontraining.springautowiredemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Player {
	
	@Value("Christiano Ronaldo")
	private String name;
	
	@Value("Portugal")
	private String country;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", country=" + country + "]";
	}

}
