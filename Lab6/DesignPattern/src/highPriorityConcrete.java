public class highPriorityConcrete implements requestProduct {
    private String priority;
    private String expire;
    private String status;

    public highPriorityConcrete() {

    }

    public highPriorityConcrete(String priority, String expire, String status) {
        this.priority = priority;
        this.expire = expire;
        this.status = status;
    }

    @Override
    public void setPriority(String priority) {
        priority = "Emergency";
        this.priority = priority;
    }

    @Override
    public void setExpire(String expire) {
        expire = "Current Day";
        this.expire = expire;
    }

    @Override
    public void setStatus(String status) {
        status = "Accept";
        this.status = status;
    }

    @Override
    public void processRequest() {
        System.out.println("Emergency request, our Administer will contact you immediately !");
    }
}
