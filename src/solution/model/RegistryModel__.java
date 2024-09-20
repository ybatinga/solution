/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solution.model;

/**
 *
 * @author ssd
 */
public class RegistryModel__ {

    private long id;
    private PropertyInfo propertyInfo;
    private OwnerInfo ownerInfo;
    private BuyerInfo buyerInfo;
    private SalePriceInfo salePriceInfo;
    private PaymentInfo paymentInfo;

    public long getID() {
        return id;
    }

    public void setID(long value) {
        this.id = value;
    }

    public PropertyInfo getPropertyInfo() {
        return propertyInfo;
    }

    public void setPropertyInfo(PropertyInfo value) {
        this.propertyInfo = value;
    }

    public OwnerInfo getOwnerInfo() {
        return ownerInfo;
    }

    public void setOwnerInfo(OwnerInfo value) {
        this.ownerInfo = value;
    }

    public BuyerInfo getBuyerInfo() {
        return buyerInfo;
    }

    public void setBuyerInfo(BuyerInfo value) {
        this.buyerInfo = value;
    }

    public SalePriceInfo getSalePriceInfo() {
        return salePriceInfo;
    }

    public void setSalePriceInfo(SalePriceInfo value) {
        this.salePriceInfo = value;
    }

    public PaymentInfo getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(PaymentInfo value) {
        this.paymentInfo = value;
    }

    public class BuyerInfo {

        private String id;
        private String name;
        private String buyerWalletAddress;

        public String getID() {
            return id;
        }

        public void setID(String value) {
            this.id = value;
        }

        public String getName() {
            return name;
        }

        public void setName(String value) {
            this.name = value;
        }

        public String getBuyerWalletAddress() {
            return buyerWalletAddress;
        }

        public void setBuyerWalletAddress(String value) {
            this.buyerWalletAddress = value;
        }
    }

    public class OwnerInfo {

        private String id;
        private String name;
        private String ownerWalletAddress;

        public String getID() {
            return id;
        }

        public void setID(String value) {
            this.id = value;
        }

        public String getName() {
            return name;
        }

        public void setName(String value) {
            this.name = value;
        }

        public String getOwnerWalletAddress() {
            return ownerWalletAddress;
        }

        public void setOwnerWalletAddress(String value) {
            this.ownerWalletAddress = value;
        }
    }

    public class PaymentInfo {

        private String txid;
        private double paymentAmount;
        private String timestamp;

        public String getTxid() {
            return txid;
        }

        public void setTxid(String value) {
            this.txid = value;
        }

        public double getPaymentAmount() {
            return paymentAmount;
        }

        public void setPaymentAmount(double value) {
            this.paymentAmount = value;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(String value) {
            this.timestamp = value;
        }
    }

    public class PropertyInfo {

        private long regNum;
        private String regID;
        private String timestamp;
        private String address;
        private long areaSquareMeters;

        public long getRegNum() {
            return regNum;
        }

        public void setRegNum(long value) {
            this.regNum = value;
        }

        public String getRegID() {
            return regID;
        }

        public void setRegID(String value) {
            this.regID = value;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(String value) {
            this.timestamp = value;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String value) {
            this.address = value;
        }

        public long getAreaSquareMeters() {
            return areaSquareMeters;
        }

        public void setAreaSquareMeters(long value) {
            this.areaSquareMeters = value;
        }
    }

// SalePriceInfo.java
    public class SalePriceInfo {

        private double price;

        public double getPrice() {
            return price;
        }

        public void setPrice(double value) {
            this.price = value;
        }
    }

}
