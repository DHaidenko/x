import org.hamcrest.core.Is;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.Is.is;
import static org.junit.matchers.JUnitMatchers.both;
import static org.junit.matchers.JUnitMatchers.containsString;

/**
 * Created by Student on 24.02.2018.
 */
@RunWith(Parameterized.class)
public class MyTest {
int a;
    int b;

    public MyTest(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList( new Object[][]{{2,4},{2,4},{3,6},{5,10}});

    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("BfClass");
    }
    @AfterClass
    public static void setUClass() throws Exception {
        System.out.println("AfClass");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Bf");
    }

    @After
    public void setOut() throws Exception {
        System.out.println("af");
    }





    @Test
    public void test3() {
        int i = a+a;
        Assert.assertEquals("as",b,i);
    }
}
