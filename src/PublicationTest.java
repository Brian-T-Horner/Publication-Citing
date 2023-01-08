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

  @Before
  public void setupBook(){
    rushdie = new Book("Midnight's Children", "Salman Rushdie", "Jonathan Cape",
        "London", 1980);
  }

  @Before
  public void setupArticle(){
   turing = new Article("Computing machinery and intelligence", "A. M. Turing",
        "Mind", 59, 236, 1950);
  }



  @Before
  public void setupWebpage(){
    ccis = new Webpage("CCIS at Northeastern University",
         "https://www.ccis.northeastern.edu/", "10th August 2018");
  }


  @Test
  public void testCiteApaBook(){
    String expectedOutput = "Salman Rushdie (1980). Midnight's Children. London: Jonathan Cape.";
    assertEquals(expectedOutput, rushdie.citeApa());
  }

  @Test
  public void testCiteMlaBook(){
    String expectedOutput = "Salman Rushdie. Midnight's Children. London: Jonathan Cape, 1980.";
    assertEquals(expectedOutput, rushdie.citeMla());
  }

  @Test
  public void testCiteApaArticle(){
    String expectedOutput = "A. M. Turing (1950). Computing machinery and intelligence. Mind, 59(236).";
    assertEquals(expectedOutput, turing.citeApa());
  }

  @Test
  public void testCiteMlaArticle(){
    String expectedOutput = "A. M. Turing. \"Computing machinery and intelligence.\" Mind 59.236 (1950).";
    assertEquals(expectedOutput, turing.citeMla());
  }

  @Test
  public void testCiteApaWebpage(){
    String expectedOutput = "CCIS at Northeastern University. Retrieved 10th August 2018, from https://www.ccis"
        + ".northeastern.edu/.";
    assertEquals(expectedOutput, ccis.citeApa());
  }

  @Test
  public void testCiteMlaWebpage(){
    String expectedOutput = "\"CCIS at Northeastern University.\" Web. 10th August 2018 "
        + "<https://www.ccis.northeastern.edu/>.";
    assertEquals(expectedOutput, ccis.citeMla());
  }
}
