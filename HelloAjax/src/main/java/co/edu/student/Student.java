package co.edu.student;

public class Student {
	private int StudentNo;
	private String StudentName;
	private int engScore;
	private int korScore;
	
	public int getStudentNo() {
		return StudentNo;
	}
	
	public void setStudentNo(int studentNo) {
		StudentNo = studentNo;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public int getEngScore() {
		return engScore;
	}
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	public int getKorScore() {
		return korScore;
	}
	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	
	@Override
	public String toString() {
		return "Student [StudentNo=" + StudentNo + ", StudentName=" + StudentName + ", engScore=" + engScore
				+ ", korScore=" + korScore + "]";
	}
}
