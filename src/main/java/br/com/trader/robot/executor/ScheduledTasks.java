package br.com.trader.robot.executor;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    //@Scheduled(fixedDelay = 5000)
    @Scheduled(fixedDelayString = "${fixedDelay.in.milliseconds}")
    public void reportCurrentTime() {
        //log.info("------>The time is now {}", dateFormat.format(new Date()));
    	System.out.println("------>The time is now {" + dateFormat.format(new Date()) + "}");
    }
}

/*Média Móvel Exponencial
A média móvel exponencial é uma extensão da média móvel simples, utilizando a suavização da mesma para reduzir a quantidade de sinais de compra ou venda. A média móvel exponencial (MME) é uma média ponderada de observações passadas e pode ser calculada através da seguinte fórmula:

MMEx = ME(x-1) + K x {Fech(x) – ME(x-1)}

- MMEx representa a média móvel exponencial no dia x

- ME(x-1) representa a média móvel exponencial no dia x-1

- N é o número de dias para os quais se quer o cálculo
- Constante K = {2 ÷ (N+1)}
*/