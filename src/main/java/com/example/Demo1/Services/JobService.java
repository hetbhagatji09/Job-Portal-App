package com.example.Demo1.Services;

import com.example.Demo1.Repository.JobRepository;
import com.example.Demo1.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;
    public void addJob(JobPost jobPost){
        jobRepository.addjobs(jobPost);

    }
    public List<JobPost> getAllJobs(){
        return  jobRepository.getJobs();
    }
}
