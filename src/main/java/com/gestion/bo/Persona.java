package com.gestion.bo;

public class Persona {
    int pisoDestino;
    int pisoPersona;

    public int getPisoDestino() {
        return pisoDestino;
    }

    public int asignarPisoAleatorio() throws Exception {
        this.pisoDestino = (int) (Math.random() * 3 + 1);
        if (this.pisoDestino > 3 || this.pisoDestino < 1) {
            throw new Exception("Asensor Fuera de Rango");
        }
        return this.pisoDestino;
    }

    public int crearPersona() throws Exception {
        pisoPersona = (int) (Math.random() * 3 + 1);
        if (pisoPersona > 3 || pisoPersona < 1) {
            throw new Exception("Fuera de Rango");
        }
        return pisoPersona;
    }

    public boolean llamarElevador() throws Exception {
        asignarPisoAleatorio();
        Boolean esDiferente=false;
        int newPerson=crearPersona();
        if (newPerson == pisoDestino) {
            throw new Exception("Pisos Iguales");
        }else {
            esDiferente=true;
            return esDiferente;
        }
    }


}
