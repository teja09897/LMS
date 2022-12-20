package com.te.lms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.te.lms.entity.RequestList;

@Repository
public interface RequestListRepository extends JpaRepository<RequestList, String>{

	@Query(value = "select * from request_list",nativeQuery = true)
	List<RequestList> getList();

}
