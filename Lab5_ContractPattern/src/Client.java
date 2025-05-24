public class Client {
    public Contract RequestRentalContract(String contractId, long rentAmount, String tenantId, String propertyId) {
        ContractBuilder buidContract = new Permanent().BuildContractId(contractId).BuildPropertyId(propertyId)
                .BuildRentAmount(rentAmount).BuildTenantId(tenantId);

        Contract contract = buidContract.SignContract();
        System.out.println(buidContract.toString());
        return contract;
        
    };
}
