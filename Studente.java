public class Studente {
    private String nome;
    private int eta;
    private int id;

    public Studente(String nome, int eta, int id){
        this.nome=nome;
        this.eta=eta;
        this.id=id;
    }
    public String getNome() {
        return nome;
    }
    public int getEta() {
        return eta;
    }
    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return "Studente{" +
                "nome='" + nome + '\'' +
                ", eta=" + eta +
                ", id=" + id +
                '}';
    }
}
