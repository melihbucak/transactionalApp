package com.example.transactionalapp.repository;

import com.example.transactionalapp.entity.PassengerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author mbucak on 15.05.2024 11:37
 */
public interface PassengerInfoRepository extends JpaRepository<PassengerInfo,Long> {
}
