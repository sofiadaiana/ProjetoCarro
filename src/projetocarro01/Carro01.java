
package projetocarro01;

public class Carro01 {
    
    private double valor;
    private String cor;

    public Carro01() {
    }

    public Carro01(double valor, String cor) {
        this.valor = valor;
        this.cor = cor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    @Override
    public String toString() {
        return "Carro01{" + "valor=" + valor + ", cor=" + cor + '}';
    }

   
}
