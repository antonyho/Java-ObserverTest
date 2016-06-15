package net.antonyho.observabletest;

import java.util.Observable;
import java.util.Random;

public class ObservableTask extends Observable implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(new Random().nextInt(20000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Yeah! I'm done.");
		setChanged();
		notifyObservers();
	}

}
