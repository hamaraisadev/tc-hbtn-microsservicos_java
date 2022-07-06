package Factory;

public class FabricaDeChefes extends FabricaDeFuncionarios {
    @Override
    public Calculable criarFuncionarios() {
        return new Chefe("Chefe", 10.000, 2.050);
    }
}
