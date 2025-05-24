public class Contract {
    private String contractId;
    private long rentAmount;
    private String tenantId;
    private String propertyId;
    
    public Contract(String contractId, long rentAmount, String tenantId, String propertyId) {
        this.contractId = contractId;
        this.rentAmount = rentAmount;
        this.tenantId = tenantId;
        this.propertyId = propertyId;
    }
    
    
}
