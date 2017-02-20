package org.health.app.repository.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

@Entity
@Table(name = "user_account_status")
public class UserAccountStatus {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	@Column(columnDefinition = "INT(11)")
	private Long id;



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column
	private String code;

	@Column
	private String name;

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public static Builder getBuilder() {
		return new Builder();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.SIMPLE_STYLE).toString();
	}

	public static class Builder {

		private UserAccountStatus userAccountStatus;

		public Builder() {
			userAccountStatus = new UserAccountStatus();
		}

		public Builder name(String name) {
			userAccountStatus.name = name;
			return this;
		}

		public Builder code(String code) {
			userAccountStatus.code = code;
			return this;
		}

		public UserAccountStatus build() {
			return userAccountStatus;
		}

	}
}
