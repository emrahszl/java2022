package kodlamaHomeWork.entities;

public class Course {

	private int courseId;
	private String courseName;
	private String courseDescription;
	private String instrucktorId;
	private double courseUnitPrice;
	
	public Course() {
		
	}

	public Course(int courseId, String courseName, String courseDescription, String instrucktorId,
			double courseUnitPrice) {
		
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDescription = courseDescription;
		this.instrucktorId = instrucktorId;
		this.courseUnitPrice = courseUnitPrice;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	public String getInstrucktorId() {
		return instrucktorId;
	}

	public void setInstrucktorId(String instrucktorId) {
		this.instrucktorId = instrucktorId;
	}

	public double getCourseUnitPrice() {
		return courseUnitPrice;
	}

	public void setCourseUnitPrice(double courseUnitPrice) {
		this.courseUnitPrice = courseUnitPrice;
	}
}