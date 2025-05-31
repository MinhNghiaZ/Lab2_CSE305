public class App {
    public static void main(String[] args) throws Exception {
      
        RequestProduct lowRequest = new RequestCreator.LowPriorityConcreteCreator().createRequest();

        RequestProduct mediumRequest = new RequestCreator.MediumPriorityConcreteCreator().createRequest();

        RequestProduct highRequest = new RequestCreator.HighPriorityConcreteCreator().createRequest();

        lowRequest.processRequest("test");
        mediumRequest.processRequest("test");
        highRequest.processRequest("test");

    }
    
    
}
