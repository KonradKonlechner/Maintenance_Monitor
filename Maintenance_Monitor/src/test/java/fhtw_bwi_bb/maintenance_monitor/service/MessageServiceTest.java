package fhtw_bwi_bb.maintenance_monitor.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageServiceTest {

    private MessageService messageService;
    private final String defaultMessageText = "Everything operates as expected";


    @BeforeEach
    private void setUp() {
        messageService = new MessageService();
    }

    @Test
    void shouldReturnDefaultMessage() {

        String result = messageService.getCurrentMessage();

        assertEquals(defaultMessageText, result);
    }
}