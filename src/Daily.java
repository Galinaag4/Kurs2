import java.time.LocalDate;
import java.time.LocalDateTime;

public class Daily extends Task{
    public Daily(String name, String taskDescription, String task_type, LocalDateTime dateTime) {
        super(name, taskDescription, task_type, dateTime);
    }

    @Override
    public boolean isAvailable(LocalDate inputDate){
        var startDate :LocalDateTime = getDateTime().toLocalDate();
        while (!startDate.isAfter(inputDate)){
            if(startDate.euqals(inputDate)){
                return true;
        }
            startDate = startDate.plusDays(1);
        }
        return false;
    }
    }

