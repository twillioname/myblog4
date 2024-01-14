package com.myblog.myblog4.Service.Impl;

import com.myblog.myblog4.Entity.Lead;
import com.myblog.myblog4.Payload.LeadDto;
import com.myblog.myblog4.Repository.LeadRepository;
import com.myblog.myblog4.Service.LeadService;
import org.springframework.stereotype.Service;

@Service
public class LeadServiceImpl implements LeadService {
    
    private LeadRepository leadRepository;
    
    public LeadServiceImpl(LeadRepository leadRepository){this.leadRepository=leadRepository;}

    @Override
    public LeadDto createLead(LeadDto leadDto) {

        Lead lead= new Lead();

        lead.setId(leadDto.getId());
        lead.setName(leadDto.getName());
        lead.setTitle(leadDto.getTitle());
        lead.setCity(leadDto.getCity());
        lead.setContent(leadDto.getContent());

        Lead savedLead = leadRepository.save(lead);

        LeadDto dto = new LeadDto();

        dto.setId(savedLead.getId());
        dto.setName(savedLead.getName());
        dto.setTitle(savedLead.getTitle());
        dto.setCity(savedLead.getCity());
        dto.setContent(savedLead.getContent());
        
        return dto;
    }
}
