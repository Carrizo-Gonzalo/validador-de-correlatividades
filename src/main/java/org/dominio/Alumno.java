package org.dominio;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class Alumno {
    private String nombreApellido;
    private List<Materia> materiasAprobadas;
    private List<Materia> materiasPromocionadas;

    public Alumno() {
        this.materiasAprobadas = new ArrayList<>();
    }

    public boolean puedeCursar(Materia materia) {
        return this.materiasAprobadas.containsAll(materia.getMateriasAprobadasRequeridas()) &&
                this.materiasPromocionadas.containsAll(materia.getMateriasPromocionadasRequeridas());
    }
}
