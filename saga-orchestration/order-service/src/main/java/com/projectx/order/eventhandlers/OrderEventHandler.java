package com.projectx.order.eventhandlers;

import com.projectx.dto.OrchestratorRequestDTO;
import com.projectx.dto.OrchestratorResponseDTO;
import com.projectx.order.service.OrderEventUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.DirectProcessor;
import reactor.core.publisher.Flux;

import java.util.function.Consumer;
import java.util.function.Supplier;

@Configuration
public class OrderEventHandler {

    @Autowired
    private DirectProcessor<OrchestratorRequestDTO> source;

    @Autowired
    private OrderEventUpdateService service;

    @Bean
    public Supplier<Flux<OrchestratorRequestDTO>> supplier(){
        return () -> Flux.from(source);
    };

    @Bean
    public Consumer<Flux<OrchestratorResponseDTO>> consumer(){
        return (flux) -> flux
                            .subscribe(responseDTO -> this.service.updateOrder(responseDTO));
    };

}
