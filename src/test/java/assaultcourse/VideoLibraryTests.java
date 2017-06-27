package assaultcourse;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class VideoLibraryTests {

  @Test
  public void videosAddedToLibraryAreAvailableToRent() throws Exception {
    VideoLibrary videoLibrary = new VideoLibrary();
    Video video = new Video("Jaws", Rating.FIFTEEN);
    videoLibrary.addVideo(video);
    assertTrue(videoLibrary.hasVideo("Jaws"));
  }

  @Test
  public void videosNotAddedToLibraryAreAvailableToRent() throws Exception {
    VideoLibrary videoLibrary = new VideoLibrary();
    assertFalse(videoLibrary.hasVideo("Jaws"));
  }

}
