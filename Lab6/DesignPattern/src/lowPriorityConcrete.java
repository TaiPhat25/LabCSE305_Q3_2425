public class lowPriorityConcrete implements requestProduct {
    private String priority;
    private String expire;
    private String status;

    public lowPriorityConcrete() {

    }

    public lowPriorityConcrete(String priority, String expire, String status) {
        this.priority = priority;
        this.expire = expire;
        this.status = status;
    }

    @Override
    public void setPriority(String priority) {
        priority = "Ignore";
        this.priority = priority;
    }

    @Override
    public void setExpire(String expire) {
        expire = "Current Day";
        this.expire = expire;
    }

    @Override
    public void setStatus(String status) {
        status = "Done";
        this.status = status;
    }

    public void processRequest() {
        System.out.println("Request denied");
    }
}