package org.aaa.kafka.producer;

import lombok.Data;

import java.util.Date;

@Data
public class Message {
    private String id;

    private String msg;

    private Date sendTime;
}
