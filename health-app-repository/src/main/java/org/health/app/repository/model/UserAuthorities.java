package org.health.app.repository.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.health.app.repository.common.model.BaseEntity;

@Entity
@Table(name = "user_authorities")
public class UserAuthorities extends BaseEntity<Long> {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "INT(11)")
	private Long id;

	@Override
	public Long getId() {
		return id;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="user_profile_id")
	private UserProfile userProfile;

	@Column
	private String authority;


	public UserProfile getUserProfile() {
		return userProfile;
	}

	public String getAuthority() {
		return authority;
	}

	
	public static Builder getBuilder() {
		return new Builder();
	}

	public static class Builder {

		private UserAuthorities authorities;

		public Builder() {
			authorities = new UserAuthorities();
		}

		public UserAuthorities build() {
			return authorities;
		}

	}

}
