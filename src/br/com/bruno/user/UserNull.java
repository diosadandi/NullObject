package br.com.bruno.user;

public class UserNull extends User {
	
	boolean isNull(){
		return true;
	}
	
	Name getName(){
		return new nullName();
	}
	
	Age getAge(){
		return new nullAge();
	}
	
	Height getHeight(){
		return new nullHeight();
	}
	
}

user = (code.user != null)
	code.user : new NullUser();

name = user.getname();
age = user.getage();
height = user.height();
