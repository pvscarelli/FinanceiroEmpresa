package L10.Q2.MODEL;

import java.util.ArrayList;

public class Programador extends Funcionario {

    private ArrayList<String> linguagens = new ArrayList<>();

    public Programador(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    public void incluirLinguagem(String linguagem) {
        linguagens.add(linguagem);
    }

    public void removerLinguagem(String linguagem) {
        linguagens.remove(linguagem);
    }

    public ArrayList<String> getLinguagens() {
        return linguagens;
    }

    @Override
    public double calcularSalario() {

        boolean sabeJava = false;
        double salario = 0;

        for (String i : linguagens) {
            if (i.equals("JAVA")) {
                sabeJava = true;
            }
        }
        if (!sabeJava) {
            return getSalarioBase();
        } else {
            salario = getSalarioBase() * 1.20;
        }

        return salario;
    }

}
