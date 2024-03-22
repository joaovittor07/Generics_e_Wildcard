package Exercicio1;

public class Generics <J> {
    private J dado;

    public Generics(J dado) {
        this.dado = dado;
    }

    public J getDado() {
        return dado;
    }

    public void setDado(J dado) {
        this.dado = dado;
    }

    public void processar() {
 
        System.out.println("Processando dado: " + dado);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Generica [dado=");
        builder.append(dado);
        builder.append("]");
        return builder.toString();
    }
}
