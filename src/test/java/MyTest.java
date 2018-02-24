import org.junit.*;

/**
 * Created by Student on 24.02.2018.
 */
public class MyTest {



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
    public void test1() {
        System.out.println("test");
    }

    @Test
    public void test2() {
        System.out.println("df");
    }

    @Test
    public void test3() {

        System.out.println("default");
    }
}
