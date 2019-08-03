package aula0208;

import java.time.Duration;
import java.time.Instant;

public class DatasTimes {
	

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		Instant inicio = Instant.now();
		
			Thread.sleep(666);
		
		
		
		
		Instant fim = Instant.now();

		
		Duration duracao = Duration.between(inicio, fim);
		System.out.println("Duração em nanossegundos:"+duracao.toNanos());
		System.out.println("Duração em minutos:"+duracao.toMinutes());
		System.out.println("Duração em horas:"+duracao.toHours());
		System.out.println("Duração em milissegundos:"+duracao.toMillis());
		System.out.println("Duração em dias:"+duracao.toDays());
	}

}
