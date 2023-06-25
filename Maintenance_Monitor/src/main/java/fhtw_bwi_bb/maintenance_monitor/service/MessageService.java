package fhtw_bwi_bb.maintenance_monitor.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {


    private final String defaultMessage = "Everything operates as expected";
    private String currentMessage = defaultMessage;

    public String getCurrentMessage() {
        return this.messageText;
    }

    //method for setting new current message
    public void setNewMessage(String newMessage) {

            this.currentMessage = newMessage.replace("+", " ");
    }

    // reset message to default value
    public void resetMessage() {

        this.currentMessage = defaultMessage;
    }
}
