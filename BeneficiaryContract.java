/**
 * Created by ana on 29/11/2016.
 */
public class BeneficiaryContract {

    private String beneficiaryName;
    private String beneficiaryRegion;
    private String beneficiaryAddress;

    public BeneficiaryContract(String beneficiaryName,String beneficiaryRegion,
                               String beneficiaryAddress) {
        this.beneficiaryName=beneficiaryName;
        this.beneficiaryRegion=beneficiaryRegion;
        this.beneficiaryAddress=beneficiaryAddress;
    }

    @Override
    public String toString() {
        return "BeneficiaryContract{" +
                "beneficiaryName='" + beneficiaryName + '\'' +
                ", beneficiaryRegion='" + beneficiaryRegion + '\'' +
                ", beneficiaryAddress='" + beneficiaryAddress + '\'' +
                '}';
    }
}
