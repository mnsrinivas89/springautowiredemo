package com.verizontraining.springautowiredemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Club {

	@Value("Juventus")
	private String name;
	
	@Autowired
	private Player iconPlayer;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Player getIconPlayer() {
		return iconPlayer;
	}

	public void setIconPlayer(Player iconPlayer) {
		this.iconPlayer = iconPlayer;
	}

	@Override
	public String toString() {
		return "Club [name=" + name + ", iconPlayer=" + iconPlayer + "]";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("This will be executed while bean initialization");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("This will be exectued while bean destruction");
	}

}
