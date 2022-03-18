package gettersSetters;

/* ****** GETTERS AND SETTERS - Exercise : Book ******
 * 
 * Here's a class named Book. It has three fields: 
 * a string field title, 
 * an int field yearOfPublishing, 
 * an array of strings authors.
 * 
 * Write getters and setters for all fields.
 */
class Book {

	private String title;
	private int yearOfPublishing;
	private String[] authors;  

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if (!java.util.Objects.equals(title, null)) {
			this.title = title;
		}
	}

	public int getYearOfPublishing() {
		return yearOfPublishing;
	}

	public void setYearOfPublishing(int yearOfPublishing) {
		this.yearOfPublishing = yearOfPublishing;
	}

	public String[] getAuthors() {
		return java.util.Arrays.copyOf(this.authors, this.authors.length);
	}

	public void setAuthors(String[] authors) {
		if (!java.util.Objects.equals(authors, null)) {
			this.authors = java.util.Arrays.copyOf(authors, authors.length);
		}
	}
}
