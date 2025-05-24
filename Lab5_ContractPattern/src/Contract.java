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

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public long getRentAmount() {
        return rentAmount;
    }

    public void setRentAmount(long rentAmount) {
        this.rentAmount = rentAmount;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    @Override
    public String toString() {
        return "Contract [contractId=" + contractId + ", rentAmount=" + rentAmount + ", tenantId=" + tenantId
                + ", propertyId=" + propertyId + "]";
    }
    
    
    
    
}
