package com.thegringottsbank.exceptions;

public class GringottsExceptions extends Exception{
String msg;

@Override
public String toString() {
	return "GringottsExceptions [msg=" + msg + "]";
}

public GringottsExceptions(String msg) {
	super();
	this.msg = msg;
}
}
