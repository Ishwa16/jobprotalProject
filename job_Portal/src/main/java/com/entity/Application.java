package com.entity;

public class Application {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String message;

    
    public Application() {
		super();
	}
    
    public Application(String name, String email, String phone, String message) {
        super();
    	this.name = name;
        this.email = email;
        this.phone = phone;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
