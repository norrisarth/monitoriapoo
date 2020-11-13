package negocio;

import dados.Combo;
import dados.Comida;

public class Lanchonete {

    private Comida[] comidas = null;
    private Combo[] combos = null;

    private int maxComida = 50;
    private int maxCombo = 10;

    private int quantidadeComidas = 0;
    private int quantidadeCombos = 0;

    public Lanchonete() {
        this.comidas = new Comida[maxComida];
        this.combos = new Combo[maxCombo];
    }

    public boolean cadastrarComida(Comida x) {
        if (quantidadeComidas < maxComida) {
            this.comidas[quantidadeComidas] = x;
            quantidadeComidas = quantidadeComidas + 1;
        }
        System.out.println(comidas[0]);
        System.out.println(comidas[1]);
        return false; // Deu erro, numero maximo atingido
    }

    public Comida[] mostrarComidas() {
        return comidas;
    }

    public boolean cadastrarCombo(Combo c) {
        if (quantidadeCombos < maxCombo) {
            this.combos[quantidadeCombos] = c;
            quantidadeCombos++;
            return true;
        }
        return false;
    }

    public Combo[] mostrarCombos() {
        return combos;
    }

}
