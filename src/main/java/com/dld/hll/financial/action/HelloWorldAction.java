package com.dld.hll.financial.action;

import com.dld.hll.financial.model.MessageStore;
import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {

    private MessageStore messageStore;

    private static int helloCount = 0;

    public  int getHelloCount() {
        return helloCount;
    }

    public String execute() {
        helloCount++;
        messageStore = new MessageStore() ;
        
        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }
}