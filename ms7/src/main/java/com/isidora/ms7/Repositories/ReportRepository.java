package com.isidora.ms7.Repositories;

import com.isidora.ms7.Entities.ReportEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ReportRepository extends JpaRepository<ReportEntity, Long> {


}
