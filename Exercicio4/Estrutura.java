package Exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Estrutura<T> {
    private List<Par> pares;

    public Estrutura() {
        this.pares = new ArrayList<>();
    }

    public boolean add(String chave, T valor) {
        for (Par par : pares) {
            if (par.getChave().equals(chave)) {
                return false;
            }
        }
        pares.add(new Par(chave, valor));
        return true;
    }

    public Par buscarPorChave(String chave) {
        for (Par par : pares) {
            if (par.getChave().equals(chave)) {
                return par;
            }
        }
        return null;
    }

    public class Par {
        private String chave;
        private T valor;

        public Par(String chave, T valor) {
            this.chave = chave;
            this.valor = valor;
        }

        public String getChave() {
            return chave;
        }

        public T getValor() {
            return valor;
        }
        
        @Override
        public String toString() {
            return "Chave: " + chave + ", Valor: " + valor;
        }
    }
}