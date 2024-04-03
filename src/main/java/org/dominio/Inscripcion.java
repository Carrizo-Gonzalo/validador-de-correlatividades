package org.dominio;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class Inscripcion
{
    private List<Materia> materiasAInscribirse;
    private Alumno alumno;

    public Inscripcion() {
        this.materiasAInscribirse = new ArrayList<>();
    }

    public boolean aprobada() {
        return this.materiasAInscribirse.stream().allMatch(m -> this.alumno.puedeCursar(m));
    }
}
