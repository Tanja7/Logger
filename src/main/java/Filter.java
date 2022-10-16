import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (int meaning : source) {
            if (meaning >= treshold) {
                logger.log("Элемент \"" + meaning + "\" проходит");
                result.add(meaning);
            } else {
                logger.log("Элемент \"" + meaning + "\" не проходит");
            }
        }
        logger.log("Прошло фильтр " + result.size() + " элемента из " + source.size());
        logger.log("Отфильтрованный список: " + result);
        return result;
    }
}