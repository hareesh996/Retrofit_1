package com.retrofit.basic;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class GitHubServiceConfiguration {
	
	public static void main(String[] args) {
		OkHttpClient okHttpClient = new OkHttpClient.Builder().build();
		// build the Retrofit
		Retrofit retrofit = new Retrofit.Builder().baseUrl("https://api.github.com")
				.addCallAdapterFactory(RxJavaCallAdapterFactory.create()).client(okHttpClient)
				.addConverterFactory(JacksonConverterFactory.create()).build();
		
		GitHubService gitHubService =  retrofit.create(GitHubService.class);
		Call<GitHubSearchResponse> gitHubSvcResponse = gitHubService.searchUsers("john");
		// considering that the github service is asynchronous.
		gitHubSvcResponse.enqueue(new Callback<GitHubSearchResponse>() {
			
			public void onResponse(Call<GitHubSearchResponse> call, Response<GitHubSearchResponse> response) {
				// TODO success
				
			}
			public void onFailure(Call<GitHubSearchResponse> call, Throwable t) {
				// TODO In case of errors
				
			}
		});
	}
	
}
