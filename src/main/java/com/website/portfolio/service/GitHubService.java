package com.website.portfolio.service;

import com.website.portfolio.Token;
import com.website.portfolio.client.GitHubClient;
import com.website.portfolio.client.model.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GitHubService {
  private GitHubClient gitHubClient;
  private Token myGitHubToken;

  @Autowired
  public GitHubService(GitHubClient client, Token token) {
    gitHubClient = client;
    myGitHubToken = token;
  }

  public List<Repository> getRepositories() {

    return gitHubClient.getRepositories(myGitHubToken.getMyToken());
  }
}
