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
	
	//accelerate() Eduardo Soto
	public boolean accelerate() {
		if (started = true) {
			speed = speed +5;
			return true;
		} else {
			return false;
		}
	}
	
	//showSpeed() Eduardo soto
	public void showSpeed() {
		System.out.println("The Current Speed is:   " + speed);
	}
	//brake() Samantha Mikuski
			public boolean brake() {
				if (started = true) {
					speed = speed - 5;
					return true;
				} else {
					System.out.println("Error!");
					return false;
				}
			}

}
