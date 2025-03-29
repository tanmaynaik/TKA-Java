package com.tka.LibraryDetails.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Library {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookid;
	private String bname;
	private String genre;

	public Library() {

	}

	public Library(int bookid, String bname, String genre) {
		super();
		this.bookid = bookid;
		this.bname = bname;
		this.genre = genre;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Library [bookid=" + bookid + ", bname=" + bname + ", genre=" + genre + "]";
	}

}
