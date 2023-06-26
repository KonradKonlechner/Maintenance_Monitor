package fhtw_bwi_bb.maintenance_monitor.controller;

import fhtw_bwi_bb.maintenance_monitor.service.MessageService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.times;

@ExtendWith(MockitoExtension.class)
class MessageControllerTest {

    @Mock
    private MessageService messageService;

    @InjectMocks
    private MessageController messageController;

    @Test
    void shouldCallGetMessageFromService() {

        messageController.getMessage();

        Mockito.verify(messageService, times(1)).getCurrentMessage();
    }

    @Test
    void shouldCallSetMessageFromService() {

        messageController.setMessage("ASD");

        Mockito.verify(messageService, times(1)).setNewMessage("ASD");
    }

    @Test
    void shouldCallResetMessageFromService() {

        messageController.resetMessage();

        Mockito.verify(messageService, times(1)).resetMessage();
    }
}