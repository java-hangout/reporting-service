package com.kt.ts.reportingservice.controller;

import com.kt.ts.reportingservice.service.ReportingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reports")
public class ReportingController {
    @Autowired
    private ReportingService reportingService;

    @GetMapping("/open-tickets/count")
    public ResponseEntity<Long> countOpenTickets() {
        return ResponseEntity.ok(reportingService.countOpenTickets());
    }

    @GetMapping("/closed-tickets/count")
    public ResponseEntity<Long> countClosedTickets() {
        return ResponseEntity.ok(reportingService.countClosedTickets());
    }
}
