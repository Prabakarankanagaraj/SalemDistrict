package com.example.SalemDistrict;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Constituency {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Serial_No")
	private int sno;
	@Column(name="Constituency")
	private String area;
	@Column(name="Candidate")
	private String winner;
	@Column(name="party")
	private String party;

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}
	
	public Constituency(String area, String winner, String party) {
		super();
		this.area = area;
		this.winner = winner;
		this.party = party;
	}

	public Constituency(int sno, String area, String winner, String party) {
		super();
		this.sno = sno;
		this.area = area;
		this.winner = winner;
		this.party = party;
	}

	public Constituency() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Constituency [sno=" + sno + ", area=" + area + ", winner=" + winner + ", party=" + party + "]";
	}
}
