package dados;

public class Combo {

    private String nome;
    private Comida comida1;
    private Comida comida2;
    private Comida[] comidas = new Comida[5];
    private Bebida bebida1;
    private double preco;

    public Combo(String nome, Comida comida1, Comida comida2, Bebida bebida1, double preco) {
        this.nome = nome;
        this.comida1 = comida1;
        this.comida2 = comida2;
        this.bebida1 = bebida1;
        this.preco = preco;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Comida getComida1() {
        return this.comida1;
    }

    public void setComida1(Comida comida1) {
        this.comida1 = comida1;
    }

    public Comida getComida2() {
        return this.comida2;
    }

    public void setComida2(Comida comida2) {
        this.comida2 = comida2;
    }

    public Bebida getBebida1() {
        return this.bebida1;
    }

    public void setBebida1(Bebida bebida1) {
        this.bebida1 = bebida1;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {

        String retorno = "";
        retorno = retorno + "Nome: " + this.nome;
        retorno += " - Valor: " + this.preco;

        for (int i = 0; i < comidas.length; i++) {
            retorno += "\nComida: " + this.comidas[i].toString();
        }

        retorno += "\nBebida: " + this.bebida1;

        return retorno;
    }

}
