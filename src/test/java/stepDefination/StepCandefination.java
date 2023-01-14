package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepCandefination {
	WebDriver driver;
	String expected="";
	String actual="";
			
	@Given("^user navigates URL in chrome browser$")
	public void user_navigates_URL_in_chrome_browser() throws Throwable {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://orangehrm.qedgetech.com/");
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}

	@When("^user enters username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enters_username_as_and_password_as(String uname, String pwd) throws Throwable {
	   driver.findElement(By.name("txtUsername")).sendKeys(uname); 
	   driver.findElement(By.name("txtPassword")).sendKeys(pwd);
	}

	@When("^user click Login button$")
	public void user_click_Login_button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	}

	@When("^user click Recruitment and Click Add button\\.$")
	public void user_click_Recruitment_and_Click_Add_button() throws Throwable {
		driver.findElement(By.xpath("//b[normalize-space()='Recruitment']")).click();
		driver.findElement(By.id("btnAdd")).click();
	}

	@When("^user enter fname \"([^\"]*)\"$")
	public void user_enter_fname(String firstname) throws Throwable {
		driver.findElement(By.name("addCandidate[firstName]")).sendKeys(firstname); 
	}

	@When("^user enter mname \"([^\"]*)\"$")
	public void user_enter_mname(String middname) throws Throwable {
		driver.findElement(By.name("addCandidate[middleName]")).sendKeys(middname);
	}

	@When("^user enter lname \"([^\"]*)\"$")
	public void user_enter_lname(String lname) throws Throwable {
		driver.findElement(By.name("addCandidate[lastName]")).sendKeys(lname);
	}

	@When("^user enter email \"([^\"]*)\"$")
	public void user_enter_email(String email) throws Throwable {
		driver.findElement(By.name("addCandidate[email]")).sendKeys(email);
	}

	@When("^user enter contactnum \"([^\"]*)\"$")
	public void user_enter_contactnum(String num) throws Throwable {
		driver.findElement(By.name("addCandidate[contactNo]")).sendKeys(num);
	}

	@When("^user select JobVacancy \"([^\"]*)\"$")
	public void user_select_JobVacancy(String select) throws Throwable {
		driver.findElement(By.name("addCandidate[vacancy]")).sendKeys(select);
	}

	@When("^user enter Keywords \"([^\"]*)\"$")
	public void user_enter_Keywords(String key) throws Throwable {
		driver.findElement(By.name("addCandidate[keyWords]")).sendKeys(key);
	}

	@When("^user enter comment \"([^\"]*)\"$")
	public void user_enter_comment(String comm) throws Throwable {
		driver.findElement(By.name("addCandidate[comment]")).sendKeys(comm);
	}

	@When("^user clear date$")
	public void user_clear_date() throws Throwable {
		driver.findElement(By.name("addCandidate[appliedDate]")).clear(); 
	}
	@When("^user click date and select date \"([^\"]*)\"$")
	public void user_click_date_and_select_date(String date) throws Throwable {
		driver.findElement(By.name("addCandidate[appliedDate]")).sendKeys(date);
	}

	@When("^user select check box$")
	public void user_select_check_box() throws Throwable {
		driver.findElement(By.name("addCandidate[consentToKeepData]")).isSelected();
	}

	@Then("^user click Save button$")
	public void user_click_Save_button() throws Throwable {
		driver.findElement(By.id("btnSave")).click();
	}

	
	@When("^user click PIM and Click Add button\\.$")
	public void user_click_PIM_and_Click_Add_button() throws Throwable {
		driver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();
		driver.findElement(By.name("btnAdd")).click();
		}
	@When("^user enter firstname \"([^\"]*)\"$")
	public void user_enter_firstname(String fname) throws Throwable {
		driver.findElement(By.name("firstName")).sendKeys(fname);
	}

	@When("^user enter midname \"([^\"]*)\"$")
	public void user_enter_midname(String mname) throws Throwable {
		driver.findElement(By.name("middleName")).sendKeys(mname);
	}

	@When("^user enter lastname \"([^\"]*)\"$")
	public void user_enter_lastname(String lname) throws Throwable {
		driver.findElement(By.name("lastName")).sendKeys(lname);
	}
	
	    
	
	@When("^user capture EId before$")
	public void user_capture_EId_before() throws Throwable {
	   expected = driver.findElement(By.name("employeeId")).getAttribute("value");
	}
	@When("^user capture Eid after$")
	public void user_capture_Eid_after() throws Throwable {
		actual = driver.findElement(By.name("personal[txtEmployeeId]")).getAttribute("value");
	}
	
	@Then("^user validates Eid$")
	public void user_validates_Eid() throws Throwable {
	      if(expected.equals(actual))
	    {
	    	System.out.println("emp id is matching" +expected+ "    "+actual);
	    }
	    else
	    {
	    	System.out.println("emp id is not matching" +expected+ "    "+actual);
	    }
	}
	
	

@When("^user moves mouse to Admin and moves mouse to Job$")
public void user_moves_mouse_to_Admin_and_moves_mouse_to_Job() throws Throwable {
    Actions ac = new Actions(driver);
    ac.moveToElement(driver.findElement(By.xpath("//b[normalize-space()='Admin']"))).perform();
    ac.moveToElement(driver.findElement(By.linkText("Job"))).perform();
   
}

@When("^user click Job Title$")
public void user_click_Job_Title() throws Throwable {
	driver.findElement(By.linkText("Job Titles")).click();
}

@When("^user click to Add button$")
public void user_click_to_Add_button() throws Throwable {
	driver.findElement(By.name("btnAdd")).click();
}

@When("^user enter Job Title\"([^\"]*)\"$")
public void user_enter_Job_Title(String jobtitle) throws Throwable {
	driver.findElement(By.name("jobTitle[jobTitle]")).sendKeys(jobtitle);
	
}

@When("^user enter Job Description\"([^\"]*)\"$")
public void user_enter_Job_Description(String jobdesc) throws Throwable {
	driver.findElement(By.name("jobTitle[jobDescription]")).sendKeys(jobdesc);
		
}

@When("^user enter Note\"([^\"]*)\"$")
public void user_enter_Note(String note) throws Throwable {
	driver.findElement(By.name("jobTitle[note]")).sendKeys(note);

}

@Then("^user close browser$")
public void user_close_browser() throws Throwable {
    driver.close();
}

}

