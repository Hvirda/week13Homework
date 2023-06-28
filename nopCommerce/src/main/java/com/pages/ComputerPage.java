package com.pages;

import com.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class ComputerPage extends Utility {
    By desktop = By.xpath("//ul[@class='top-menu notmobile']/li/ul/li/a[contains(text(),'Desktops')]");

    By sort = By.id("products-orderby");
    By addToCartBtn = By.xpath("//div[@class='item-grid']/div[1]//button[@class='button-2 product-box-add-to-cart-button']");
    By itemText = By.xpath("//h1");
    By procceser = By.id("product_attribute_1");
    By ram = By.id("product_attribute_2");
    By hhd = By.id("product_attribute_3_7");
    By chckbx = By.id("product_attribute_5_12");

    By price = By.xpath("//span[@id='price-value-1']");

    By addbtn = By.id("add-to-cart-button-1");
    By msg = By.xpath("//p[contains(text(),'The product has been added to your ')]");
    By clos = By.xpath("//span[@class='close']");
    By shoppingCart = By.xpath("//li[@id='topcartlink']/a");
    By gotoc = By.xpath("//button[@class='button-1 cart-button']");
    By shoppingCartMsg = By.xpath("//h1");
    By qty = By.xpath("//input[@class='qty-input']");
    By update = By.xpath("//button[@class='button-2 update-cart-button']");

    By total = By.xpath("//span[@class='product-subtotal']");
    By terms = By.id("termsofservice");
    By ckechout = By.xpath("//button[@class='button-1 checkout-button']");
    By welcomeText = By.xpath("//h1");
    By guestCheckout = By.xpath("//button[@class='button-1 checkout-as-guest-button']");
    By fName = By.id("BillingNewAddress_FirstName");
    By lname = By.id("BillingNewAddress_LastName");
    By email = By.id("BillingNewAddress_Email");
    By country = By.id("BillingNewAddress_CountryId");
    By state = By.id("BillingNewAddress_StateProvinceId");
    By city = By.id("BillingNewAddress_City");
    By address = By.id("BillingNewAddress_Address1");
    By zipcode = By.id("BillingNewAddress_ZipPostalCode");
    By phoneNumber = By.id("BillingNewAddress_PhoneNumber");
    By continueBtn = By.xpath("//div[@id='billing-buttons-container']/button[@class='button-1 new-address-next-step-button']");

    By radioair=By.id("shippingoption_1");
    public void sortText() {
        clickOnElement(desktop);
        selectByVisibleTextFromDropDown(sort, "Name: Z to A");

    }

    public void clickOnDesktop() {
        clickOnElement(desktop);
    }

    public void selectAtoZ(String name) {

        selectByVisibleTextFromDropDown(sort, name);
    }

    public void addtoCart() throws InterruptedException {

        Thread.sleep(2000);
        clickOnElement(addToCartBtn);
    }

    public String getItemText() throws InterruptedException {
        Reporter.log("item added msg " +itemText.toString());
        Thread.sleep(2000);
        return getTextFromElement(itemText);
        //System.out.println(getTextFromElement(itemText));

    }

    public void selectProcesser(String name) {
        Reporter.log("item added msg " +procceser.toString());
        selectByVisibleTextFromDropDown(procceser, name);
    }

    public void selectRam(String name) {
        Reporter.log("item added msg " +ram.toString());
        selectByVisibleTextFromDropDown(ram, name);
    }

    public void selectRadiobtn() {
        clickOnElement(hhd);
    }

    public void selectCheckbox() {
        clickOnElement(chckbx);
    }

    public void getPrice() {
        Reporter.log("price of product is " +price.toString());
        getTextFromElement(price);
    }

    public void clickAddBtn() {
        clickOnElement(addbtn);
    }

    public String getMsg() {
        Reporter.log("item added msg " +msg.toString());
        return getTextFromElement(msg);
    }

    public void closemsg() {
        clickOnElement(clos);
    }

    public void shoppingCart() {
        mouseHoverToElement(shoppingCart);
    }

    public void clickGoTo() {
        clickOnElement(gotoc);
    }

    public String shoppingCartMsg() {
        Reporter.log("shopping cart message " +shoppingCartMsg.toString()+"<br>");
        return getTextFromElement(shoppingCartMsg);
    }

    public void changeQty() {
        Reporter.log("change quantity " +qty.toString()+"<br>");
        clearTextFromField(qty);
        sendTextToElement(qty, "2");
    }

    public void clickOnUpdate() {
        clickOnElement(update);
    }

    public String getTotlal() {
        Reporter.log("total " +total.toString()+"<br>");
        return getTextFromElement(total);
    }

    public void clickTerms() {
        clickOnElement(terms);
    }

    public void checkout() {
        clickOnElement(ckechout);
    }

    public String getTitleText() {
        Reporter.log("welcome message " +welcomeText.toString()+"<br>");
        return getTextFromElement(welcomeText);
    }

    public void clickGuestCheckout() {
        clickOnElement(guestCheckout);
    }

    //fill form
    public void getFname(String name) {
        Reporter.log("firstname " +fName.toString()+"<br>");
        sendTextToElement(fName, name);
    }

    public void getlname(String name) {

        Reporter.log("lastname" +lname.toString()+"<br>");
        sendTextToElement(lname, name);
    }

    public void getEmail(String name) {
        Reporter.log("email " +email.toString()+"<br>");
        sendTextToElement(email, name);
    }

    public void getCountry(String name) {
        Reporter.log("country" +country.toString()+"<br>");
        selectByVisibleTextFromDropDown(country, name);
    }

    public void getState(String name) {
        Reporter.log("state " +state.toString()+"<br>");
        selectByVisibleTextFromDropDown(state, name);
    }

    public void getCity(String name) {
        Reporter.log("city" +state.toString()+"<br>");
        sendTextToElement(city, name);
    }

    public void getAddress(String name) {

        sendTextToElement(address, name);
        Reporter.log("address" +address.toString()+"<br>");
    }

    public void getZipcode(String name) {
        Reporter.log("zipcode" +zipcode.toString()+"<br>");
        sendTextToElement(zipcode, name);
    }

    public void getPhoneNumber(String name) {
        sendTextToElement(phoneNumber, name);
    }

    public void clickContinue() {
        clickOnElement(continueBtn);
    }

    public void clkradioair(){
        clickOnElement(radioair);
    }
    By contnue=By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    public void clkcontinue(){
        clickOnElement(contnue);
    }

    By crcard = By.id("paymentmethod_1");

    public void cliktCrediCard() {
        clickOnElement(crcard);
    }
    By creditTxt=By.xpath("//label[contains(text(),'Credit Card')]");
    public String getcredittxt(){
        Reporter.log("creditcard " +creditTxt.toString()+"<br>");
       return getTextFromElement(creditTxt);
    }

    By clCont = By.xpath("//button[@class='button-1 payment-method-next-step-button']");

    public void clickCont() {
        clickOnElement(clCont);
    }

    By cardHoldr = By.id("CardholderName");

    public void getCardHoldr(String name) {
        sendTextToElement(cardHoldr, name);
    }

    By cardNo = By.id("CardNumber");

    public void getCardNo(String no) {
        sendTextToElement(cardNo, no);
    }

    By expMonth = By.id("ExpireMonth");

    public void getExpMonth(String name) {
        selectByVisibleTextFromDropDown(expMonth, name);
    }

    By expYear = By.id("ExpireYear");

    public void getExpYear(String year) {
        selectByVisibleTextFromDropDown(expYear, year);
    }
    By code=By.id("CardCode");
    public void getcardcode(String crcode){
        sendTextToElement(code,crcode);
    }
    By contn=By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    public void clkcontn(){
        clickOnElement(contn);
    }
    By totlamt=By.xpath("//span[@class='value-summary']/strong");
    public String gettotlamt(){
       return getTextFromElement(totlamt);
    }
    By contnu=By.xpath("//button[@class='button-1 confirm-order-next-step-button']");
    public void clkcon(){
        clickOnElement(contnu);
    }
    By successMsg=By.xpath("//div[@class='title']/strong[contains(text(),'Your order has been successfully processed!')]");
    public String getSuccessfullorderMsg(){
        Reporter.log("placed successfull " +successMsg.toString()+"<br>");
        return getTextFromElement(successMsg);
    }
    By clkcon=By.xpath("//button[@class='button-1 order-completed-continue-button']");
    public void cliccon(){
        clickOnElement(clkcon);
    }
    By welcmMsg=By.xpath("//h2");
    public String getwelcmmsg(){
        Reporter.log("navigate to another page after successfull order " +welcmMsg.toString()+"<br>");
        return getTextFromElement(welcmMsg);
    }


}
