package com.website.portfolio.client.connector;

import com.website.portfolio.client.model.Repository;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

import java.util.List;

public interface GitHubRepositoryConnector {

  @Headers("Authorization: {token}")
  @RequestLine("GET /users/jlama94/repos")
  List<Repository> getRepositories(@Param("token") String token);
}
