public class Combustivel {
    private boolean gasolina = false;
    private boolean alcool = false;
    private boolean diesel = false;
    private boolean eletricidade = false;
    private boolean humano = false;
    private boolean animal = false;

    public boolean isGasolina() {
        return gasolina;
    }

    public void setGasolina(boolean gasolina) {
        this.gasolina = gasolina;
    }

    public boolean isAlcool() {
        return alcool;
    }



    public void setAlcool(boolean alcool) {
        this.alcool = alcool;
    }

    public boolean isDiesel() {
        return diesel;
    }

    public void setDiesel(boolean diesel) {
        this.diesel = diesel;
    }

    public boolean isEletricidade() {
        return eletricidade;
    }

    public void setEletricidade(boolean eletricidade) {
        this.eletricidade = eletricidade;
    }

    public boolean isHumano() {
        return humano;
    }

    public void setHumano(boolean humano) {
        this.humano = humano;
    }

    public boolean isAnimal() {
        return animal;
    }

    public void setAnimal(boolean animal) {
        this.animal = animal;
    }

    public String possuiToString(boolean bool){
        String possui;
        if(bool)
            possui = "Sim";
        else
            possui = "Não";
        return possui;
    }

    public String retornaPossuidos(){
        String temGasolina = "";
        String usaGasolina = "";
        String usaAlcool = "";
        String usaDiesel = "";
        String usaEletricidade = "";
        String usaHumano = "";
        String usaAnimal = "";

        if (gasolina)
            usaGasolina = "\nGasolina";
        if (alcool)
            usaAlcool = "\nAlcool";
        if (diesel)
            usaDiesel = "\nDiesel";
        if (eletricidade)
            usaEletricidade = "\nEletricidade";
        if (humano)
            usaHumano = "\nHumano";
        if (animal)
            usaAnimal = "\nAnimal";

        return usaGasolina + usaAlcool + usaDiesel + usaEletricidade + usaHumano + usaAnimal;
    }

    @Override
    public String toString() {
        return retornaPossuidos();
    }
}
