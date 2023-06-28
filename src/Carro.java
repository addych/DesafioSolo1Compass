public class Carro extends Veiculo{
    private boolean arCondicionado;
    private boolean radio;

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public boolean isRadio() {
        return radio;
    }

    public void setRadio(boolean radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Carro: " +
                "\n Possui Ar Condicionado = " + possuiToString(arCondicionado) +
                ",\n Possui Radio = " + possuiToString(radio) +
                super.toString();
    }
}
