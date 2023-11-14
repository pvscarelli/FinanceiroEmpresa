package L10.Q2.APP;

import L10.Q2.MODEL.Empresa;
import L10.Q2.MODEL.Funcionario;
import L10.Q2.MODEL.Programador;
import L10.Q2.MODEL.Venda;
import L10.Q2.MODEL.Vendedor;

public class App {

    public static void main(String[] args) {

        Vendedor v1 = new Vendedor("Luis", 1000, 10);

        v1.incluirVenda(new Venda(200));
        v1.incluirVenda(new Venda(100));

        v1.calcularSalario();
        Vendedor v2 = new Vendedor("Paula", 1200, 7);

        v2.incluirVenda(new Venda(500));
        v2.incluirVenda(new Venda(350));
        v2.incluirVenda(new Venda(280));

        Programador p1 = new Programador("Julio", 1000);
        p1.incluirLinguagem("C");
        p1.incluirLinguagem("JAVA");

        Programador p2 = new Programador("Ana", 1000);
        p2.incluirLinguagem("C#");
        p2.incluirLinguagem("JAVA");

        Programador p3 = new Programador("Anderson", 1200);
        p3.incluirLinguagem("PYTHON");

        Funcionario f1 = new Funcionario("José", 1000);
        Funcionario f2 = new Funcionario("Maria", 1400);

        Empresa e1 = new Empresa("Enter");
        e1.incluirFuncionario(f1);
        e1.incluirFuncionario(f2);
        e1.incluirFuncionario(v1);
        e1.incluirFuncionario(v2);
        e1.incluirFuncionario(p1);
        e1.incluirFuncionario(p2);
        e1.incluirFuncionario(p3);

        System.out.println("Custo total do salário de todos os tipos de funcionários: " + e1.calcularCustosSalarios());

        for (Funcionario i : e1.getFuncionarios()) {
            System.out.println(i.getNome() + " " + i.calcularSalario());
        }
        for (Funcionario i : e1.getFuncionarios()) {
            if (i instanceof Vendedor) {
                System.out.println(i.getNome() + " " + ((Vendedor) i).getPercentualComissao());/*aparece esse vendedor entra parenteses pois so a classe 
                vendedor tem o metodo getPercentualComissao*/
            }
        }
        for (Funcionario i : e1.getFuncionarios()) {
            if (i instanceof Programador) {
                System.out.println(i.getNome() + " " + ((Programador) i).getLinguagens());/*aparece esse programador entra parenteses pois so a classe 
                programador tem o metodo getLinguagens*/
            }
        }

    }

}
