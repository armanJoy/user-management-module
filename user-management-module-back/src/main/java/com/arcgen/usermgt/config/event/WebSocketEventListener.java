package com.arcgen.usermgt.config.event;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionConnectEvent;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

@Component
public class WebSocketEventListener {

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    ParticipantRepository participantRepository;

    String loginDestination;

    String logoutDestination;

    public WebSocketEventListener() {
    }

//    @EventListener
//    private void handleSessionConnected(SessionConnectEvent event) {
//        SimpMessageHeaderAccessor headers = SimpMessageHeaderAccessor.wrap(event.getMessage());
//        String username = headers.getUser().getName();
//
//        LoginEvent loginEvent = new LoginEvent(username);
//        messagingTemplate.convertAndSend(loginDestination, loginEvent);
//
//        // We store the session as we need to be idempotent in the disconnect event processing
//        //participantRepository.add(headers.getSessionId(), loginEvent);
//    }
//
//    @EventListener
//    private void handleSessionDisconnect(SessionDisconnectEvent event) {
//
//        Optional.ofNullable(participantRepository.getParticipant(event.getSessionId()))
//                .ifPresent(login -> {
//                    messagingTemplate.convertAndSend(logoutDestination, new LogoutEvent(login.getUsername()));
//                    participantRepository.removeParticipant(event.getSessionId());
//                });
//    }
}
