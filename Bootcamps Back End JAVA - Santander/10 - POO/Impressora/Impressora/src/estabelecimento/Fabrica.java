package estabelecimento;

import Equipamentos.impressora.Impressora;
import Equipamentos.multifuncional.EquipamentosMultiFuncional;

public class Fabrica {
    public static void main(String[] args) {
        Impressora impressora = new EquipamentosMultiFuncional();

        impressora.imprimir();
    }
}
