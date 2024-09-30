package br.com.categoria_meme.produtor;

import br.com.categoria_meme.service.ServiceRabbitMQ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mensagens")
public class Produtor {
    @Autowired
    private ServiceRabbitMQ serviceRabbitMQ;

    @PostMapping
    public void enviandoMensagem(@RequestBody String mensagem) {
        System.out.println("Enviando mensagem" + mensagem);

        serviceRabbitMQ.enviaMensagem(mensagem);
    }
}
