import java.time.LocalDateTime;

public interface repeatable {
   public LocalDateTime nextRepeat();

   LocalDateTime nextRepeat(Task.Repeatability repeatability);
}
