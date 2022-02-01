package org.individuallogin;

public class Login {             //class

	private void username() {    //method
		
		System.out.println("ramsarath01@gmail.com");

	}
	
    private void password() {    //method
    	
    	System.out.println("1234567890");
    }
	
    private void loginButton() {  //method
		
    	System.out.println("click login button");

	}
	
    public static void main(String[] args) {           //main method
    	
		//object creation - ClassName objectName = new ClassName();
    	Login l = new Login();
    	
    	//method call - objectName.methodName();
    	l.loginButton();
    	l.username();
    	l.password();
    	
    }
}
