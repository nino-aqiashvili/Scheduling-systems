import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class FeedingTime {
    private static final Map<Animal, LocalTime[]> feedingTimes = new HashMap<>();

    static {
        feedingTimes.put(new Elephant("", ZooType.PUBLIC), new LocalTime[]{LocalTime.of(9, 0), LocalTime.of(17, 0), LocalTime.of(23, 0)});
        feedingTimes.put(new Lion("", ZooType.PUBLIC), new LocalTime[]{LocalTime.of(10, 0), LocalTime.of(19, 0)});
        feedingTimes.put(new Giraffe("", ZooType.PRIVATE), new LocalTime[]{LocalTime.of(11, 0), LocalTime.of(18, 0)});
        feedingTimes.put(new Crocodile("", ZooType.PRIVATE), new LocalTime[]{LocalTime.of(14, 0)});
        feedingTimes.put(new Monkey("", ZooType.PUBLIC), new LocalTime[]{LocalTime.of(12, 0), LocalTime.of(20, 0)});
    }

    public static String getFeedingInfo(LocalTime inputTime) {
        for (Map.Entry<Animal, LocalTime[]> entry : feedingTimes.entrySet()) {
            Animal animal = entry.getKey();
            LocalTime[] times = entry.getValue();
            for (LocalTime time : times) {
                if (time.equals(inputTime)) {
                    return String.format("Reminder to the %s keeper:\nIt's feeding time for %s.\nFood: %s\nEnclosure: %s\nFood amount per meal: %d",
                            animal.getEnclosure(), animal.getName(), animal.getFood(), animal.getEnclosure(), animal.getFoodAmountPerMeal());
                }
            }
        }
        return STR."No feeding time scheduled for \{inputTime.toString()}";
    }
}
