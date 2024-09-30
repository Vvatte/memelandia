package br.com.categoria_meme.consumidor;

import br.com.categoria_meme.configuracao.ConfiguracaoRabbitMQ;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = ConfiguracaoRabbitMQ.NOME_FILA)
public class Consumidor {

    @RabbitHandler
    public void mensagem(String mensagem){
        System.out.println("Recebendo mensagem");

        System.out.println(mensagem);

    }
}
