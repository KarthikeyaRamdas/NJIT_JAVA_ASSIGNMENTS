package com.njit.java.week1;

public class TextBook {

	private String title;
	private String author;
	private String editon;
	private String noOfPages;

	public TextBook(String title, String author, String edition, String noOfPages) {

		this.title = title;
		this.editon = edition;
		this.noOfPages = noOfPages;
		this.author = author;
		textBooksDisplay();

	}

	private String getTitle() {
		return title;
	}

	private void setTitle(String title) {
		this.title = title;
	}

	private String getAuthor() {
		return author;
	}

	private void setAuthor(String author) {
		this.author = author;
	}

	private String getEditon() {
		return editon;
	}

	private void setEditon(String editon) {
		this.editon = editon;
	}

	private String getNoOfPages() {
		return noOfPages;
	}

	private void setNoOfPages(String noOfPages) {
		this.noOfPages = noOfPages;
	}

	void textBooksDisplay() {

		System.out.println("Title: "+ getTitle());
		System.out.println("Author: "+getAuthor());
		System.out.println("Edition: "+getEditon());
		System.out.println("Pages: "+getNoOfPages()+"\n");
	}

}
