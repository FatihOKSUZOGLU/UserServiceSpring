package com.project1.ws.user;

import javax.persistence.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

@Data //Data
@Entity
public class User {
	
	@Id //
	@GeneratedValue	
	private long id ;
	
	@NotNull(message = "{project1.constraint.username.NotNull.message}")
	@Size(min = 4,max = 24)
	@UniqueUsername
	private String username;
	
	@NotNull
	@Size(min = 4,max = 24)
	private String displayName;
	
	@NotNull
	@Pattern(regexp = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?!.*\\s).*$",message="{project1.constraint.password.Pattern.message}")
	private String password;

	
	
}
