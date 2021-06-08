package com.website.portfolio.service;

import com.website.portfolio.client.GitHubClient;
import com.website.portfolio.client.model.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GitHubService {
  private GitHubClient gitHubClient;

  @Autowired
  public GitHubService(GitHubClient client) {
    gitHubClient = client;
  }

  public List<Repository> getRepositories() {
    String token = "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";

    return gitHubClient.getRepositories(token);
  }
}
