/**
 * The {@code Article} class represents bibliographic information for
 * articles.
 */
public class Article implements Publication{
  private final String title, author, journalName;
  private final int volume, issue, year;


/**
 * Constructs a {@code Article} object.
 *
 * @param title       title of the article
 * @param author      the author of the article
 * @param journalName the journal that published the article
 * @param volume      the volume of the journal that published the article
 * @param issue       the issue of the journal that published the article
 * @param year        the year of publication
 */

  public Article(String title, String author, String journalName, int volume, int issue,
      int year){
    this.title = title;
    this.author = author;
    this.journalName = journalName;
    this.volume = volume;
    this.issue = issue;
    this.year = year;
  }

  @Override
  public String citeApa(){
    return String.format("%s (%d). %s. %s, %d(%d).", author, year, title, journalName, volume,
        issue);
  }

  @Override
  public String citeMla(){
    return String.format("%s. \"%s.\" %s %d.%d (%d).",author, title, journalName, volume, issue,
        year);
  }
}
