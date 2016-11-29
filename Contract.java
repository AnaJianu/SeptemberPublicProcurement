import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.URL;

public class Contract {

    private int ID;

    private String contractNumber;

    private String objectContract;

    private String startDate;
    private String endDate;
    private String contractValue;
    private BeneficiaryContract beneficiaryContract;
    private SupplierContract supplierContract;
    private String contractType;
    private String procedureType;

    public void readDataFromURL() throws Exception{
        URL dataGovRo= new URL("http://data.gv.ro/dataset/69c6a6a8-e129-4bad-ac25-aa9512907807/resource/009028e3-86c1-4daa-ac36-1535e8e3c77c/download/contracteanonimizate.csv");

        BufferedReader in= new BufferedReader(new InputStreamReader(dataGovRo.openStream()));

        String inputLine;
        while ((inputLine=in.readLine()) !=null)
            System.out.println(inputLine);
        in.close();
    }




}
