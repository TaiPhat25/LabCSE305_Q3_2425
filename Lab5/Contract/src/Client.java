public class Client {
    public Contract requestCreateRentalContract() {
        ContractBuilder contractBuilder = new Permanent().buildContractID("1").buildPropertyID("5").buildTenantID("12")
                .buildRentAmount(75);

        return contractBuilder.signContract();
    }
}