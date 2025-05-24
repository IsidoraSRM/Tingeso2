package com.isidora.ms7.Controllers;


import com.isidora.ms7.Entities.ReportEntity;
import com.isidora.ms7.Services.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/reports")

public class ReportController {
    @Autowired
    ReportService reportService;

    @GetMapping("/all")
    public List<ReportEntity> getAllReports(){
        return reportService.getAllReports();
    }
    // ahhhhhh


}
