package L10.Q2.MODEL;

import java.util.ArrayList;

public class Empresa {

    private String nome;
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public Empresa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void incluirFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    public void removerFuncionario(Funcionario f) {
        funcionarios.remove(f);
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public double calcularCustosSalarios() {

        double total = 0;
        for (Funcionario f : funcionarios) {
            total += f.calcularSalario();
        }
        return total;
    }

}
