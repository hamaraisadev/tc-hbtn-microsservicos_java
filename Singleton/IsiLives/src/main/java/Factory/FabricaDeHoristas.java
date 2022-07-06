package Factory;

public class FabricaDeHoristas extends FabricaDeFuncionarios {

    @Override
    public Calculable criarFuncionarios() {
        return new Horista("Horista", 100, 98.75);
    }
}
