package postgres.model;

import java.time.LocalDate;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;

@SuppressWarnings("unused")
@Entity
public class Users {
	@Id
	private Long id;
	private String username;
	@Min(value=18,message="user below 18 not allowed") 
	private Integer age;
	private Date date_of_birth;
	private String password;
	private Boolean is_active;
	private LocalDate created_on;
	private LocalDate updated_on;
	private Long user_type_id;
	
	public Long getUser_type_id() {
		return user_type_id;
	}

	public void setUser_type_id(Long user_type_id) {
		this.user_type_id = user_type_id;
	}

	public Users(Long user_type_id) {
		super();
		this.user_type_id = user_type_id;
	}

	public Users() {
		super();
	}

	public Users(Long id, String username, Integer age, Date date_of_birth, String password, Boolean is_active,
			LocalDate created_on, LocalDate updated_on) {
		super();
		this.id = id;
		this.username = username;
		this.age = age;
		this.date_of_birth = date_of_birth;
		this.password = password;
		this.is_active = is_active;
		this.created_on = created_on;
		this.updated_on = updated_on;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getIs_active() {
		return is_active;
	}

	public void setIs_active(Boolean is_active) {
		this.is_active = is_active;
	}

	public LocalDate getCreated_on() {
		return created_on;
	}

	public void setCreated_on(LocalDate created_on) {
		this.created_on = created_on;
	}

	public LocalDate getUpdated_on() {
		return updated_on;
	}

	public void setUpdated_on(LocalDate updated_on) {
		this.updated_on = updated_on;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", username=" + username + ", age=" + age + ", date_of_birth=" + date_of_birth
				+ ", password=" + password + ", is_active=" + is_active + ", created_on=" + created_on + ", updated_on="
				+ updated_on + ", user_type_id=" + user_type_id + "]";
	}

}