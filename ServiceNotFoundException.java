package com.thegringottsbank.exceptions;

public class ServiceNotFoundException extends Exception 
{
public ServiceNotFoundException(String msg) {
		super();
		this.msg = msg;
	}

String msg;

@Override
public String toString() {
	return "ServiceNotFoundException [msg=" + msg + "]";
}

}
