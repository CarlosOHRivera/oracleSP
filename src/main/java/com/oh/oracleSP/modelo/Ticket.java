package com.oh.oracleSP.modelo;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NamedStoredProcedureQueries({
 @NamedStoredProcedureQuery(name = "firstProcedure",
         procedureName = "getTickets",
         parameters = @StoredProcedureParameter(mode = ParameterMode.REF_CURSOR,type = List.class))

        ,
        @NamedStoredProcedureQuery(name = "secondProcedure", procedureName = "getTicketsByCategory",
                parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "tcategory", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.REF_CURSOR,name = "p_cursor",type = List.class)
        }      )
        ,

        @NamedStoredProcedureQuery(name = "thirdProcedure",procedureName = "getTicketsByCategory1",parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN,name="tcategory",type = String.class),
                @StoredProcedureParameter(mode= ParameterMode.REF_CURSOR,name = "p_cursor", type = List.class)
        }      )
        ,
        @NamedStoredProcedureQuery(name = "discountProcedure", procedureName = "setTicketsdiscount", parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "tcategory", type = String.class) })

,
        @NamedStoredProcedureQuery(name = "discountToAllProcedure",
                procedureName = "setDiscountAlltickets")

})
@Entity
@Table
@Getter
@Setter
public class Ticket {
    @Id
    private int id;
    private int amount;
    private float precio ;
    private float preciocondescuento ;
    @Column(length = 20)
    private String category;

}
