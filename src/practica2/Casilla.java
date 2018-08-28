/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

/**
 *
 * @author Moctezuma19
 */
public class Casilla {

    private int id;
    private int id_estado;
    private int id_distrito;
    private String tipo_casilla;
    private String aprobada;

    /**
     * Constructor de casilla.
     *
     * @param id identificador.
     * @param id_e identificador del estado.
     * @param id_d identificador del distrito.
     * @param tc tipo de casilla.
     * @param ap casilla aprobada.
     */
    public Casilla(int id, int id_e, int id_d, String tc, String ap) {
        this.id = id;
        this.id_estado = id_e;
        this.id_distrito = id_d;
        this.tipo_casilla = tc;
        this.aprobada = ap;
    }

    /**
     * Metodo para obtener el ID.
     *
     * @return identificador.
     */
    public int getId() {
        return this.id;
    }
    
    /**
     * Metodo para obtener la aprobacion
     * @return 
     */
    public String getAprobada(){
        return this.aprobada;
    }

    @Override
    public String toString() {
        return id + "," + id_estado + "," + id_distrito + "," + tipo_casilla + "," + aprobada;
    }
}
