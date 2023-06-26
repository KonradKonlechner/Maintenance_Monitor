package fhtw_bwi_bb.maintenance_monitor.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MessageServiceTest {

    private MessageService messageService;
    private final String defaultMessageText = "Everything operates as expected";


    @BeforeEach
    public void setUp() {
        messageService = new MessageService();
    }

    @Test
    void shouldReturnDefaultMessage() {

        String result = messageService.getCurrentMessage();

        assertEquals(defaultMessageText, result);
    }

    @ParameterizedTest
    @CsvSource({"this+is+a+test,this is a test", "this+is+also+a+test,this is also a test"})
    void shouldSetNewMessage(String input, String expected) {

        messageService.setNewMessage(input);

        assertEquals(messageService.getCurrentMessage(), expected);
    }

    @Test
    void shouldLeaveMessageUnchanged() {
        messageService.resetMessage();

        final String resultingMessage = messageService.getCurrentMessage();

        assertEquals(resultingMessage, defaultMessageText);
    }

    @Test
    void shouldResetMessage() {

        messageService.setNewMessage("Some other Message");
        messageService.resetMessage();

        final String resultingMessage = messageService.getCurrentMessage();

        assertEquals(resultingMessage, defaultMessageText);
    }
}