package com.website.portfolio.client;

import com.website.portfolio.client.connector.GitHubRepositoryConnector;
import com.website.portfolio.client.model.Repository;
import feign.Feign;
import feign.jackson.JacksonDecoder;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GitHubClient {

  public List<Repository> getRepositories(String gitHubToken) {
    GitHubRepositoryConnector connector = Feign.builder()
      .decoder(new JacksonDecoder())
      .target(GitHubRepositoryConnector.class, "https://api.github.com");

    List<Repository> response = connector.getRepositories(gitHubToken);
    return response;
  }
}
