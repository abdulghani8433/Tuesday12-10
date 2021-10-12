package postgres.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User_type {
     
	
	@Id
	private  Long id;
	private String user_type_name;
	private Date created_on;
	private Date updated_on;
	private Boolean is_active;
	
	
	
	public User_type() {
		super();
	}



	public User_type(Long id, String user_type_name, Date created_on, Date updated_on, Boolean is_active) {
		super();
		this.id = id;
		this.user_type_name = user_type_name;
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



	public String getUser_type_name() {
		return user_type_name;
	}



	public void setUser_type_name(String user_type_name) {
		this.user_type_name = user_type_name;
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
		return "User_type [id=" + id + ", user_type_name=" + user_type_name + ", created_on=" + created_on
				+ ", updated_on=" + updated_on + ", is_active=" + is_active + "]";
	}
	
	
	
	
	
	
}
