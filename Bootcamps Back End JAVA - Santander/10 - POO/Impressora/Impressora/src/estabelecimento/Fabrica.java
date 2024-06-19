package estabelecimento;

import Equipamentos.copiadora.Copiadora;
import Equipamentos.digitalizadora.Digitalizadora;
import Equipamentos.impressora.Impressora;
import Equipamentos.multifuncional.EquipamentosMultiFuncional;

public class Fabrica {
    public static void main(String[] args) {

        EquipamentosMultiFuncional em = new EquipamentosMultiFuncional();

        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
