package postgres.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private Long id;;
	private Date date_of_joining;
	private Date created_on;
	private Date updated_on;
	private Boolean is_active;
	private Long user_id;
	private Long dept_id;
	
	
	
	public Employee(Long id, Date date_of_joining, Date created_on, Date updated_on, Boolean is_active, Long user_id,
			Long dept_id) {
		super();
		this.id = id;
		this.date_of_joining = date_of_joining;
		this.created_on = created_on;
		this.updated_on = updated_on;
		this.is_active = is_active;
		this.user_id = user_id;
		this.dept_id = dept_id;
	}



	public Employee() {
		super();
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Date getDate_of_joining() {
		return date_of_joining;
	}



	public void setDate_of_joining(Date date_of_joining) {
		this.date_of_joining = date_of_joining;
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



	public Long getUser_id() {
		return user_id;
	}



	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}



	public Long getDept_id() {
		return dept_id;
	}



	public void setDept_id(Long dept_id) {
		this.dept_id = dept_id;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", date_of_joining=" + date_of_joining + ", created_on=" + created_on
				+ ", updated_on=" + updated_on + ", is_active=" + is_active + ", user_id=" + user_id + ", dept_id="
				+ dept_id + "]";
	}
	
	
	
}