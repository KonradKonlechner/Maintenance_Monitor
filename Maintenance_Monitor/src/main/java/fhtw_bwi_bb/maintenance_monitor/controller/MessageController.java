package fhtw_bwi_bb.maintenance_monitor.controller;

import fhtw_bwi_bb.maintenance_monitor.service.MessageService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/api",method = {RequestMethod.GET,RequestMethod.PUT})
public class MessageController {

    private MessageService messageService;
    private final String confirmText = "ok";

    @GetMapping(path = "/message")
    public String getMessage() {

        return messageService.getCurrentMessage();
    }


    //create mapping, calling service method
    @PutMapping("/message/set/{message}")
    public String setMessage(@PathVariable String message) {
        messageService.setNewMessage(message);
        return confirmText;
    }

    @PutMapping("/message/reset")
    public String resetMessage() {

        messageService.resetMessage();
        return confirmText;
    }
}
