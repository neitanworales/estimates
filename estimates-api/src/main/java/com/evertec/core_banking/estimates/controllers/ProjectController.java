package com.evertec.core_banking.estimates.controllers;

import com.evertec.core_banking.estimates.models.Project;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("api/estimates/")
public class ProjectController {

    @GetMapping("/projects")
    public ArrayList<Project> getAll(){
        ArrayList<Project> projects = new ArrayList<>();

        Project project1 = new Project();
        project1.setName("Core Manila Spurs");
        project1.setPhases(new ArrayList<>());

        projects.add(project1);
        return projects;
    }
}
