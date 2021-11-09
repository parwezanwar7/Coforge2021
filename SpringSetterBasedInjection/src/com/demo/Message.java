package com.demo;

public class Message {
	//create setter method for this to inject the dependency
	WriteMessage writeMessage;// Aggregation
	
	public WriteMessage getWriteMessage() {
		return writeMessage;
	}

	public void setWriteMessage(WriteMessage writeMessage) {
		this.writeMessage = writeMessage;
	}
	
	
	//create setter method for this to inject the dependency
	//private String id;
	//public String getId() {
		//return id;
	//}

	//public void setId(String id) {
		//this.id = id;
	//}
	
	
	//create setter method for this to inject the dependency
	//private String message;
	

	//public String getMessage() {
		//return message;
	//}

	//public void setMessage(String message) {
		//this.message = message;
	//}

	
	//calling another class mehtod from here
	public void show() {
		writeMessage.WriteMessage();
		
	}

}