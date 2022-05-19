import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        int counter = 0;
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        logger.log("Запускаем фильтрацию");
        for (Integer num :
                source) {
            if (num < treshold) {
                logger.log("Элемент \"" + num + "\" проходит");
                counter++;
                result.add(num);
            } else {
                logger.log("Элемент \"" + num + "\" не проходит");
            }
        }
        logger.log("Прошло фильтр " + counter + " элемента из " + (source.size()));
        return result;
    }
}