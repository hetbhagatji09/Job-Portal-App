package com.example.Demo1.Repository;

import com.example.Demo1.model.JobPost;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface JobRepository extends JpaRepository<JobPost, Integer> {

}
