package com.te.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.lms.entity.RequestList;

@Repository
public interface RequestListRepository extends JpaRepository<RequestList, String>{

}
