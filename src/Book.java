/**
 * The {@code Book} class represents bibliographic information for
 * books.
 */
public class Book implements Publication {

  private final String title, author, publisher, location;
  private final int year;

  /**
   * Constructs a {@code Book} object.
   *
   * @param title     the title of the book
   * @param author    the author of the book
   * @param publisher the publisher of the book
   * @param location  the location of the publisher
   * @param year      the year of publication
   */
  public Book(String title, String author, String publisher, String location, int year) {
    this.title = title;
    this.author = author;
    this.publisher = publisher;
    this.location = location;
    this.year = year;
  }

  @Override
  public String citeApa() {
    return String.format("%s (%d). %s. %s: %s.", author, year, title, location, publisher);

  }

  @Override
  public String citeMla() {
    return String.format("%s. %s. %s: %s, %d.", author, title, location, publisher, year);
  }
}