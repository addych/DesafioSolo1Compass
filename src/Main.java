public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.setMotor(true);
        carro.setVolante(true);
        carro.setQuantidadePassageiros(4);
        carro.setQuantidadePortas(2);
        carro.setQuantidadeRodas(4);
        carro.setCarga(false);
        carro.setCapacidadeCarga(7);
        carro.setArCondicionado(true);
        carro.setRadio(true);

        Combustivel combustivel = new Combustivel();
        carro.setCombustivel(combustivel);
        combustivel.setGasolina(true);
        combustivel.setAlcool(true);

        System.out.println(carro);


    }
}