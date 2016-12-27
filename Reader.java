import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ana on 27/12/2016.
 */
public class Reader {
    public void readDataFromURL() throws Exception{
        URL dataGovRo= new URL("http://data.gv.ro/dataset/69c6a6a8-e129-4bad-ac25-aa9512907807/resource/009028e3-86c1-4daa-ac36-1535e8e3c77c/download/contracteanonimizate.csv");
        URLConnection connection=dataGovRo.openConnection();
        connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.168");
        connection.connect();

        InputStream is=connection.getInputStream();
        BufferedReader br= new BufferedReader(new InputStreamReader(is));
        br.readLine();

        List<Contract> contractsList=new ArrayList<Contract>();
        String[] stringArray;
        String inputLine;
        while ((inputLine=br.readLine()) !=null) {
            stringArray=inputLine.split(",");

            if (stringArray.length>=25) {
                String beneficiaryName = stringArray[11];
                String beneficiaryRegion = stringArray[23];
                String beneficiaryAddress = stringArray[25];
                BeneficiaryContract beneficiaryContract = new BeneficiaryContract(beneficiaryName, beneficiaryRegion, beneficiaryAddress);

                String supplierName = stringArray[17];
                SupplierContract supplierContract = new SupplierContract(supplierName);

                String contractNumber = stringArray[8];
                String objectContract = stringArray[10];
                String startDate = stringArray[12];
                String endDate = stringArray[13];
                String contractValue = stringArray[14];
                String contractType = stringArray[19];
                String procedureType = stringArray[20];
                Contract contract = new Contract(contractNumber, objectContract, startDate, endDate, contractValue, beneficiaryContract, supplierContract, contractType, procedureType);

                contractsList.add(contract);
            }
        }
        br.close();
        for (Contract contract:contractsList) {
            if (contract.getValue()>=200_000_000) {
                System.out.println(contract);
            }
        }

    }

    public static void main(String[] args) {
        Reader reader=new Reader();
        try {
            reader.readDataFromURL();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
