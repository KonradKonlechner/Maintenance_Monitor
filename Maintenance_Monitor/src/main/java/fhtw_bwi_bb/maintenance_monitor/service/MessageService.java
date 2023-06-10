package fhtw_bwi_bb.maintenance_monitor.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

    private String messageText = "Everything operates as expected";

    public String getCurrentMessage() {
        return this.messageText;
    }

}
