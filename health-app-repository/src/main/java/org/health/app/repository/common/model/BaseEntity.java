package org.health.app.repository.common.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Version;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

@MappedSuperclass
public abstract class BaseEntity<ID> {

	public abstract ID getId();

	@Version
	private long version;

	@Column(name = "created_time")
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime createdTime;

	@Column(name = "created_user")
	private String createdUser;

	@Column(name = "last_updated_time")
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime lastUpdatedTime;

	@Column(name = "last_updated_user")
	private String lastUpdatedUser;

	public long getVersion() {
		return version;
	}

	@PrePersist
	public void prePersist() {
		DateTime now = DateTime.now();
		this.createdTime = now;
		this.lastUpdatedTime = now;
	}

	@PreUpdate
	public void preUpdate() {
		this.lastUpdatedTime = DateTime.now();
	}

	public DateTime getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(DateTime createdTime) {
		this.createdTime = createdTime;
	}

	public String getCreatedUser() {
		return createdUser;
	}

	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}

	public DateTime getLastUpdatedTime() {
		return lastUpdatedTime;
	}

	public void setLastUpdatedTime(DateTime lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}

	public String getLastUpdatedUser() {
		return lastUpdatedUser;
	}

	public void setLastUpdatedUser(String lastUpdatedUser) {
		this.lastUpdatedUser = lastUpdatedUser;
	}

	public void setVersion(long version) {
		this.version = version;
	}

}
