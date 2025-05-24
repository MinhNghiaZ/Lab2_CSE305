public class ShortTerm implements ContractBuilder {
    private String contractId;
    private long rentAmount;
    private String tenantId;
    private String propertyId;
    


    @Override
    public ContractBuilder BuildContractId(String id) {
        this.contractId = id;
        return this;
    }

     @Override
    public ContractBuilder BuildPropertyId(String id) {
        this.propertyId = id;
        return this;
    }

    @Override
    public ContractBuilder BuildTenantId(String id) {
        this.tenantId = id;
        return this;
    }

    @Override
    public ContractBuilder BuildRentAmount(long num) {
        this.rentAmount = num;
        return this;
    }
    
    @Override
    public Contract SignContract() {
        return new Contract(contractId, rentAmount, tenantId, propertyId);
    }
    @Override
    public String toString() {
        return "LongTerm [contractId=" + contractId + ", rentAmount=" + rentAmount + ", tenantId=" + tenantId
                + ", propertyId=" + propertyId + "]";
    }

}
