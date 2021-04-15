package CoStudy.domain;

import java.io.Serializable;

public class GroupPuserVO implements Serializable{
	private int user_no;
	private int studyGroup_no;
	
	public GroupPuserVO () {
		
	}

	public GroupPuserVO(int user_no, int studyGroup_no) {
		super();
		this.user_no = user_no;
		this.studyGroup_no = studyGroup_no;
	}

	public int getUser_no() {
		return user_no;
	}

	public void setUser_no(int user_no) {
		this.user_no = user_no;
	}

	public int getStudyGroup_no() {
		return studyGroup_no;
	}

	public void setStudyGroup_no(int studyGroup_no) {
		this.studyGroup_no = studyGroup_no;
	}

	@Override
	public String toString() {
		return "GroupPuser [user_no=" + user_no + ", studyGroup_no=" + studyGroup_no + "]";
	}
	
	
}
