package com.isidora.ms7.Services;


import com.isidora.ms7.Entities.ReportEntity;
import com.isidora.ms7.Repositories.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportService {


    @Autowired
    ReportRepository reportRepository;

    public List<ReportEntity> getAllReports(){
        return reportRepository.findAll();
    }
}


