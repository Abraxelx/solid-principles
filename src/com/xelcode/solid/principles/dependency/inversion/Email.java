package com.xelcode.solid.principles.dependency.inversion;

public class Email implements Message{
    public void sendEmail(){
        System.out.println("E-mail sent");
    }

    @Override
    public void sendMessage() {
        sendEmail();
    }
}
