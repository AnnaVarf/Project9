import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void movieAddTest() {
        MovieManager manager = new MovieManager();

        String[] actual = manager.findAll();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void movieAddTest1() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film 1");

        String[] actual = manager.findAll();
        String[] expected = { "Film 1" };
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void movieAddTest2() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");

        String[] actual = manager.findAll();
        String[] expected = { "Film 1", "Film 2", "Film 3" };

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void movieAddTest3() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");

        String[] actual = manager.findLast();
        String[] expected = { "Film 3", "Film 2", "Film 1" };

        Assertions.assertArrayEquals(expected, actual);

    }

}
