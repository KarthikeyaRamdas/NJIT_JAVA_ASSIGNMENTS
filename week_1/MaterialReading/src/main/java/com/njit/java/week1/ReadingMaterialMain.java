package com.njit.java.week1;

public class ReadingMaterialMain {

	public static void main(String[] args) {

		ReadingClub readingClub = new ReadingClub();
		readingClub.readingMaterials();
		ReadingClub readingClub2 = new ReadingMaterial();
		readingClub2.readingMaterials();

		System.out.println("\n ...... TEXT BOOKS ......\n");
		TextBook textBook = new TextBook("Java Software Solutions", "John Lewis and William Loftus", "8th Edition",
				"210");
		TextBook textBook2 = new TextBook("Head First Java: A Brain-Friendly Guide", "Kathy Sierra and Bert Bate",
				"2nd Edition", "240");

		System.out.println("\n ...... Novels ......\n");
		Novel novel = new Novel("Anna Karenina", "Romance/Drama", "Robert Kern", "Clarence Brown");
		Novel novel2 = new Novel("One Hundred Years of Solitude genre", "Magical Realism",
				"Sudamericana, Harper & Row ", "clint eastwood");

		System.out.println("\n ...... Magazines ......\n");
		Magazine magazine = new Magazine("The New Yorker Magazine", "Condé Nast", " David Remnick");
		magazine.magazinesDisplay("Vogue Magazine", "Condé Nast", "Anna Wintour");

		System.out.println("\n ...... Books ......\n");
		Book book = new Book();
		System.out.println("Title: " + book.getBook1Title());
		System.out.println("Genre: " + book.getBook1Author());
		System.out.println("Edited By: " + book.getBook1Genre());
		System.out.println("Directed By: " + book.getBook1Characters() + "\n");

		System.out.println("Title: " + book.getBook2Title());
		System.out.println("Genre: " + book.getBook2Author());
		System.out.println("Edited By: " + book.getBook2Genre());
		System.out.println("Directed By: " + book.getBook2Characters() + "\n");

		System.out.println("Thanks for visiting the famous reading club in the world. Have a Good Day !!!");

	}

}
