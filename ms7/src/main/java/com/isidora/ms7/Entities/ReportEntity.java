package com.isidora.ms7.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.YearMonth;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Reports")
public class ReportEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReport;

    private String reportType; // "lapsTime" o "groupSize"
    private YearMonth month;
    private String category;   // Ej: "10 vueltas", "3-5 personas"
    private Double totalAmount;

}
