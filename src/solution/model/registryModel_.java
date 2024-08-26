package solution.model;

import java.math.BigDecimal;

/**
 *
 * @author ssd
 */
public class registryModel_ {
    
    private Long id; 
    private BigDecimal propertyRegistryNumber;
    private String propertyRegistryId;
    private String propertyTimestamp;
    private String propertyAddress;
    private BigDecimal propertySquareMeters;
    private String propertyRegistryStatus;//
    private String ownerName;
    private BigDecimal ownerId;
    private String ownerWalletAddress;
    private String buyerName;
    private BigDecimal buyerId;
    private String buyerWalletAddress;        
    private String paymentTxId;           
    private String paymentTimestamp;        
    private BigDecimal paymentAmount;
    private String paymentMultisigAddress;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getPropertyRegistryNumber() {
        return propertyRegistryNumber;
    }

    public void setPropertyRegistryNumber(BigDecimal propertyRegistryNumber) {
        this.propertyRegistryNumber = propertyRegistryNumber;
    }

    public String getPropertyRegistryId() {
        return propertyRegistryId;
    }

    public void setPropertyRegistryId(String propertyRegistryId) {
        this.propertyRegistryId = propertyRegistryId;
    }

    public String getPropertyTimestamp() {
        return propertyTimestamp;
    }

    public void setPropertyTimestamp(String propertyTimestamp) {
        this.propertyTimestamp = propertyTimestamp;
    }

    public String getPropertyAddress() {
        return propertyAddress;
    }

    public void setPropertyAddress(String propertyAddress) {
        this.propertyAddress = propertyAddress;
    }

    public BigDecimal getPropertySquareMeters() {
        return propertySquareMeters;
    }

    public void setPropertySquareMeters(BigDecimal propertySquareMeters) {
        this.propertySquareMeters = propertySquareMeters;
    }

    public String getPropertyRegistryStatus() {
        return propertyRegistryStatus;
    }

    public void setPropertyRegistryStatus(String propertyRegistryStatus) {
        this.propertyRegistryStatus = propertyRegistryStatus;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public BigDecimal getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(BigDecimal ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerWalletAddress() {
        return ownerWalletAddress;
    }

    public void setOwnerWalletAddress(String ownerWalletAddress) {
        this.ownerWalletAddress = ownerWalletAddress;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public BigDecimal getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(BigDecimal buyerId) {
        this.buyerId = buyerId;
    }

    public String getBuyerWalletAddress() {
        return buyerWalletAddress;
    }

    public void setBuyerWalletAddress(String buyerWalletAddress) {
        this.buyerWalletAddress = buyerWalletAddress;
    }

    public String getPaymentTxId() {
        return paymentTxId;
    }

    public void setPaymentTxId(String paymentTxId) {
        this.paymentTxId = paymentTxId;
    }

    public String getPaymentTimestamp() {
        return paymentTimestamp;
    }

    public void setPaymentTimestamp(String paymentTimestamp) {
        this.paymentTimestamp = paymentTimestamp;
    }

    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getPaymentMultisigAddress() {
        return paymentMultisigAddress;
    }

    public void setPaymentMultisigAddress(String paymentMultisigAddress) {
        this.paymentMultisigAddress = paymentMultisigAddress;
    }
    
    
    
}
