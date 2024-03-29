package SegundaParte.MovilPrepago;

public class MovilTarifaPlana extends MovilPrepagoClass {
    /**
     * Añade una nueva subclase de MovilPrepago llamada MovilTarifaPlana¸ 
     * en la que se redefine el método navegar para no reducir el saldo y 
     * además en el constructor fija el coste de navegación a cero.
     */

    /**
     * Modificamos para que no tenga consumo de mb:
     * @param number
     * @param costcall
     * @param costminutcall
     * @param costconsumMB
     * @param cash
     */
     public MovilTarifaPlana(int number, float costcall, float costminutcall, float cash) {
        super(number, costcall, costminutcall, 0, cash);
    }

    @Override
    public void navegar(int MB) {
        //float costoNavegacion = this.costeConsumoMB*MB;
        if(this.saldo > 0){
            System.err.println("Hecho");
        }else {
            System.err.println("No tienes suficiente saldo!");
        }
    }
}
