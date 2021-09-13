package com.njit.java.week1;

public class Novel {

	public Novel(String title, String genre, String editedBy, String directedBy) {
		novelStore(title, genre, editedBy, directedBy);
	}

	private void novelStore(String title, String genre, String editedBy, String directedBy) {

		System.out.println("Title: " + title);
		System.out.println("Genre: " + genre);
		System.out.println("Edited By: " + editedBy);
		System.out.println("Directed By: " + directedBy + "\n");

	}

}
