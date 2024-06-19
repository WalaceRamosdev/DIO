package Equipamentos.multifuncional;

import Equipamentos.copiadora.Copiadora;
import Equipamentos.digitalizadora.Digitalizadora;
import Equipamentos.impressora.Impressora;

public class EquipamentoMultiFuncional implements Copiadora, Digitalizadora, Impressora {
    
    public void copiadora() {
        System.out.println("Copiando via equipamento multifuncional");
    }

    public void digitalizadora() {
        System.out.println("Digitalizando via equipamento multifuncional");
    }

    public void impressora() {
        System.out.println("Imprimindo via equipamento multifuncional");
        }


}
