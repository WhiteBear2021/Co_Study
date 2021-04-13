package CoStudy.domain;

public class StudyGroupVO {
	private int studygorup_no;
	private String studygorup_name;
	private String studygorup_info;
	private String studygorup_location;
	private int report_number;
	private int max_user_number;
	private int current_user_number;
	private String made_date;
	private int isdelete;
	private int isface;
	private int categori_no;
	private String user_no;
	private String hashtag;
	
	public StudyGroupVO() {}

	public StudyGroupVO(int studygorup_no, String studygorup_name, String studygorup_info, String studygorup_location,
			int report_number, int max_user_number, int current_user_number, String made_date, int isdelete, int isface,
			int categori_no, String user_no, String hashtag) {
		super();
		this.studygorup_no = studygorup_no;						//스터디 그룹 번호
		this.studygorup_name = studygorup_name;			//스터디 그룹 이름
		this.studygorup_info = studygorup_info;					//스터디 그룹 소개
		this.studygorup_location = studygorup_location;		//스터디 그룹 지역
		this.report_number = report_number;					//스터디 그룹 누적 신고수
		this.max_user_number = max_user_number;			//스터디 그룹 최대 인원
		this.current_user_number = current_user_number;//스터디 그룹 현재 인원
		this.made_date = made_date;								//스터디 그룹 만든 날짜
		this.isdelete = isdelete;											//스터디그룹 삭제 여부
		this.isface = isface;												//스터디그룹 대면 여부
		this.categori_no = categori_no;								//스터디그룹 카테고리
		this.user_no = user_no;										//스터디그룹 방장 번호
		this.hashtag = hashtag;											//스터디그룹 해쉬태그
	}

	public int getStudygorup_no() {
		return studygorup_no;
	}

	public void setStudygorup_no(int studygorup_no) {
		this.studygorup_no = studygorup_no;
	}

	public String getStudygorup_name() {
		return studygorup_name;
	}

	public void setStudygorup_name(String studygorup_name) {
		this.studygorup_name = studygorup_name;
	}

	public String getStudygorup_info() {
		return studygorup_info;
	}

	public void setStudygorup_info(String studygorup_info) {
		this.studygorup_info = studygorup_info;
	}

	public String getStudygorup_location() {
		return studygorup_location;
	}

	public void setStudygorup_location(String studygorup_location) {
		this.studygorup_location = studygorup_location;
	}

	public int getReport_number() {
		return report_number;
	}

	public void setReport_number(int report_number) {
		this.report_number = report_number;
	}

	public int getMax_user_number() {
		return max_user_number;
	}

	public void setMax_user_number(int max_user_number) {
		this.max_user_number = max_user_number;
	}

	public int getCurrent_user_number() {
		return current_user_number;
	}

	public void setCurrent_user_number(int current_user_number) {
		this.current_user_number = current_user_number;
	}

	public String getMade_date() {
		return made_date;
	}

	public void setMade_date(String made_date) {
		this.made_date = made_date;
	}

	public int getIsdelete() {
		return isdelete;
	}

	public void setIsdelete(int isdelete) {
		this.isdelete = isdelete;
	}

	public int getIsface() {
		return isface;
	}

	public void setIsface(int isface) {
		this.isface = isface;
	}

	public int getCategori_no() {
		return categori_no;
	}

	public void setCategori_no(int categori_no) {
		this.categori_no = categori_no;
	}

	public String getUser_no() {
		return user_no;
	}

	public void setUser_no(String user_no) {
		this.user_no = user_no;
	}

	public String getHashtag() {
		return hashtag;
	}

	public void setHashtag(String hashtag) {
		this.hashtag = hashtag;
	}

	@Override
	public String toString() {
		return "StudyGroupVO [studygorup_no=" + studygorup_no + ", studygorup_name=" + studygorup_name
				+ ", studygorup_info=" + studygorup_info + ", studygorup_location=" + studygorup_location
				+ ", report_number=" + report_number + ", max_user_number=" + max_user_number + ", current_user_number="
				+ current_user_number + ", made_date=" + made_date + ", isdelete=" + isdelete + ", isface=" + isface
				+ ", categori_no=" + categori_no + ", user_no=" + user_no + ", hashtag=" + hashtag + "]";
	}

	
	
}