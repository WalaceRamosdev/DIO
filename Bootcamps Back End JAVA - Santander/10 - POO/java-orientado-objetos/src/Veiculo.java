public abstract class Veiculo {

    private String chassie;
    public String getChassie () {
        return chassie;
    }

    public void setChassie(String chassie) {
        this.chassie = chassie;
    }

    public abstract void ligar();

}
