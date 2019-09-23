package InClassWork;

public class Car {

	private int speed;
	private boolean started;
	// Default Const. Brad Mueller
	public Car() {

		this.speed = 0;
		this.started = false;

	}
	// start() Brad Mueller
	public boolean start() {

		speed = 0;
		started = true;

		return true;
	}
	// isStarted() Brad Mueller
	public boolean isStarted() {
		if (started) {
			return true;
		} else {
			return false;
		}
	}

}
