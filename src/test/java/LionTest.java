import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    private Feline feline;

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void getFoodReturnListTest() throws Exception {
        List<String> felineFood = List.of("Животные", "Птицы", "Рыба");
        String sex = "Самка";
        Lion lion = new Lion(sex, feline);
        assertEquals(felineFood, lion.getFood());
    }

    @Test
    public void lionExceptOfSexResult() {
        String expectedException = "Используйте допустимые значения пола животного - самей или самка";
        Exception actualException = Assert.assertThrows("исключение", Exception.class, () -> new Lion(" ", new Feline()));
        Assert.assertEquals("Неправильный текст исключения: ", expectedException, actualException.getMessage());
    }
}