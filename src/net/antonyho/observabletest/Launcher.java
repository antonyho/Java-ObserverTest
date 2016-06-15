package net.antonyho.observabletest;

public class Launcher {

	public static void main(String[] args) {
		ObservableTask task = new ObservableTask();
		Monitor monitor = new Monitor();
		task.addObserver(monitor);
		
		task.run();
	}

}
