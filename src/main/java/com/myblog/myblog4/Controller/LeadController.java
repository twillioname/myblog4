package com.myblog.myblog4.Controller;

import com.myblog.myblog4.Payload.LeadDto;
import com.myblog.myblog4.Service.LeadService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/leads")
public class LeadController {

    private LeadService leadService;

    public LeadController(LeadService leadService){this.leadService=leadService;}

    @PostMapping
    public ResponseEntity<LeadDto>createLead (@RequestBody LeadDto leadDto){
        LeadDto dto = leadService.createLead(leadDto);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);

    }
}
