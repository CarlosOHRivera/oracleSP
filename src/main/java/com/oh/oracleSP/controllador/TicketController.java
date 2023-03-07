package com.oh.oracleSP.controllador;

import com.oh.oracleSP.modelo.Ticket;
import com.oh.oracleSP.dao.TicketDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TicketController {
    @Autowired
    private TicketDao dao;

    @GetMapping("/findTicket")
    public List<Ticket> findTickets() {
        return dao.getTicketInfo();
    }

    @GetMapping("/findTicketByCategory/{category}")
    public List<Ticket> findTicketsByCategory(@PathVariable String category) {
        category.trim();
        return dao.getTicketInfoByCategory(category);
    }

    @GetMapping("/findTicketByCategory1/{category}")
    public List<Ticket> findTicketsByCategory1(@PathVariable String category) {
        return dao.getTicketInfoByCategory1(category);
    }
    @GetMapping("/DescuentoByCategory/{category}")
    public List<Ticket> discountProcedure(@PathVariable String category) {
        dao.setTicketDiscount(category);
        return dao.getTicketInfo();
    }

    @GetMapping("/tododescuento")
    public HttpStatus discountToALLProcedure() {
        dao.setTicketDiscountToAll();
        return HttpStatus.OK;
    }

}
