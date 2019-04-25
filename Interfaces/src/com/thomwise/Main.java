package com.thomwise;

public class Main {

    public static void main(String[] args) {
	    ITelephone thomsPhone;
	    thomsPhone = new DeskPhone(123456);
	    thomsPhone.powerOn();
	    thomsPhone.callPhone(123456);
	    thomsPhone.answer();

	    thomsPhone = new MobilePhone(234565);
	    thomsPhone.powerOn();
	    thomsPhone.callPhone(234565);
	    thomsPhone.answer();
    }
}
