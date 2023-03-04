package com.dev.wallet.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import com.dev.wallet.enums.EntryType;
import com.dev.wallet.enums.StatusType;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="entries", schema="wallet")
public class Entries {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "desctiption")
	private String desctiption;
	
	@Column(name = "month")
	private Integer month;
	
	@Column(name = "year")
	private Integer year;
	
	@Column(name = "value")
	private BigDecimal value;
	
	@Column(name = "status")
	@Enumerated(value=EnumType.STRING)
	private StatusType status;
	
	@Column(name = "type")
	@Enumerated(value=EnumType.STRING)
	private EntryType type;
	
	@Column(name = "dt_registered")
	@Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)
	private LocalDate dt_registered;
	
	@ManyToOne
	@JoinColumn(name="id_user")
	private User user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDesctiption() {
		return desctiption;
	}

	public void setDesctiption(String desctiption) {
		this.desctiption = desctiption;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public StatusType getStatus() {
		return status;
	}

	public void setStatus(StatusType status) {
		this.status = status;
	}

	public EntryType getType() {
		return type;
	}

	public void setType(EntryType type) {
		this.type = type;
	}

	public LocalDate getDt_registered() {
		return dt_registered;
	}

	public void setDt_registered(LocalDate dt_registered) {
		this.dt_registered = dt_registered;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public int hashCode() {
		return Objects.hash(desctiption, dt_registered, id, month, status, type, user, value, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entries other = (Entries) obj;
		return Objects.equals(desctiption, other.desctiption) && Objects.equals(dt_registered, other.dt_registered)
				&& Objects.equals(id, other.id) && Objects.equals(month, other.month) && status == other.status
				&& type == other.type && Objects.equals(user, other.user) && Objects.equals(value, other.value)
				&& Objects.equals(year, other.year);
	}

	@Override
	public String toString() {
		return "Entries [id=" + id + ", desctiption=" + desctiption + ", month=" + month + ", year=" + year + ", value="
				+ value + ", status=" + status + ", type=" + type + ", dt_registered=" + dt_registered + ", user="
				+ user + "]";
	}
}
