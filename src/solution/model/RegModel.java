/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solution.model;

/**
 *
 * @author ssd
 */
public class RegModel {

    private String documentType;
    private PropertyInfo propertyInfo;
    private OwnerInfo ownerInfo;
    private BuyerInfo buyerInfo;
    private SaleAgreementContractInfo saleAgreementContractInfo;

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String value) {
        this.documentType = value;
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

    public SaleAgreementContractInfo getSaleAgreementContractInfo() {
        return saleAgreementContractInfo;
    }

    public void setSaleAgreementContractInfo(SaleAgreementContractInfo value) {
        this.saleAgreementContractInfo = value;
    }

// BuyerInfo.java
    public class BuyerInfo {

        private String nationalID;
        private String buyerName;
        private String buyerWalletAddress;
        private String buyerWalletPublicKeyAddress;

        public String getNationalID() {
            return nationalID;
        }

        public void setNationalID(String value) {
            this.nationalID = value;
        }

        public String getBuyerName() {
            return buyerName;
        }

        public void setBuyerName(String value) {
            this.buyerName = value;
        }

        public String getBuyerWalletAddress() {
            return buyerWalletAddress;
        }

        public void setBuyerWalletAddress(String value) {
            this.buyerWalletAddress = value;
        }

        public String getBuyerWalletPublicKeyAddress() {
            return buyerWalletPublicKeyAddress;
        }

        public void setBuyerWalletPublicKeyAddress(String value) {
            this.buyerWalletPublicKeyAddress = value;
        }
    }

// OwnerInfo.java
    public class OwnerInfo {

        private String nationalID;
        private String ownerName;
        private String ownerWalletAddress;
        private String ownerWalletPublicKeyAddress;

        public String getNationalID() {
            return nationalID;
        }

        public void setNationalID(String value) {
            this.nationalID = value;
        }

        public String getOwnerName() {
            return ownerName;
        }

        public void setOwnerName(String value) {
            this.ownerName = value;
        }

        public String getOwnerWalletAddress() {
            return ownerWalletAddress;
        }

        public void setOwnerWalletAddress(String value) {
            this.ownerWalletAddress = value;
        }

        public String getOwnerWalletPublicKeyAddress() {
            return ownerWalletPublicKeyAddress;
        }

        public void setOwnerWalletPublicKeyAddress(String value) {
            this.ownerWalletPublicKeyAddress = value;
        }
    }

// PropertyInfo.java
    public class PropertyInfo {

        private long inscriptionNumber;
        private String inscriptionID;
        private String revealTransactionGenesisID;
        private long blockHeightGenesis;
        private String blockHashGenesis;
        private String timestamp;
        private String propertyAddress;
        private long propertyAreaSquareMeters;

        public long getInscriptionNumber() {
            return inscriptionNumber;
        }

        public void setInscriptionNumber(long value) {
            this.inscriptionNumber = value;
        }

        public String getInscriptionID() {
            return inscriptionID;
        }

        public void setInscriptionID(String value) {
            this.inscriptionID = value;
        }

        public String getRevealTransactionGenesisID() {
            return revealTransactionGenesisID;
        }

        public void setRevealTransactionGenesisID(String value) {
            this.revealTransactionGenesisID = value;
        }

        public long getBlockHeightGenesis() {
            return blockHeightGenesis;
        }

        public void setBlockHeightGenesis(long value) {
            this.blockHeightGenesis = value;
        }

        public String getBlockHashGenesis() {
            return blockHashGenesis;
        }

        public void setBlockHashGenesis(String value) {
            this.blockHashGenesis = value;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(String value) {
            this.timestamp = value;
        }

        public String getPropertyAddress() {
            return propertyAddress;
        }

        public void setPropertyAddress(String value) {
            this.propertyAddress = value;
        }

        public long getPropertyAreaSquareMeters() {
            return propertyAreaSquareMeters;
        }

        public void setPropertyAreaSquareMeters(long value) {
            this.propertyAreaSquareMeters = value;
        }
    }

// SaleAgreementContractInfo.java
    public class SaleAgreementContractInfo {

        private double salePrice;

        public double getSalePrice() {
            return salePrice;
        }

        public void setSalePrice(double value) {
            this.salePrice = value;
        }
    }
}
