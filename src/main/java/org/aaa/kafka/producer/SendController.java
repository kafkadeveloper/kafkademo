package org.aaa.kafka.producer;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/kafka")
public class SendController {
    @Resource
    private Producer producer;

    @RequestMapping(value = "/send")
    public String send() {
        producer.send();
        return "{\"code\":0}";
    }
}
