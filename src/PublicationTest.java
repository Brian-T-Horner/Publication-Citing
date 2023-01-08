/**
 * The {@code PublicationTest} class tests Apa and Mla citation styles for classes
 * related to the Publication interface
 */

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PublicationTest {

  private Publication rushdie;
  private Publication turing;
  private Publication ccis;

  /**
   * Initializes a new book for testing MLA and APA citation styles
   */
  @Before
  public void setupBook(){
    rushdie = new Book("Midnight's Children", "Salman Rushdie", "Jonathan Cape",
        "London", 1980);
  }

  /**
   * Initializes a new article for testing MLA and APA citation styles
   */
  @Before
  public void setupArticle(){
   turing = new Article("Computing machinery and intelligence", "A. M. Turing",
        "Mind", 59, 236, 1950);
  }



  /**
   * Initializes a new webpage for testing MLA and APA citation styles
   */
  @Before
  public void setupWebpage(){
    ccis = new Webpage("CCIS at Northeastern University",
         "https://www.ccis.northeastern.edu/", "10th August 2018");
  }


  /**
   * Tests the book APA citation method.
   */
  @Test
  public void testCiteApaBook(){
    String expectedOutput = "Salman Rushdie (1980). Midnight's Children. London: Jonathan Cape.";
    assertEquals(expectedOutput, rushdie.citeApa());
  }

  /**
   * Tests the book MLA citation method.
   */
  @Test
  public void testCiteMlaBook(){
    String expectedOutput = "Salman Rushdie. Midnight's Children. London: Jonathan Cape, 1980.";
    assertEquals(expectedOutput, rushdie.citeMla());
  }

  /**
   * Tests the article APA citation method.
   */
  @Test
  public void testCiteApaArticle(){
    String expectedOutput = "A. M. Turing (1950). Computing machinery and intelligence. Mind, 59(236).";
    assertEquals(expectedOutput, turing.citeApa());
  }

  /**
   * Tests the article MLA citation method.
   */
  @Test
  public void testCiteMlaArticle(){
    String expectedOutput = "A. M. Turing. \"Computing machinery and intelligence.\" Mind 59.236 (1950).";
    assertEquals(expectedOutput, turing.citeMla());
  }

  /**
   * Tests the webpage APA citation method.
   */
  @Test
  public void testCiteApaWebpage(){
    String expectedOutput = "CCIS at Northeastern University. Retrieved 10th August 2018, from https://www.ccis"
        + ".northeastern.edu/.";
    assertEquals(expectedOutput, ccis.citeApa());
  }

  /**
   * Tests the webpage MLA citation method.
   */
  @Test
  public void testCiteMlaWebpage(){
    String expectedOutput = "\"CCIS at Northeastern University.\" Web. 10th August 2018 "
        + "<https://www.ccis.northeastern.edu/>.";
    assertEquals(expectedOutput, ccis.citeMla());
  }
}
