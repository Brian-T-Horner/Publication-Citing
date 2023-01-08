/**
 * The {@code Webpage} class represents bibliographic information for
 * webpages.
 */
public class Webpage implements Publication{

  private final String title, url, date;


  /**
   * Constructs a {@code Webpage} object.
   *
   * @param title   the title of the webpage
   * @param url     the URL of the webpage
   * @param date    the date of download
   */

  public Webpage(String title, String url, String date){
    this.title = title;
    this.url = url;
    this.date = date;
  }

  // String.format("Hello %s, %d", "world", 42);

  @Override
  public String citeApa(){
    return String.format("%s. Retrieved %s, from %s.", title, date, url);
  }

  @Override
  public String citeMla(){
    return String.format("\"%s.\" Web. %s <%s>.", title, date, url);
  }




}
