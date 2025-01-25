package solution.model;

import java.math.BigDecimal;

/**
 *
 * @author ssd
 */
public class RegistryModel {

    private String documentType;
    private PropertyInfo propertyInfo;
    private OwnerInfo ownerInfo;
    private BuyerInfo buyerInfo;
    private SaleAgreementContractInfo saleAgreementContractInfo;
    private TransactionInfo paymentInfo;

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

    public TransactionInfo getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(TransactionInfo value) {
        this.paymentInfo = value;
    }

    // BuyerInfo.java
    public class BuyerInfo {

        private String buyerNationalID;
        private String buyerName;
        private String buyerWalletAddress;
        private String buyerWalletPublicKeyAddress;

        public String getBuyerNationalID() {
            return buyerNationalID;
        }

        public void setBuyerNationalID(String buyerNationalID) {
            this.buyerNationalID = buyerNationalID;
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

        private String ownerNationalID;
        private String ownerName;
        private String ownerWalletAddress;
        private String ownerWalletPublicKeyAddress;

        public String getOwnerNationalID() {
            return ownerNationalID;
        }

        public void setOwnerNationalID(String ownerNationalID) {
            this.ownerNationalID = ownerNationalID;
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

// Info.java
    public class TransactionInfo {

        private String transactionID;
        private long blockHeight;
        private String blockHash;
        private String recipientAddress;
        private BigDecimal paymentAmount;
        private String timestamp;

        public String getTransactionID() {
            return transactionID;
        }

        public void setTransactionID(String value) {
            this.transactionID = value;
        }

        public long getBlockHeight() {
            return blockHeight;
        }

        public void setBlockHeight(long value) {
            this.blockHeight = value;
        }

        public String getBlockHash() {
            return blockHash;
        }

        public void setBlockHash(String value) {
            this.blockHash = value;
        }

        public String getRecipientAddress() {
            return recipientAddress;
        }

        public void setRecipientAddress(String value) {
            this.recipientAddress = value;
        }

        public BigDecimal getPaymentAmount() {
            return paymentAmount;
        }

        public void setPaymentAmount(BigDecimal value) {
            this.paymentAmount = value;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(String value) {
            this.timestamp = value;
        }
    }

// PropertyInfo.java
    public class PropertyInfo {

        private BigDecimal inscriptionNumber;
        private String inscriptionID;
        private String inscriptionAddress;
        private String revealTransactionGenesisID;
        private BigDecimal blockHeightGenesis;
        private String blockHashGenesis;
        private String timestamp;
        private String propertyAddress;
        private long propertyAreaSquareMeters;

        public BigDecimal getInscriptionNumber() {
            return inscriptionNumber;
        }

        public void setInscriptionNumber(BigDecimal value) {
            this.inscriptionNumber = value;
        }

        public String getInscriptionID() {
            return inscriptionID;
        }

        public void setInscriptionID(String value) {
            this.inscriptionID = value;
        }

        public String getInscriptionAddress() {
            return inscriptionAddress;
        }

        public void setInscriptionAddress(String inscriptionAddress) {
            this.inscriptionAddress = inscriptionAddress;
        }
        
        public String getRevealTransactionGenesisID() {
            return revealTransactionGenesisID;
        }

        public void setRevealTransactionGenesisID(String value) {
            this.revealTransactionGenesisID = value;
        }

        public BigDecimal getBlockHeightGenesis() {
            return blockHeightGenesis;
        }

        public void setBlockHeightGenesis(BigDecimal value) {
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

        private BigDecimal inscriptionNumber;
        private String inscriptionID;
        private String inscriptionAddress;
        private String revealTransactionGenesisID;
        private BigDecimal blockHeightGenesis;
        private String blockHashGenesis;
        private double salePrice;
        private String timestamp;
        private TransactionInfo signedContractSentToRegistryOfficeInfo;

        public BigDecimal getInscriptionNumber() {
            return inscriptionNumber;
        }

        public void setInscriptionNumber(BigDecimal value) {
            this.inscriptionNumber = value;
        }

        public String getInscriptionID() {
            return inscriptionID;
        }

        public void setInscriptionID(String value) {
            this.inscriptionID = value;
        }
        
        public String getInscriptionAddress() {
            return inscriptionAddress;
        }

        public void setInscriptionAddress(String inscriptionAddress) {
            this.inscriptionAddress = inscriptionAddress;
        }

        public String getRevealTransactionGenesisID() {
            return revealTransactionGenesisID;
        }

        public void setRevealTransactionGenesisID(String value) {
            this.revealTransactionGenesisID = value;
        }

        public BigDecimal getBlockHeightGenesis() {
            return blockHeightGenesis;
        }

        public void setBlockHeightGenesis(BigDecimal value) {
            this.blockHeightGenesis = value;
        }

        public String getBlockHashGenesis() {
            return blockHashGenesis;
        }

        public void setBlockHashGenesis(String value) {
            this.blockHashGenesis = value;
        }

        public double getSalePrice() {
            return salePrice;
        }

        public void setSalePrice(double value) {
            this.salePrice = value;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(String value) {
            this.timestamp = value;
        }

        public TransactionInfo getSignedContractSentToRegistryOfficeInfo() {
            return signedContractSentToRegistryOfficeInfo;
        }

        public void setSignedContractSentToRegistryOfficeInfo(TransactionInfo value) {
            this.signedContractSentToRegistryOfficeInfo = value;
        }

    }

}
