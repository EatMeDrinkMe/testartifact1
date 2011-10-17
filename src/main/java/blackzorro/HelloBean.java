package main.java.blackzorro;

public class HelloBean {
	private String name;

	public HelloBean(String name) {
		this.name = name;
	}

	public String sayHello() {
		return "Hello, " + name;
	}
}