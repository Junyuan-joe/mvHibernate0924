package model;
//手動建JPA 方式
import javax.persistence.*;

@Entity
@Table(name="student")//SQL 名字一樣
public class Student {
	
	@Id	
     int id;
    
	String userName;
     int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", userName=" + userName + ", age=" + age + "]";
	}
     
}
