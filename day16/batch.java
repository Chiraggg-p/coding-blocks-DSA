package day16;

public class batch {
    String Batch_Name;
    int cost;
    String topic;

    // defualte constructor
    public batch() {
        this.Batch_Name = "defualt";
        this.cost = 20000;
        this.topic = "java+dsa";
    }
    // custom constructor

    public batch(String Batch_Name, int cost, String topic) {
        this.Batch_Name = Batch_Name;
        this.cost = cost;
        this.topic = topic;
    }
}
