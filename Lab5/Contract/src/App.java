public class App {
    public static void main(String[] args) throws Exception {
        // ContractBuilder contractBuilder = new Permanent().buildContractID("1").buildPropertyID("5").buildTenantID("12").buildRentAmount(75);
        // System.out.println(contractBuilder.signContract().toString());
        Client client = new Client();
        var currentContract = client.requestCreateRentalContract();
        // System.out.println(client.requestCreateRentalContract());
        String tenantID = currentContract.getTenantID();
        System.out.println(tenantID);
        AESCipher aes = new AESCipher();
        String encryptedTenantID = aes.encrypt(tenantID, "a");
        System.out.println("ENCRYPT: "+encryptedTenantID);
        System.out.println("-------------------------------");
        String decryptedTenantID = aes.decrypt(encryptedTenantID, "a");
        System.out.println("DECRYPT: "+decryptedTenantID);
    }
}