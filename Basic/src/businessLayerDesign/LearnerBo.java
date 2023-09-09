package businessLayerDesign;

import java.util.ArrayList;
import java.util.List;


public class LearnerBo {
	List<LearnerVo> students;
	
	public LearnerBo() {
		students = new ArrayList<LearnerVo>();
		LearnerVo s1 = new LearnerVo("Sam",0);
		LearnerVo s2 = new LearnerVo("joan",1);
		students.add(s1);
		students.add(s2);
	}
	public void deleteStudent(LearnerVo student) {
		students.remove(student.getRollNo());
		System.out.println("Student:Roll"+student.getRollNo()+",deleted from database");
	}
	//retrive list of students from the database
	public List<LearnerVo>getAllStudents(){
		return students;
	}
	public LearnerVo getStudent(int rollNo) {
		return students.get(rollNo);
	}
	public void updateStudent(LearnerVo student) {
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println(("Student: Roll No " + student.getRollNo() +", updated in the database"));
	}
}
