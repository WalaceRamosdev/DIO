

public class Carro {

    private String chassie;
    public String getChassie () {
        return chassie;
    }

    public void setChassie(String chassie) {
        this.chassie = chassie;
    }

    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.err.println("Carro ligado");
    }

    private void confereCombustivel() {
        System.out.println("Conferindo combustivel");
    }

    private void confereCambio() {
        System.out.println("Conferindo cambio em P");
    }


}
