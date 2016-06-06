package com.retrofit.basic;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GitHubSearchResponse {

	private String totalCount;

	private String incompleteResults;

	@JsonProperty("total_count")
	public String getTotalCount() {
		return totalCount;
	}

	@JsonProperty("total_count")
	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	@JsonProperty("incomplete_results")
	public String getIncompleteResults() {
		return incompleteResults;
	}

	@JsonProperty("incomplete_results")
	public void setIncompleteResults(String incompleteResults) {
		this.incompleteResults = incompleteResults;
	}

}
