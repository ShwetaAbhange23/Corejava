package businessLayerDesign;

public class TransferObjectpatternDemo {

	public static void main(String[] args) {
	LearnerBo st = new LearnerBo();
	
	for(LearnerVo students:st.getAllStudents()) {
		System.out.println("Student:[RollNo:"+students.getRollNo()+",Name:"+students.getName()+"]");
		//update student
		 LearnerVo student = st.getAllStudents().get(0);
		 student.setName("Michael");
		 st.updateStudent(student);
		 //get the student
		 student = st.getStudent(0);
		 System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
		 }
	}
	}
