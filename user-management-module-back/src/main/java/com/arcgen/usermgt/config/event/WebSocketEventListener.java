package com.arcgen.usermgt.config.event;

import org.springframework.stereotype.Component;

@Component
public class WebSocketEventListener {

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
