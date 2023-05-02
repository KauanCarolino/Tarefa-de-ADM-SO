package TesteDeThreads;

public class ThreadInicial implements Runnable {
    private String name;
    private Contador count;

    // Classe que implementa a tarefa da thread
    public ThreadInicial(String name, Contador count){
        this.name = name;
        this.count = count;
    }

    public void run(){
        for(int i = 0; i < 10; i++){
            count.incremento(); // incrementa o contador
            System.out.println(name + " - " + count.getValues()); // imprime o valor do contador
        }
    }
}