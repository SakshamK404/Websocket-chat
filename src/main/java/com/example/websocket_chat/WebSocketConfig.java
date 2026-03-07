package com.example.websocket_chat;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        // This is the endpoint clients will connect to.
        // withSockJS() provides fallback options for browsers that don't support WebSockets.
        registry.addEndpoint("/ws").withSockJS();
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        // Messages with destination "/topic" will be routed to the message broker (to broadcast to others)
        registry.enableSimpleBroker("/topic");
        // Messages with destination "/app" will be routed to your @MessageMapping controllers
        registry.setApplicationDestinationPrefixes("/app");
    }
}