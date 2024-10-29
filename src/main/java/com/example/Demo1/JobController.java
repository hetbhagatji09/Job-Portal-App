package com.example.Demo1;

import com.example.Demo1.Services.JobService;
import com.example.Demo1.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping({"/","home"})
    public String home(){

        System.out.println("Home method");
        return "home";
    }
    @GetMapping("addjob")
    public String addJob(){

        System.out.println("Add Job method");
        return "addJob";
    }
    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost){
        jobService.addJob(jobPost);
        return "success";
    }
    @GetMapping("viewalljobs")
    public String viewalljobs(Model model){
        List<JobPost> jobs=jobService.getAllJobs();
        model.addAttribute("jobPosts",jobs);

        return "viewAlljobs";
    }
}
