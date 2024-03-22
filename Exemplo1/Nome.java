package Exercicio1;

public class Nome {
    private String nome;

    public Nome(String nome) {
        this.nome = nome;
    }
    
    
    public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	@Override
    public String toString() {
        return "Objeto{" +
                "nome='" + nome + '\'' +
                '}';
    }
}