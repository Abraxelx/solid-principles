package com.xelcode.solid.principles;

import com.xelcode.solid.principles.dependency.inversion.Email;
import com.xelcode.solid.principles.dependency.inversion.Message;
import com.xelcode.solid.principles.dependency.inversion.Notification;
import com.xelcode.solid.principles.dependency.inversion.Sms;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    
    
    public static void main(String[] args) {
        Message message = new Email();
        Message sms = new Sms();

        List<Message> messageList = new ArrayList<>();
        messageList.add(message);
        messageList.add(sms);

        Notification notification = new Notification(messageList);
        
        notification.sender();

    }

    
    
}