package fhtw_bwi_bb.maintenance_monitor.controller;

import fhtw_bwi_bb.maintenance_monitor.service.MessageService;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/api")
public class MessageController {

    private MessageService messageService;
    private final String confirmText = "ok";

    @GetMapping(path = "/message")
    public String getMessage() {

        return messageService.getCurrentMessage();
    }


    //create mapping, calling service method

    @GetMapping(path="/message/set")
    public String setMessage(
            @RequestParam String m
    ) {

        messageService.setNewMessage(m);

        return confirmText;
    }
}
