package br.com.categoria_meme.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/logs")
public class LogsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogsController.class);

    @GetMapping
    public String mostraMensagem(){
        final double mensagem = Math.random();

        LOGGER.info("Mensagem gerada {}", mensagem);
        return "Foi isso: " + mensagem;
    }


}
