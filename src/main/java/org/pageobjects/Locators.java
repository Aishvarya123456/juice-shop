package org.pageobjects;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.UtilityClass;

public class Locators extends UtilityClass {

	public Locators() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement txtuser;

	@FindBy(id = "password")
	private WebElement txtpass;

	@FindBy(id = "loginButton")
	private WebElement login;

	@FindBy(xpath = "(//span[text()='Add to Basket'])[1]")
	private WebElement click;

	@FindBy(xpath = "//span[text()=' Your Basket']")
	private WebElement addtocart;

	@FindBy(xpath = "//button[@id='checkoutButton']")
	private WebElement check;

	@FindBy(xpath = "//input[@type='radio']")
	private WebElement radio;

	@FindBy(xpath = "(//input[@type='radio'])[1]")
	private WebElement radioo;

	@FindBy(id = "mat-expansion-panel-header-9")
	private WebElement card;

	@FindBy(xpath = "//mat-label[text()='Name']//parent::label/../preceding-sibling::input")
	private WebElement name;

	@FindBy(xpath = "//mat-label[text()='Card Number']//parent::label/../preceding-sibling::input")
	private WebElement cardnum;

	@FindBy(xpath = "//mat-label[text()='Expiry Month']//parent::label/../preceding-sibling::select")
	private WebElement exp;

	@FindBy(id = "submitButton")
	private WebElement sub;

	@FindBy(xpath = "//mat-label[text()='Expiry Year']//parent::label/../preceding-sibling::select")
	private WebElement date;

	@FindBy(xpath = "//span[text()='Continue']/parent::span/parent::button")
	private WebElement con;

	@FindBy(id = "navbarAccount")
	private WebElement btnlogin;

	@FindBy(id = "navbarLoginButton")
	private WebElement loginbtn;

	@FindBy(xpath = "//span[text()='Add New Address']")
	private WebElement address;

	@FindBy(xpath = "//input[contains(@data-placeholder,'country')]")
	private WebElement country;

	@FindBy(xpath = "//input[contains(@data-placeholder,'name')]")
	private WebElement addname;

	@FindBy(id = "mat-input-47")
	private WebElement addcoun;

	@FindBy(xpath = "//input[contains(@data-placeholder,'mobile')]")
	private WebElement addphone;

	@FindBy(xpath = "//input[contains(@data-placeholder,'ZIP')]")
	private WebElement addcode;

	@FindBy(xpath = "//textarea[contains(@data-placeholder,'address')]")
	private WebElement addaddress;

	@FindBy(xpath = "//input[contains(@data-placeholder,'city')]")
	private WebElement addcity;

	@FindBy(xpath = "//input[contains(@data-placeholder,'state')]")
	private WebElement addstate;

	@FindBy(id = "submitButton")
	private WebElement addsubmit;

	@FindBy(xpath = "//mat-panel-description[text()=' Add a credit or debit card ']")
	private WebElement addnewcart;

	@FindBy(xpath = "//span[text()='Dismiss']")
	private WebElement dismiss;

//	---------------------------------------------------------------------------------------------//
	public WebElement getTxtuser() {
		return txtuser;
	}

	public void setTxtuser(WebElement txtuser) {
		this.txtuser = txtuser;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public void setTxtpass(WebElement txtpass) {
		this.txtpass = txtpass;
	}

	public WebElement getLogin() {
		return login;
	}

	public void setLogin(WebElement login) {
		this.login = login;
	}

	public WebElement getClick() {
		return click;
	}

	public void setClick(WebElement click) {
		this.click = click;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public void setAddtocart(WebElement addtocart) {
		this.addtocart = addtocart;
	}

	public WebElement getCheck() {
		return check;
	}

	public void setCheck(WebElement check) {
		this.check = check;
	}

	public WebElement getRadio() {
		return radio;
	}

	public void setRadio(WebElement radio) {
		this.radio = radio;
	}

	public WebElement getRadioo() {
		return radioo;
	}

	public void setRadioo(WebElement radioo) {
		this.radioo = radioo;
	}

	public WebElement getCard() {
		return card;
	}

	public void setCard(WebElement card) {
		this.card = card;
	}

	public WebElement getName() {
		return name;
	}

	public void setName(WebElement name) {
		this.name = name;
	}

	public WebElement getCardnum() {
		return cardnum;
	}

	public void setCardnum(WebElement cardnum) {
		this.cardnum = cardnum;
	}

	public WebElement getExp() {
		return exp;
	}

	public void setExp(WebElement exp) {
		this.exp = exp;
	}

	public WebElement getSub() {
		return sub;
	}

	public void setSub(WebElement sub) {
		this.sub = sub;
	}

	public WebElement getDate() {
		return date;
	}

	public void setDate(WebElement date) {
		this.date = date;
	}

	public WebElement getCon() {
		return con;
	}

	public void setCon(WebElement con) {
		this.con = con;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}

	public void setBtnlogin(WebElement btnlogin) {
		this.btnlogin = btnlogin;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public void setLoginbtn(WebElement loginbtn) {
		this.loginbtn = loginbtn;
	}

	public WebElement getAddress() {
		return address;
	}

	public void setAddress(WebElement address) {
		this.address = address;
	}

	public WebElement getCountry() {
		return country;
	}

	public void setCountry(WebElement country) {
		this.country = country;
	}

	public WebElement getAddname() {
		return addname;
	}

	public void setAddname(WebElement addname) {
		this.addname = addname;
	}

	public WebElement getAddcoun() {
		return addcoun;
	}

	public void setAddcoun(WebElement addcoun) {
		this.addcoun = addcoun;
	}

	public WebElement getAddphone() {
		return addphone;
	}

	public void setAddphone(WebElement addphone) {
		this.addphone = addphone;
	}

	public WebElement getAddcode() {
		return addcode;
	}

	public void setAddcode(WebElement addcode) {
		this.addcode = addcode;
	}

	public WebElement getAddaddress() {
		return addaddress;
	}

	public void setAddaddress(WebElement addaddress) {
		this.addaddress = addaddress;
	}

	public WebElement getAddcity() {
		return addcity;
	}

	public void setAddcity(WebElement addcity) {
		this.addcity = addcity;
	}

	public WebElement getAddstate() {
		return addstate;
	}

	public void setAddstate(WebElement addstate) {
		this.addstate = addstate;
	}

	public WebElement getAddsubmit() {
		return addsubmit;
	}

	public void setAddsubmit(WebElement addsubmit) {
		this.addsubmit = addsubmit;
	}

	public WebElement getAddnewcart() {
		return addnewcart;
	}

	public void setAddnewcart(WebElement addnewcart) {
		this.addnewcart = addnewcart;
	}

	public void setDismiss(WebElement dismiss) {
		this.dismiss = dismiss;
	}

	// ---------------------------------------------------------------------------------------------------//
	public WebElement getDismiss() {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
		return w.until(ExpectedConditions.visibilityOf(dismiss));

	}

	public void newAddress(Map<String, String> mp) {
		driver.findElement(By.xpath("//span[text()='Add New Address']")).click();
		sendkeys(getCountry(), mp.get("Country"));
		sendkeys(getAddname(), mp.get("Name"));
		sendkeys(getAddaddress(), mp.get("Street Address"));
		sendkeys(getAddcity(), mp.get("City"));
		sendkeys(getAddstate(), mp.get("State"));
		sendkeys(getAddcode(), mp.get("ZIP Code"));
		sendkeys(getAddphone(), mp.get("Phone"));
		click(getAddsubmit());

	}

	public void selectAddress(Map<String, String> mp) {

		List<WebElement> add = driver.findElements(By.xpath("//span[@class='mat-radio-container']"));
		if (add.size() > 1) {
			add.get(0).click();
		} else {
			newAddress(mp);
		}

	}

	public void selectDeliveryType() {
		List<WebElement> deliverytype = driver.findElements(By.xpath("//span[@class='mat-radio-container']"));
		jsClick(deliverytype.get(0));

		WebElement con = driver.findElement(By.xpath("//span[text()='Continue']/parent::span/parent::button"));
		jsClick(con);

	}

	public void addCardDetails(String cardname, String cardNumber, String expmth, String expYear) {
		sendkeys(getName(), cardname);
		sendkeys(getCardnum(), cardNumber);
		Select s = new Select(getExp());
		s.selectByVisibleText(expmth);

		Select s2 = new Select(getDate());
		s2.selectByVisibleText(expYear);
		click(getSub());

	}

}
