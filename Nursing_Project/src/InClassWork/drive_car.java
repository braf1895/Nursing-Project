package InClassWork;

public class drive_car {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.start();
		System.out.println(car1.isStarted());
		car1.accelerate();
		car1.accelerate();
		car1.accelerate();
		car1.accelerate();
		car1.accelerate();
		car1.accelerate();
		car1.showSpeed();
		car1.brake();
		car1.brake();
		car1.brake();
		car1.brake();
		car1.showSpeed();
	}

}
