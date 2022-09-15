package com.xelcode.solid.principles.dependency.inversion;

public class Sms implements Message{
    public void sendSMS(){
        System.out.println("SMS sent!");
    }

    @Override
    public void sendMessage() {
        sendSMS();
    }
}
