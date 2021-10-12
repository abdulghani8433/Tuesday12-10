package postgres.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Department {
	
	@Id
	private Long id;
	private String dept_name;
	private Date created_on;
	private Date updated_on;
	private Boolean is_active;

	
	
	public Department() {
		
	}




	public Department(Long id, String dept_name, Date created_on, Date updated_on, Boolean is_active) {
		super();
		this.id = id;
		this.dept_name = dept_name;
		this.created_on = created_on;
		this.updated_on = updated_on;
		this.is_active = is_active;
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getDept_name() {
		return dept_name;
	}




	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}




	public Date getCreated_on() {
		return created_on;
	}




	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}




	public Date getUpdated_on() {
		return updated_on;
	}




	public void setUpdated_on(Date updated_on) {
		this.updated_on = updated_on;
	}




	public Boolean getIs_active() {
		return is_active;
	}




	public void setIs_active(Boolean is_active) {
		this.is_active = is_active;
	}




	@Override
	public String toString() {
		return "Department [id=" + id + ", dept_name=" + dept_name + ", created_on=" + created_on + ", updated_on="
				+ updated_on + ", is_active=" + is_active + "]";
	}
	
	
	
	
	

}
