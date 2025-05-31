public abstract class RequestProduct {
    private String priority;
    private String expireDay;
    private String status;

    public RequestProduct() {

    }

    public RequestProduct(String priority, String expireDay, String status) {
        this.priority = priority;
        this.expireDay = expireDay;
        this.status = status;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    };

    public void setExpire(String expireDay) {
        this.expireDay = expireDay;
    };

    public void setStatus(String status) {
        this.status = status;
    };

    public void processRequest(String processRequest) {
        System.out.println(processRequest);
    }

    public String getPriority() {
        return priority;
    }

    public String getExpireDay() {
        return expireDay;
    }

    public void setExpireDay(String expireDay) {
        this.expireDay = expireDay;
    }

    public String getStatus() {
        return status;
    }
    

}
