public interface ContractBuilder {
    ContractBuilder BuildContractId(String id);

    ContractBuilder BuildPropertyId(String id);

    ContractBuilder BuildTenantId(String id);

    ContractBuilder BuildRentAmount(long num);

    Contract SignContract();
}
