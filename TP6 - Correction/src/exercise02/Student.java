package exercise02;

public class Student {
	private String id;
	private String name;
	private String group = "I4A";
	private String department = "CS";
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return id.equalsIgnoreCase(Student())
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("id: %s\nName: %sGroup: %sDepartment: %s", id, name, group, department);
	}

	public Student(String id, String name, String group, String department) {
		this.id = id;
		this.name = name;
		this.group = group;
		this.department = department;
	}
	
}
