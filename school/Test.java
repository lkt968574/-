package school;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		 Course course=new Course(1, "��ѧ¥", "301",3,3);
		 Teacher teather=new Teacher(1, "����ʦ", "woman",course);
		 Student student=new Student(1, "С��", "man",course,teather);
		 System.out.println(student.toString());
		 student.delete();
//		 student.setCourse(null);
//		 student.setTeather(null);
		 student.putcourse();
		 
	}
	

}
