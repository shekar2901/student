package com.ojas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="student")
public class StudentEntity {

	@Id
	@Column(name="sid")
	private int sid;
	@Column(name="sname")
	private String sname;
	@Column(name="smarks")
	private int smarks;
	@Column(name="sage")
	private int sage;
	@Column(name="sgrade")
	private char sgrade;
	@Column(name="sresult")
	private String sresult;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSmarks() {
		return smarks;
	}

	public void setSmarks(int smarks) {
		this.smarks = smarks;
	}

	public int getSage() {
		return sage;
	}

	public void setSage(int sage) {
		this.sage = sage;
	}

	public char getSgrade() {
		return sgrade;
	}

	public void setSgrade(char sgrade) {
		this.sgrade = sgrade;
	}

	public String getSresult() {
		return sresult;
	}

	public void setSresult(String sresult) {
		this.sresult = sresult;
	}

}
