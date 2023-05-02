package TesteDeThreads;

import java.util.TreeMap;

public class Principal {
    public static void main(String[] args) {
        // Criação do recurso compartilhado
        Contador count = new Contador();

        // Criação das threads
        Thread thread1 = new Thread(new ThreadInicial("Thread 1", count));
        Thread thread2 = new Thread(new ThreadInicial("Thread 2", count));
        Thread thread3 = new Thread(new ThreadInicial("Thread 3", count));

        // Inicialização das threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Espera a finalização das threads
        try{
            thread1.join();
            thread2.join();
            thread3.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        // Imprime o valor final do contador
        System.out.println("Valor do contador: "+count.getValues());
    }
}