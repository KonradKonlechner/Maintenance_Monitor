package fhtw_bwi_bb.maintenance_monitor.controller;

import fhtw_bwi_bb.maintenance_monitor.service.MessageService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;

@ExtendWith(MockitoExtension.class)
class MessageControllerTest {

    @Mock
    private MessageService messageService;


    @InjectMocks
    private MessageController messageController;

    @Test
    void shouldCallService() {

        messageController.getMessage();
        Mockito.verify(messageService, times(1)).getCurrentMessage();
    }


   // @ParameterizedTest
  //  @CsvSource({"this+is+a+test,this is a test","this+is+also+a+test,this is also a test"})
    @Test
    void shouldCallSetMessageService() {

        messageController.setMessage("ASD");

        Mockito.verify(messageService, times(1)).setNewMessage("ASD");
    }




}