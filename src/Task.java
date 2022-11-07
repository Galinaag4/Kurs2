import java.time.LocalDate;
import java.time.LocalDateTime;

public  class Task implements Repeatable{
    String name;
    String taskDescription;
    String task_type;
    private int id;

    private LocalDateTime dateTime;

    enum taskType {PERSONAL,WORKER};

    private static int counter;



    public Task(String name, String taskDescription, String task_type, LocalDateTime dateTime) {
        if (taskDescription == null || name.isBlank()) {
            System.out.println("Заполните полностью");
            throw new IllegalArgumentException();
        } else {
            this.taskDescription = taskDescription;
        }
        this.task_type = task_type;

        this.dateTime=dateTime;
        if (name == null || name.isBlank()) {
            System.out.println("Заполните задачу полностью");
            throw new IllegalArgumentException();
        } else {
            this.name = name;
        }
        id = ++counter;
    }

    @Override
    public boolean isAvailable(LocalDate inputDate) {
        return inputDate.isEqual(getDateTime().toLocalDate());
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getTask_type() {
        return task_type;
    }





    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", task_type=" + task_type +
                ", id=" + id +
                ", dateTime=" + dateTime +
                '}';
    }

}
