public class App {
    public static void main(String[] args) throws Exception {
        Client client = new Client();
        Contract contract = client.RequestRentalContract("ABCD", 300,"John","Chair1234");
        AESencryption aesncryption = new AESencryption();
        
        String encryp = aesncryption.encrypt(contract.getContractId(),"123456");
        System.out.println(encryp);
        String decryp = aesncryption.decrypt(encryp, "123456");
        System.out.println(decryp);
    }
}
