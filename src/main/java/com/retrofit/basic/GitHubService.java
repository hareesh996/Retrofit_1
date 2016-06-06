package com.retrofit.basic;


import retrofit2.Call;
import retrofit2.http.Query;


public interface GitHubService {
	
	 public Call<GitHubSearchResponse> searchUsers(@Query("q")String userName);
	 
}
