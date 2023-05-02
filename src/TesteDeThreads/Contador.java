package TesteDeThreads;

// Classe que representa o contador

public class Contador {
    private int values = 0;

    public synchronized void incremento(){ // torna o método sincronizado para evitar condições de corrida
        values++;
    }
    public int getValues(){
        return values;
    }
}
