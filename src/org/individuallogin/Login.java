package org.individuallogin;

public class Login { // class

	private void username() { // method

		System.out.println("ramsarath01@gmail.com");

	}

	private void password() { // method

		System.out.println("1234567890");
	}

	private void loginButton() { // method

		System.out.println("click login button");

	}

	private void a1() {
		System.out.println("method a1");

	}

	private void a2() {
		System.out.println("method a2");

	}

	private void b1() {
		System.out.println("method b1");

	}

	private void b2() {
		System.out.println("method b2");
	}

	public static void main(String[] args) { // main method

		// object creation - ClassName objectName = new ClassName();
		Login l = new Login();

		// method call - objectName.methodName();
		l.loginButton();
		l.username();
		l.password();

	}
}
