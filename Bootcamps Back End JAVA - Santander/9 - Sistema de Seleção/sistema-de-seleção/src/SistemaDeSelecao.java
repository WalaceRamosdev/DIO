import java.util.concurrent.ThreadLocalRandom;

public class SistemaDeSelecao {
    public static void main(String[] args) throws Exception {
    }

    static void selecaoCandidatos() {
        String [] candidatos = {"Walace", "Palloma", "Gabriel", "Camila", "Leonardo", "Lara", "Telma", "Willians", "Clayton", "Roni"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 200.0;
        while(candidatosSelecionados <= 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + "Solicitou este salário: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
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
