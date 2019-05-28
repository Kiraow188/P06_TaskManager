package sg.edu.rp.c347.p06_taskmanager;

public class Task {
    private int id;
    private String name;
    private String description;

    public int getId() {
        return id;
    }

    public Task(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString(){
        return id + " " + name + "\n" + description;
    }
}
