import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionParameterizedTest {
    private String sex;
    private boolean expected;
    private Feline feline = new Feline();

    public LionParameterizedTest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "sex: {0}, expected: {1}")
    public static Object[][] getTestData() {
        return new Object[][]{
                {"Самец", true}, {"Самка", false}
        };

    }

    @Test
    public void hasManeTest() throws Exception {
        Lion lion = new Lion(sex, feline);
        Assert.assertEquals(expected, lion.doesHaveMane());
    }
}