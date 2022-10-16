import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

@DisplayName("Тестирование: Logger")
public class LoggerTest {
    private Logger logger = Logger.getInstance();
    List<Integer> source = new ArrayList<>();

    @Test
    @DisplayName("Тестирование метода создания случайного списка")
    void add() {
        source = logger.add(3, 5);
        Assertions.assertEquals(3, source.size());
        for (int meaning : source) {
            Assertions.assertTrue(meaning <= 5);
        }
    }
}
