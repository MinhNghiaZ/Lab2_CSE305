import java.time.LocalDate;

public class MediumPriorityConcrete extends RequestProduct {

    @Override
    public void setExpire(String expireDay) {
        // TODO Auto-generated method stub
        LocalDate date = LocalDate.now().plusMonths(1);
        super.setExpire(date.toString());
    }

    @Override
    public void setPriority(String priority) {
        // TODO Auto-generated method stub
        super.setPriority("Medium");
    }

    @Override
    public void processRequest(String processRequest) {
        // TODO Auto-generated method stub
        super.processRequest("Request accept, estimated completion date is" + " 1-7-2025");
    }

    @Override
    public void setStatus(String status) {
        // TODO Auto-generated method stub
        super.setStatus("Done");
    }

}
