public class SistemaDeSelecao {
    public static void main(String[] args) throws Exception {
    }

    static void selecaoCandidatos() {
        String [] candidatos = {"Walace", "Palloma", "Gabriel",};
    }

    static void analisarCandidatos(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("Estamos aguardando os demais candidatos.");
        }
        else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar par o candidato com uma contraproposta.");
        }
        else {
            System.out.println("Ligar para o candidato.");
        }
    }

}
