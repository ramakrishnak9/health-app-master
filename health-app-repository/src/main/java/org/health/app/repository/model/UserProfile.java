package org.health.app.repository.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.health.app.repository.common.model.BaseEntity;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "user_profile")
public class UserProfile extends BaseEntity<Long> {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "INT(11)")
	private Long id;

	@Override
	public Long getId() {
		return id;
	}

	@Column
	private String firstName;

	@Column
	private String lastName;

	@Column
	private String fullName;

	@Column
	private String email;

	@Column
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean acceptTermsOfService;

	private String timeZone;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFullName() {
		return fullName;
	}

	public String getEmail() {
		return email;
	}

	public boolean isAcceptTermsOfService() {
		return acceptTermsOfService;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public static Builder getBuilder() {
		return new Builder();
	}

	public static class Builder {

		private UserProfile profile;

		public Builder() {
			profile = new UserProfile();
		}

		public Builder acceptTermsOfService(boolean acceptTermsOfService) {
			profile.acceptTermsOfService = acceptTermsOfService;
			return this;
		}

		public Builder timeZone(String timeZone) {
			profile.timeZone = timeZone;
			return this;
		}

		public Builder lastName(String lastName) {
			profile.lastName = lastName;
			return this;
		}

		public Builder firstName(String firstName) {
			profile.firstName = firstName;
			return this;
		}

		public Builder email(String email) {
			profile.email = email;
			return this;
		}

		public Builder fullName(String fullName) {
			profile.fullName = fullName;
			return this;
		}

		public UserProfile build() {
			return profile;
		}

	}

}
