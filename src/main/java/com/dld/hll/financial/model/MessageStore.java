package com.dld.hll.financial.model;

/**
 * @Author yue chao
 * @Date 2019/8/9 0009 下午 16:26
 */

public class MessageStore {

    private String message;

    public MessageStore() {
        message = "Hello Struts User";
    }

    public String getMessage() {
        return message;
    }

    public String toString() {
        return message + " (from toString)";
    }
}
