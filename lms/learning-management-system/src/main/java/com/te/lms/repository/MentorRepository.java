package com.te.lms.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.lms.entity.Mentor;

@Repository
public interface MentorRepository extends JpaRepository<Mentor, String>{

	Optional<Mentor> findByMentorName(String mentorName);

}
