package entity;

import java.time.Instant;
import java.util.UUID;
import jakarta.validation.constraints.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID userId;
	
	@NotNull(message = "O campo nome nao pode estar nulo")
	@Column(name = "username")
	private String userName;
	
	@NotNull(message = "O campo email nao pode estar nulo")
	@Email
	@Column(name = "email")
	private String email;
	
	@NotNull(message = "O campo senha nao pode estar nulo")
	@Size(min = 8, message = "A senha deve ter no mínimo 8 caracteres")
	@Column(name = "password")
	private String password;
	
	@CreationTimestamp
	private Instant creationTimestamp;
	
	@UpdateTimestamp
	private Instant updateTimestamp;

	
	public User() {
		super();
	}


	public User(UUID userId, String userName, String email, String password, Instant creationTimestamp,
			Instant updateTimestamp) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.creationTimestamp = creationTimestamp;
		this.updateTimestamp = updateTimestamp;
	}


	public UUID getUserId() {
		return userId;
	}


	public void setUserId(UUID userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Instant getCreationTimestamp() {
		return creationTimestamp;
	}


	public void setCreationTimestamp(Instant creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}


	public Instant getUpdateTimestamp() {
		return updateTimestamp;
	}


	public void setUpdateTimestamp(Instant updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}
	
	
	

}
