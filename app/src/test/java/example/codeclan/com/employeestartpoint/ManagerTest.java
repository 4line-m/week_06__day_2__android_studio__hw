package example.codeclan.com.employeestartpoint;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by alinemokfa on 31/10/2017.
 */

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager(5, "Alice", "XY472892A", 50000.00, "DevOps");
    }

    @Test
    public void canGetDeptName() {
        assertEquals("DevOps", manager.getDeptName());
    }
}
