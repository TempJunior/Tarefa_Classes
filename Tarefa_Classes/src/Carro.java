public class Carro {
    //Atributos
    private String cor;
    private String modelo;
    private int ano;
    private double velocidade;

    //Construtor
    public Carro(String cor, String modelo, int ano) {
        this.cor = cor;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0; // Começa parado
    }
    //Metodos Getter and Setters


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
    public void acelerar(double incrementoVelocidade){
        this.velocidade += incrementoVelocidade;
    }
    public void frear(double decrementoVelocidade){
        this.velocidade -=decrementoVelocidade;
    }
}
