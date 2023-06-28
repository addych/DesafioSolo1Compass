

public class Veiculo {
    private boolean motor;
    private boolean volante;
    private int quantidadePassageiros;
    private int quantidadePortas;
    private int quantidadeRodas;
    private boolean carga;
    private float capacidadeCarga;
    private Combustivel combustivel;

    public boolean isMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    public boolean isVolante() {
        return volante;
    }

    public void setVolante(boolean volante) {
        this.volante = volante;
    }

    public int getQuantidadePassageiros() {
        return quantidadePassageiros;
    }

    public void setQuantidadePassageiros(int quantidadePassageiros) {
        this.quantidadePassageiros = quantidadePassageiros;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadeRodas() {
        return quantidadeRodas;
    }

    public void setQuantidadeRodas(int quantidadeRodas) {
        this.quantidadeRodas = quantidadeRodas;
    }

    public boolean isCarga() {
        return carga;
    }

    public void setCarga(boolean carga) {
        this.carga = carga;
    }

    public float getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(float capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public Combustivel getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(Combustivel combustivel) {
        this.combustivel = combustivel;
    }

    public String possuiToString(boolean bool){
        String possui;
        if(bool)
            possui = "Sim";
        else
            possui = "Não";
        return possui;
    }

    @Override
    public String toString() {
        return  ",\n Possui Motor = " + possuiToString(motor) +
                ",\n Possui Volante = " + possuiToString(volante) +
                ",\n Quantidade de Passageiros = " + quantidadePassageiros +
                ",\n Quantidade de Portas = " + quantidadePortas +
                ",\n Quantida de Rodas = " + quantidadeRodas +
                ",\n Possui Carga = " + possuiToString(carga) +
                ",\n Capacidade da Carga (KG) = " + capacidadeCarga +
                ",\n*********************\nCombustiveis: " + combustivel.toString() +
                "\n";
    }
}
