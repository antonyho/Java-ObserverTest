package net.antonyho.observabletest;

import java.util.Observable;
import java.util.Observer;

public class Monitor implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Yeah! It has done.");
	}

}
