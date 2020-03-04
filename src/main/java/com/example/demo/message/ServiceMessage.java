package com.example.demo.message;


import lombok.Data;

@Data
public class ServiceMessage<T> {
    private String message;
    private String code;
    private T body;



    public static ServiceMessage success(Object o){
        ServiceMessage m = new ServiceMessage();
        m.setBody(o);
        m.setCode("0000");
        return m;
    }
}
