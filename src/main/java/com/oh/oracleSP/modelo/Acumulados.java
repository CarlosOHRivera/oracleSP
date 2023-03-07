package com.oh.oracleSP.modelo;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@Table
@Getter
@Setter

@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(
                name = "acumularenacumulados", procedureName = "setAcumulados",
        parameters = @StoredProcedureParameter(mode = ParameterMode.REF_CURSOR,type = List.class)
        )
})
public class Acumulados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 20)
    private String namecategory;
    private int sumacantidad;
    private float sumaprecio;
    private float sumapreciocondescuento;
    private float totaldescuento;
}
