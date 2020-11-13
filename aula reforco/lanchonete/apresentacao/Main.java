package apresentacao;

import java.util.Scanner;

import dados.Bebida;
import dados.Combo;
import dados.Comida;
import negocio.Lanchonete;

public class Main {

    public static Lanchonete lanchonete = new Lanchonete();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao = -1;

        while (opcao != 0) {

            menu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 0:
                    break;
                case 1:
                    cadastrarComida();
                    break;
                case 2:
                    exibirComidas();
                    break;
                case 3:
                    exibirCombos();
                    // demais metodos
                default:
                    System.out.println("Valor incorreto!");
            }
        }

    }

    public static void menu() {
        System.out.println("0 - Sair");
        System.out.println("1 - Cadastrar comida");
        System.out.println("2 - Mostrar comida");
    }

    public static void cadastrarComida() {
        System.out.println("Cadastrar");
        String nome = scanner.nextLine();
        double valor = scanner.nextDouble();
        double quantidadeCalorias = scanner.nextDouble();
        double peso = scanner.nextDouble();
        String descricao = scanner.nextLine();
        Comida comida = new Comida(nome, valor, quantidadeCalorias, peso, descricao);
        lanchonete.cadastrarComida(comida);
    }

    public static void exibirComidas() {
        System.out.println("Exibir");
        Comida[] comidasCadastradas = lanchonete.mostrarComidas();
        for (int i = 0; i < comidasCadastradas.length; i++) {
            if (comidasCadastradas[i] != null) {
                System.out.println("[" + i + "]" + comidasCadastradas[i]);
            }
        }
    }

    public static void exibirCombos() {
        System.out.println("Exibir");
        Combo[] combos = lanchonete.mostrarCombos();
        for (Combo x : combos) {
            System.out.println(x);
        }
    }

    public static Comida escolherComida() {
        System.out.println("Escolha uma comida digitando seu id entre colchetes:");
        exibirComidas();
        int id = scanner.nextInt();
        if (id < lanchonete.mostrarComidas().length) {
            return lanchonete.mostrarComidas()[id];
        } else {
            return null;
        }
    }

    public static void cadastrarCombo() {
        Comida c1 = escolherComida();
        Comida c2 = escolherComida();
        Bebida b1 = null; // escolherBebida();
        String nome = scanner.nextLine();
        double preco = scanner.nextDouble();
        Combo combo = new Combo(nome, c1, c2, b1, preco);
        lanchonete.cadastrarCombo(combo);
    }

}
