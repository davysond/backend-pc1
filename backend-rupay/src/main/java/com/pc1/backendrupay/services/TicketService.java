package com.pc1.backendrupay.services;

import com.pc1.backendrupay.domain.TicketModel;
import com.pc1.backendrupay.enums.TypeTicket;
import com.pc1.backendrupay.exceptions.UserNotFoundException;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TicketService {
    public TicketModel buyTicket(UUID id, TypeTicket typeTicket) throws UserNotFoundException;
    public List<TicketModel> listTypeTickets();
    public List<TicketModel> listTicketByUserId(UUID id) throws UserNotFoundException;
    public Optional<TicketModel> consultTicketById(UUID id);

    public List<TicketModel> listTicketsActives(UUID id) throws UserNotFoundException;
}
