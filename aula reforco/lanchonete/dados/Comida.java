package dados;

public class Comida {

    private String nome;
    private double valor;
    private double quantidadeCalorias;
    private double peso;
    private String descricao;
    private int id;

    private static int ID_GERAL = 0;

    public Comida(String nome, double valor, double quantidadeCalorias, double peso, String descricao) {
        this.nome = nome;
        this.valor = valor;
        this.quantidadeCalorias = quantidadeCalorias;
        this.peso = peso;
        this.descricao = descricao;
        novoId();
    }

    public Comida() {
        novoId();
    }

    public void novoId() {
        this.id = ID_GERAL;
        ID_GERAL++;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getQuantidadeCalorias() {
        return this.quantidadeCalorias;
    }

    public void setQuantidadeCalorias(double quantidadeCalorias) {
        this.quantidadeCalorias = quantidadeCalorias;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String toString() {
        return "(" + this.id + ") " + "Nome: " + this.nome + " - Valor: " + this.valor;
    }

    public boolean equals(Object object) {

        if (object instanceof Comida) {

            Comida comida = (Comida) (object);

            if (comida.getNome() == nome) {
                return true;
            }
        }

        return false;

    }

}