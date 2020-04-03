package com.website.portfolio.controller;

import com.website.portfolio.client.model.Repository;
import com.website.portfolio.service.GitHubService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@CrossOrigin(origins = "*", methods ={RequestMethod.GET}, allowedHeaders = {"*"})
@RestController
public class GitHubController {

  private GitHubService  gitHubService;

  public GitHubController (GitHubService service) {
    gitHubService = service;
  }

  @RequestMapping("/repositories")
  public List<Repository> getRepositories() {
    return gitHubService.getRepositories();
  }

}
