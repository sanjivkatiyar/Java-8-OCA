package org.javaadvanced;

import java.util.Objects;

public class BankAccount {

    private String branchCode, accountNo, custName, custAddress;
    private double balance;

    public BankAccount(String branchCode, String accountNo, String custName, String custAddress, double balance) {
        this.branchCode = branchCode;
        this.accountNo = accountNo;
        this.custName = custName;
        this.custAddress = custAddress;
        this.balance = balance;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "branchCode='" + branchCode + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", custName='" + custName + '\'' +
                ", custAddress='" + custAddress + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Double.compare(that.balance, balance) == 0 && Objects.equals(branchCode, that.branchCode) && Objects.equals(accountNo, that.accountNo) && Objects.equals(custName, that.custName) && Objects.equals(custAddress, that.custAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(branchCode, accountNo, custName, custAddress, balance);
    }
}
