package cl.tinet.devops.metrics.gen.bitbucket.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PullrequestParticipant {

	@JsonProperty("commit")
	private Commit commit;
	
	@JsonProperty("repository")
	private Repository repository;
	
	@JsonProperty("branch")
	private Branch branch;
	
	public PullrequestParticipant() {
	}

	public Commit getCommit() {
		return commit;
	}

	public void setCommit(Commit commit) {
		this.commit = commit;
	}

	public Repository getRepository() {
		return repository;
	}

	public void setRepository(Repository repository) {
		this.repository = repository;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "PullrequestParticipant [commit=" + commit + ", repository="
				+ repository + ", branch=" + branch + "]";
	}
}
