import java.time.LocalDateTime;

public abstract class Task implements repeatable{
    String name;
    String taskDescription;
    TASK_TYPE task_type;
    private int id;
    Repeatability repeatability;
    private LocalDateTime dateTime;



    @Override
    public LocalDateTime nextRepeat(Repeatability repeatability) {
        return dateTime;
    }

    enum TASK_TYPE {personal,worker};
   enum Repeatability{one_time,daily,weekly,monthly,annual};
    private static int counter;

    public Task(String name, String taskDescription, TASK_TYPE task_type, Repeatability repeatability,LocalDateTime dateTime) {
        if (taskDescription == null || name.isBlank()) {
            System.out.println("Заполните полностью");
            throw new IllegalArgumentException();
        } else {
            this.taskDescription = taskDescription;
        }
        this.task_type = task_type;
        this.repeatability = repeatability;
        this.dateTime=dateTime;
        if (name == null || name.isBlank()) {
            System.out.println("Заполните задачу полностью");
            throw new IllegalArgumentException();
        } else {
            this.name = name;
        }
        id = ++counter;
    }

    public int getId() {
        return id;
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

    public TASK_TYPE getTask_type() {
        return task_type;
    }



    public Repeatability getRepeatability() {
        return repeatability;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", task_type=" + task_type +
                ", id=" + id +
                ", repeatability=" + repeatability +
                '}';
    }
}
