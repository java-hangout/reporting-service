package com.kt.ts.reportingservice.service;

import com.kt.ts.reportingservice.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportingService {
    @Autowired
    private TicketRepository ticketRepository;

    public long countOpenTickets() {
        return ticketRepository.findByStatus("Open").size();
    }

    public long countClosedTickets() {
        return ticketRepository.findByStatus("Closed").size();
    }

    // Add other reporting methods as needed
}
