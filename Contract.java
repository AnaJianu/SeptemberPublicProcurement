import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;



public class Contract {



    private String contractNumber;

    private String objectContract;

    private String startDate;
    private String endDate;
    private String contractValue;
    private BeneficiaryContract beneficiaryContract;
    private SupplierContract supplierContract;
    private String contractType;
    private String procedureType;

    public Contract(String contractNumber, String objectContract, String startDate, String endDate,
                    String contractValue, BeneficiaryContract beneficiaryContract, SupplierContract supplierContract, String contractType, String procedureType) {

        this.contractNumber=contractNumber;
        this.objectContract=objectContract;
        this.startDate=startDate;
        this.endDate=endDate;
        this.contractValue=contractValue;
        this.beneficiaryContract=beneficiaryContract;
        this.supplierContract=supplierContract;
        this.contractType=contractType;
        this.procedureType=procedureType;
    }

    public double getValue() {
        try {
            return Double.parseDouble(contractValue);
        }
        catch (NumberFormatException nfe) {
            return Double.NaN;
        }
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractNumber='" + contractNumber + '\'' +
                ", objectContract='" + objectContract + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", contractValue='" + contractValue + '\'' +
                ", beneficiaryContract=" + beneficiaryContract +
                ", supplierContract=" + supplierContract +
                ", contractType='" + contractType + '\'' +
                ", procedureType='" + procedureType + '\'' +
                '}';
    }
}
