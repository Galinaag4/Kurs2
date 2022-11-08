import java.time.LocalDate;
import java.time.LocalDateTime;

public class Monthly extends Task{
    public Monthly(String name, String taskDescription, String task_type, LocalDateTime taskdateTime) {
        super(name, taskDescription, task_type, taskdateTime);
    }

    @Override
    public boolean isAvailable(LocalDate inputDate) {
        var startDate = getDateTime().toLocalDate();
        while (!startDate.isAfter(inputDate)){
            if(startDate.equals(inputDate)){
                return true;
            }
            startDate = startDate.plusMonths(1);
        }
        return false;
    }
    }

