package com.njit.java.week1;

public class Book {
	public String book1Title;
	public String book1Author;
	public String book1Genre;
	public String book1Characters;

	public String book2Title;
	public String book2Author;
	public String book2Genre;
	public String book2Characters;

	public Book() {

		this.setBook1Title("The Lord of the Rings");
		this.setBook1Author("J.R.R. Tolkien");
		this.setBook1Genre("High fantasy; Adventure");
		this.setBook1Characters("Gandalf, Gollum, Aragorn, Sauron, Frodo Baggins, MORE..");

		this.setBook2Title("Harry Potter and the Philosopher's Ston");
		this.setBook2Author("J.K. Rowling");
		this.setBook2Genre("Fantasy Fiction");
		this.setBook2Characters("Harry Potter, Hermione Granger, Lord Voldemort, MORE..");

	}

	public String getBook1Title() {
		return book1Title;
	}

	public void setBook1Title(String book1Title) {
		this.book1Title = book1Title;
	}

	public String getBook1Author() {
		return book1Author;
	}

	public void setBook1Author(String book1Author) {
		this.book1Author = book1Author;
	}

	public String getBook1Genre() {
		return book1Genre;
	}

	public void setBook1Genre(String book1Genre) {
		this.book1Genre = book1Genre;
	}

	public String getBook1Characters() {
		return book1Characters;
	}

	public void setBook1Characters(String book1Characters) {
		this.book1Characters = book1Characters;
	}

	public String getBook2Title() {
		return book2Title;
	}

	public void setBook2Title(String book2Title) {
		this.book2Title = book2Title;
	}

	public String getBook2Author() {
		return book2Author;
	}

	public void setBook2Author(String book2Author) {
		this.book2Author = book2Author;
	}

	public String getBook2Genre() {
		return book2Genre;
	}

	public void setBook2Genre(String book2Genre) {
		this.book2Genre = book2Genre;
	}

	public String getBook2Characters() {
		return book2Characters;
	}

	public void setBook2Characters(String book2Characters) {
		this.book2Characters = book2Characters;
	}

}
