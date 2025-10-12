package com.pensionManagement.Modal;

public class PolicyCountDTO {

	private int activeCount;
	private int pendingReviewCount;
	private int lapsedCount;
	private int maturedCount;
	private int totalCount;

	public int getActiveCount() {
		return activeCount;
	}

	public void setActiveCount(int activeCount) {
		this.activeCount = activeCount;
	}

	public int getPendingReviewCount() {
		return pendingReviewCount;
	}

	public void setPendingReviewCount(int pendingReviewCount) {
		this.pendingReviewCount = pendingReviewCount;
	}

	public int getLapsedCount() {
		return lapsedCount;
	}

	public void setLapsedCount(int lapsedCount) {
		this.lapsedCount = lapsedCount;
	}

	public int getMaturedCount() {
		return maturedCount;
	}

	public void setMaturedCount(int maturedCount) {
		this.maturedCount = maturedCount;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
}
