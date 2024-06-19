package estabelecimento;

import Equipamentos.impressora.DeskJet;
import Equipamentos.impressora.Impressora;
import Equipamentos.impressora.LaserJet;
import Equipamentos.multifuncional.EquipamentoMultiFuncional;

public class Fabrica {
    public static void main(String[] args) {
        Impressora impressora = new EquipamentoMultiFuncional();

        impressora.imprimir();
    }
}
