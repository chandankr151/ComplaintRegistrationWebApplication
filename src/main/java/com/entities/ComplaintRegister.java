package com.entities;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class ComplaintRegister {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int ticketNo;
	@Column(length = 200)
	private String projectName;
	@Column(length = 200)
	private String moduleName;
	@Column(length = 200)
	private String subModuleName;
	@Column(length = 2000)
	private String issue;
	@Column
	private String priority;
	@Column
	private String status;
	@Column
	private String frequency;
	@Column
	private LocalDate date;
	@Column
	private LocalTime time;

	public ComplaintRegister() {
		super();
	}

	public int getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getSubModuleName() {
		return subModuleName;
	}

	public void setSubModuleName(String subModuleName) {
		this.subModuleName = subModuleName;
	}

	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "ComplaintRegister [ticketNo=" + ticketNo + ", projectName=" + projectName + ", moduleName=" + moduleName
				+ ", subModuleName=" + subModuleName + ", issue=" + issue + ", priority=" + priority + ", status="
				+ status + ", frequency=" + frequency + ", date=" + date + ", time=" + time + "]";
	}

}