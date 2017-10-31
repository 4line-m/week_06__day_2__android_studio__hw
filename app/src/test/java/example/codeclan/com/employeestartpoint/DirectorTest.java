package example.codeclan.com.employeestartpoint;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by alinemokfa on 31/10/2017.
 */

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director(2, "Marta", "WX33947209P", 55000.00, "HR", 800000.00);
    }

    @Test
    public void testGetBudget() {
        assertEquals(800000.00, director.getBudget(), 0.01);
    }

}
