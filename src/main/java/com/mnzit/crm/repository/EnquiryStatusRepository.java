/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mnzit.crm.repository;

import com.mnzit.crm.entity.EnquiryStatus;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Mnzit
 */
@Repository
public interface EnquiryStatusRepository extends JpaRepository<EnquiryStatus, Long>{
    
    @Query(nativeQuery = true, value = "SELECT * FROM mst_enquiry_status WHERE is_deleted=false")
    List<EnquiryStatus> getEnquiryStatuses();
}
