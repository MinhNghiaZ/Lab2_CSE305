import java.time.LocalDate;

public class LowPriorityConcrete extends RequestProduct {

    @Override
    public void setExpire(String expireDay) {
        // TODO Auto-generated method stub
        LocalDate date = LocalDate.now();
        super.setExpire(date.toString());
    }

    @Override
    public void setPriority(String priority) {
        // TODO Auto-generated method stub
        super.setPriority("Ignore");
    }

    @Override
    public void processRequest(String processRequest) {
        // TODO Auto-generated method stub
        super.processRequest("Request denied");
    }

    @Override
    public void setStatus(String status) {
        // TODO Auto-generated method stub
        super.setStatus("Done");
    }

}
