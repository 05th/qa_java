import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;


public class FelineTest {
    private Feline feline = new Feline();

    @Test
    public void eatMeatTest() throws Exception {
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expectedResult, feline.eatMeat());
    }

    @Test
    public void getFamilyTest() {
        String expectedResult = "Кошачьи";
        Assert.assertEquals(expectedResult, feline.getFamily());
    }

    @Test
    public void getKittensWithNumberOne() {
        int expectedResult = 1;
        Assert.assertEquals(expectedResult, feline.getKittens());
    }

    @Test
    public void getKittensWithAnyNumbers() {
        int expectedResult = 5;
        Assert.assertEquals(expectedResult, feline.getKittens(5));
    }
}