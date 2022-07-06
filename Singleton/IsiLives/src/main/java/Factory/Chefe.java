package Factory;

public class Chefe implements Calculable{

    private String nome;
    private double salarioBase;
    private double adicional;

    public Chefe(String nome, double salarioBase, double adicional) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.adicional = adicional;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + adicional;
    }

    @Override
    public String toString() {
        return "Chefe{" +
                "nome='" + nome + '\'' +
                ", salarioBase=" + salarioBase +
                ", adicional=" + adicional +
                '}';
    }
}
