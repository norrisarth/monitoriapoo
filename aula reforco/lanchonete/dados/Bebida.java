package dados;

import java.util.Objects;

public class Bebida {

    private String nome;
    private double valor;
    private double quantidadeCalorias;
    private double volume;
    private String descricao;

    public Bebida() {
    }

    public Bebida(String nome, double valor, double quantidadeCalorias, double volume, String descricao) {
        this.nome = nome;
        this.valor = valor;
        this.quantidadeCalorias = quantidadeCalorias;
        this.volume = volume;
        this.descricao = descricao;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public double getVolume() {
        return this.volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Bebida)) {
            return false;
        }
        Bebida bebida = (Bebida) o;
        return Objects.equals(nome, bebida.nome) && valor == bebida.valor
                && quantidadeCalorias == bebida.quantidadeCalorias && volume == bebida.volume
                && Objects.equals(descricao, bebida.descricao);
    }

    @Override
    public String toString() {
        return "{" + " nome='" + getNome() + "'" + ", valor='" + getValor() + "'" + ", quantidadeCalorias='"
                + getQuantidadeCalorias() + "'" + ", volume='" + getVolume() + "'" + ", descricao='" + getDescricao()
                + "'" + "}";
    }

}
