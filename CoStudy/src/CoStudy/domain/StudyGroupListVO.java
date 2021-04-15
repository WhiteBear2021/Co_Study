package CoStudy.domain;

import java.util.List;

public class StudyGroupListVO {

	private List<StudyGroupVO> list;
	private int requestPage;
	private int totalPageCount;
	private int startPage;
	private int endPage;
	
	public StudyGroupListVO() {}

	public StudyGroupListVO(List<StudyGroupVO> list, int requestPage, int totalPageCount, int startPage, int endPage) {
		super();
		this.list = list;
		this.requestPage = requestPage;
		this.totalPageCount = totalPageCount;
		this.startPage = startPage;
		this.endPage = endPage;
	}

	public List<StudyGroupVO> getList() {
		return list;
	}

	public void setList(List<StudyGroupVO> list) {
		this.list = list;
	}

	public int getRequestPage() {
		return requestPage;
	}

	public void setRequestPage(int requestPage) {
		this.requestPage = requestPage;
	}

	public int getTotalPageCount() {
		return totalPageCount;
	}

	public void setTotalPageCount(int totalPageCount) {
		this.totalPageCount = totalPageCount;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	@Override
	public String toString() {
		return "StudyGroupListVO [list=" + list + ", requestPage=" + requestPage + ", totalPageCount=" + totalPageCount
				+ ", startPage=" + startPage + ", endPage=" + endPage + "]";
	}
	
	
	
}