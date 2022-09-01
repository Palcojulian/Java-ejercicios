
package com.gm.mundopc.dispoentrada;

import com.gm.mundopc.DispositivoEntrada;

public class Teclado  extends DispositivoEntrada{
    private final int idTeclado;
    private static int contadorTeclado;
    
    public Teclado(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Teclado: {idTeclado: ").append(idTeclado);
        sb.append(super.toString());
        return sb.toString();
    }
    
 
}
