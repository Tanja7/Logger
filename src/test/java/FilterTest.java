import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

@DisplayName("Тестирование: Filter")
public class FilterTest {
    private Filter filter;
    List<Integer> result = new ArrayList<>();

    @Test
    @DisplayName("Тестирование метода фильтрации списка")
    void filterOut() {
        List<Integer> source = new ArrayList<>();
        source.add(3);
        source.add(5);
        source.add(6);
        source.add(2);
        source.add(7);
        filter = new Filter(5);
        result = filter.filterOut(source);
        List<Integer> source1 = new ArrayList<>();
        source1.add(5);
        source1.add(6);
        source1.add(7);
        Assertions.assertEquals(source1, result);
    }
}