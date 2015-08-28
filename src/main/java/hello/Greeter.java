package hello;

import org.joda.time.DateTime;

public class Greeter {
	
	private DateTime currentTime = new DateTime();

	public String sayHello() {

		return "Hello world!";
	}

	public DateTime getGreeterTime() {

		return this.currentTime;
	}
}