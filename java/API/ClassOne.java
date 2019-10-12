package API;

import java.util.Hashtable;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.BFL.API_workflows.CustomerOnboardingAPI_Details;
import com.BFL.API_workflows.MAUTH_TransactionAPI_Details;
import com.BFL.API_workflows.NavigateToServiceClient;
import com.BFL.workflows.AccountBlock_UnblockDetails;
import com.BFL.workflows.CallLogin;
import com.BFL.workflows.CardActivationDetails;
import com.BFL.workflows.CardCancellationDetails;
import com.BFL.workflows.CustomerBlock_UnblockDetails;
import com.BFL.workflows.SignInClass;
import com.MainFrameWork.accelerators.TestEngine;
import com.MainFrameWork.support.HtmlReportSupport;
import com.MainFrameWork.utilities.Reporter;


public class MAUTH_Transaction  extends MAUTH_TransactionAPI_Details{

@Test(groups= {"smoke", "functional"}, dataProvider = "getData",enabled=true)
public void MAUTH_Transaction_Test(Hashtable <String,String > data) throws Throwable {


try
{
boolean result = false;
boolean result1 = false;
boolean result3 = false;
boolean result4 = false;
boolean result5 = false;
boolean result6 = false;

TestEngine.testDescription.put(HtmlReportSupport.tc_name,"");
System.out.println("Usertype - "+ data.get("Usertype"));

SignInClass sign = new SignInClass();
HtmlReportSupport.reportStep(data.get("TestCoverage"));

SignInClass.specificlogin("makerusername","makerpassword");

NavigateToServiceClient.ServiceClient(data);

GetPrvMauthDB(data);

//csut id, v   CLI_TOTAL_AUTH_BLOCKED,  CLI_ECS_AUTH_BLOCKED
///GetMauthDB(data); 
//result3 = NavigateToServiceClient.MAuthMerchantOnboardingJSON(data);
result3 = CreateMauthJSON(data);

result4= MauthTransactionDB(data);

GetPrvMauthDB1(data);

result5= CancelMauthJSON(data);

result6= CancelMauthTransactionDB(data);


//GETTotalAmountMasterDB();

sign.logout();

if (result4) 
{
Reporter.SuccessReport("MAuth API Transaction","MAuth API Transaction succesfully done." );

} 

else 
{
Reporter.failureReport("MAuth API Transaction ", "MAuth API Transaction failed..");
Assert.assertTrue(result == true, "Test Failed");
}
}
catch (Exception e){
Reporter.failureReport("MAuth API Transaction succesfully done.", "MAuth API Transaction Failed.");
e.printStackTrace();
Assert.assertTrue(false,"Test Failed");

Reporter.reportStep("Error is:"+e);
}


}


}========================================


}
