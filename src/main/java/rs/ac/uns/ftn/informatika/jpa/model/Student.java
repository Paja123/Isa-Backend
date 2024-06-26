package rs.ac.uns.ftn.informatika.jpa.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "indexNumber", unique = true, nullable = false)
	private String index;

	@Column(name = "firstName", nullable = false)
	private String firstName;

	@Column(name = "lastName", nullable = false)
	private String lastName;

	@OneToMany(mappedBy = "student", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Exam> exams = new HashSet<Exam>();

	public Student() {
		super();
	}

	public Student(Integer id, String index, String firstName, String lastName) {
		super();
		this.id = id;
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Set<Exam> getExams() {
		return exams;
	}

	public void setExams(Set<Exam> exams) {
		this.exams = exams;
	}

	public void addExam(Exam exam) {
		exams.add(exam);
		exam.setStudent(this);
	}

	public void removeExam(Exam exam) {
		exams.remove(exam);
		exam.setStudent(null);
	}



	@Override	
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Student s = (Student) o;
		if (s.index == null || index == null) {
			return false;
		}
		return Objects.equals(index, s.index);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(index);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", index=" + index + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}
