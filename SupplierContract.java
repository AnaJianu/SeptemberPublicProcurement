/**
 * Created by ana on 29/11/2016.
 */
public class SupplierContract {

    private String supplierName;


    public SupplierContract(String supplierName){
        this.supplierName=supplierName;

    }

    @Override
    public String toString() {
        return "SupplierContract{" +
                "supplierName='" + supplierName + '\'' +
                '}';
    }
}
