package org.example;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Account {
    @JsonProperty("account_name")
    private String accountName;

    @JsonProperty("account_label")
    private String accountLabel;

    @JsonProperty("account_number")
    private String accountNumber;

    @JsonProperty("account_type")
    private String accountType;

    @JsonProperty("account_balance")
    private double accountBalance;

    @JsonProperty("book_balance")
    private double bookBalance;

    @JsonProperty("account_status")
    private String accountStatus;

    @JsonProperty("can_withdraw")
    private String canWithdraw;

    @JsonProperty("max_withdrawable_amount")
    private double maxWithdrawableAmount;

    @JsonProperty("can_deposit")
    private String canDeposit;

    @JsonProperty("max_deposit_amount")
    private double maxDepositAmount;

    @JsonProperty("can_withdraw_ift")
    private String canWithdrawIft;

    @JsonProperty("can_deposit_ift")
    private String canDepositIft;

    @JsonProperty("product_id")
    private String productId;

    @JsonProperty("product_name")
    private String productName;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountLabel() {
        return accountLabel;
    }

    public void setAccountLabel(String accountLabel) {
        this.accountLabel = accountLabel;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getBookBalance() {
        return bookBalance;
    }

    public void setBookBalance(double bookBalance) {
        this.bookBalance = bookBalance;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getCanWithdraw() {
        return canWithdraw;
    }

    public void setCanWithdraw(String canWithdraw) {
        this.canWithdraw = canWithdraw;
    }

    public double getMaxWithdrawableAmount() {
        return maxWithdrawableAmount;
    }

    public void setMaxWithdrawableAmount(double maxWithdrawableAmount) {
        this.maxWithdrawableAmount = maxWithdrawableAmount;
    }

    public String getCanDeposit() {
        return canDeposit;
    }

    public void setCanDeposit(String canDeposit) {
        this.canDeposit = canDeposit;
    }

    public double getMaxDepositAmount() {
        return maxDepositAmount;
    }

    public void setMaxDepositAmount(double maxDepositAmount) {
        this.maxDepositAmount = maxDepositAmount;
    }

    public String getCanWithdrawIft() {
        return canWithdrawIft;
    }

    public void setCanWithdrawIft(String canWithdrawIft) {
        this.canWithdrawIft = canWithdrawIft;
    }

    public String getCanDepositIft() {
        return canDepositIft;
    }

    public void setCanDepositIft(String canDepositIft) {
        this.canDepositIft = canDepositIft;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}