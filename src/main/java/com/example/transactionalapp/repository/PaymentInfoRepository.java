package com.example.transactionalapp.repository;

import com.example.transactionalapp.entity.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author mbucak on 15.05.2024 11:38
 */
public interface PaymentInfoRepository extends JpaRepository<PaymentInfo, Long> {
}
