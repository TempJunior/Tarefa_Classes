
public class Main {
    public static void main(String[] args) {
    // Instacias do carro
    Carro meuCarro = new Carro("Vermelho","Sedan",2020);

    //Modificador de atributro usando os getter and setters
        System.out.println("Cor do carro: " + meuCarro.getCor());
        meuCarro.acelerar(20);
        System.out.println("Velocidade atual: " + meuCarro.getVelocidade());
        meuCarro.frear(10);
        System.out.println("Velocidade após frear: " + meuCarro.getVelocidade());


        }
    }
