package Factory;

import java.util.ArrayList;
import java.util.List;

public class AppPrincipal {
    public static void main(String[] args) {
        List<Calculable> folhaPagto;
        folhaPagto = new ArrayList<Calculable>();

        FabricaDeFuncionarios f1, f2;
        f1 = new FabricaDeChefes();
        f2 = new FabricaDeHoristas();

        folhaPagto.add(f1.criarFuncionarios());
        folhaPagto.add(f2.criarFuncionarios());
        folhaPagto.add(f1.criarFuncionarios());
        folhaPagto.add(f2.criarFuncionarios());

        for (Calculable c : folhaPagto){
            System.out.println(c + " R$ " + c.calcularSalario());
        }
    }
}
