package org.health.app.repository.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.health.app.repository.common.model.BaseEntity;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

@Entity
@Table(name = "user_account")
public class UserAccount extends BaseEntity<Integer> {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "INT(11)")
	private Integer id;

	@Override
	public Integer getId() {
		return id;
	}

	@Column
	private String userName;

	@Column
	private String email;

	@Column
	private String password;

	@Column
	private String passwordSalt;

	@Column
	private String passwordHashAlgorithm;

	@Column
	private String passwordReminderToken;

	@Column
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime passwordReminderExpire;

	@Column
	private String emailConfirmationToken;

	@Column
	private Integer userAccountStatusId;

	public String getUserName() {
		return userName;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getPasswordSalt() {
		return passwordSalt;
	}

	public String getPasswordHashAlgorithm() {
		return passwordHashAlgorithm;
	}

	public String getPasswordReminderToken() {
		return passwordReminderToken;
	}

	public DateTime getPasswordReminderExpire() {
		return passwordReminderExpire;
	}

	public String getEmailConfirmationToken() {
		return emailConfirmationToken;
	}

	public Integer getUserAccountStatusId() {
		return userAccountStatusId;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.SIMPLE_STYLE).toString();
	}

	public static Builder getBuilder() {
		return new Builder();
	}

	public static class Builder {

		private UserAccount userAccount;

		public UserAccount build() {
			return userAccount;
		}

		public Builder() {
			userAccount = new UserAccount();
		}

		public Builder userName(String userName) {
			userAccount.userName = userName;
			return this;
		}

		public Builder email(String email) {
			userAccount.email = email;
			return this;
		}

		public Builder password(String password) {
			userAccount.password = password;
			return this;
		}

		public Builder passwordSalt(String passwordSalt) {
			userAccount.passwordSalt = passwordSalt;
			return this;
		}

		public Builder passwordHashAlgorithm(String passwordHashAlgorithm) {
			userAccount.passwordHashAlgorithm = passwordHashAlgorithm;
			return this;
		}

		public Builder emailConfirmationToken(String emailConfirmationToken) {
			userAccount.emailConfirmationToken = emailConfirmationToken;
			return this;
		}

		public Builder userAccountStatusId(Integer userAccountStatusId) {
			userAccount.userAccountStatusId = userAccountStatusId;
			return this;
		}

		public Builder passwordReminderExpire(DateTime passwordReminderExpire) {
			userAccount.passwordReminderExpire = passwordReminderExpire;
			return this;
		}

		public Builder passwordReminderToken(String passwordReminderToken) {
			userAccount.passwordReminderToken = passwordReminderToken;
			return this;
		}

	}

}
