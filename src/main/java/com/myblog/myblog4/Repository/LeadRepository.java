package com.myblog.myblog4.Repository;

import com.myblog.myblog4.Entity.Lead;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeadRepository extends JpaRepository<Lead,Long> {
}
