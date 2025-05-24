package com.isidora.ms7.Services;


import com.isidora.ms7.Entities.ReportEntity;
import com.isidora.ms7.Models.ReservationEntity;
import com.isidora.ms7.Repositories.ReportRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ReportService {


    @Autowired
    ReportRepository reportRepository;
    @Autowired
    RestTemplate restTemplate;

    // URL Reservations
    public List<ReservationEntity> getAllReservations(){
        ResponseEntity<List<ReservationEntity>> response = restTemplate.exchange(
                "http://ms5/api/reservations/all",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<ReservationEntity>>() {}
        );
        return response.getBody();
    }

    public List<ReportEntity> getAllReports(){
        List<ReportEntity> reports = reportRepository.findAll();
        if(reports.isEmpty()) {
            throw new EntityNotFoundException("No se encontraron reportes");
            // O alternativamente: return Collections.emptyList();
        }
        return reports;

    }




}


