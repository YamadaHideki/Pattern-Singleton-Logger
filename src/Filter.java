import java.util.*;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();

        for (Integer i : source) {
            if (i > treshold) {
                logger.log("Элемент \"" + i + "\" " + "проходит");
                result.add(i);
            } else {
                logger.log("Элемент \"" + i + "\" " + "не проходит");
            }
        }

        logger.log("Прошло фильтр " + result.size() + " элемента(ов) из " + source.size());

        return result;
    }
}
