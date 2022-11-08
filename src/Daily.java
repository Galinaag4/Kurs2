import java.time.LocalDate;
import java.time.LocalDateTime;

public class Daily extends Task{
    public Daily(String name, String taskDescription, String task_type, LocalDateTime taskdateTime) {
        super(name, taskDescription, task_type, taskdateTime);
    }

    @Override
    public boolean isAvailable(LocalDate inputDate) {
        var startDate = getDateTime().toLocalDate();
        while (!startDate.isAfter(inputDate)){
            if(startDate.equals(inputDate)){
                return true;
            }
            startDate = startDate.plusDays(1);
        }
        return false;
    }
    }

