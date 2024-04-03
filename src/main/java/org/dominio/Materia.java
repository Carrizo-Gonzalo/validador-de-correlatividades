package org.dominio;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class Materia {
    private String nombre;

    private List<Materia> materiasAprobadasRequeridas;
    private List<Materia> materiasPromocionadasRequeridas;

    public Materia() {
        this.materiasAprobadasRequeridas = new ArrayList<>();
    }
}
