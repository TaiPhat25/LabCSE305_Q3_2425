import java.time.LocalDate;

public class midPriorityConcrete implements requestProduct {
    private String priority;
    private String expire;
    private String status;

    public midPriorityConcrete() {

    }

    public midPriorityConcrete(String priority, String expire, String status) {
        this.priority = priority;
        this.expire = expire;
        this.status = status;
    }

    @Override
    public void setPriority(String priority) {
        priority = "Medium";
        this.priority = priority;
    }

    @Override
    public void setExpire(String expire) {
        expire = LocalDate.now().plusMonths(1).toString();
        this.expire = expire;
    }

    @Override
    public void setStatus(String status) {
        status = "Accepted";
        this.status = status;
    }

    @Override
    public void processRequest() {
        setExpire(expire);
        System.out.println("Request accept, estimated completion date is " + expire);
    }
}
