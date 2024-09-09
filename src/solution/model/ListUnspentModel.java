/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solution.model;

/**
 *
 * @author ssd
 */
public class ListUnspentModel {

    private String txid;
    private long vout;
    private String address;
    private String label;
    private String scriptPubKey;
    private double amount;
    private long confirmations;
    private boolean spendable;
    private boolean solvable;
    private String desc;
    private Object[] parentDescs;
    private boolean safe;

    public String getTxid() {
        return txid;
    }

    public void setTxid(String value) {
        this.txid = value;
    }

    public long getVout() {
        return vout;
    }

    public void setVout(long value) {
        this.vout = value;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String value) {
        this.address = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String value) {
        this.label = value;
    }

    public String getScriptPubKey() {
        return scriptPubKey;
    }

    public void setScriptPubKey(String value) {
        this.scriptPubKey = value;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double value) {
        this.amount = value;
    }

    public long getConfirmations() {
        return confirmations;
    }

    public void setConfirmations(long value) {
        this.confirmations = value;
    }

    public boolean getSpendable() {
        return spendable;
    }

    public void setSpendable(boolean value) {
        this.spendable = value;
    }

    public boolean getSolvable() {
        return solvable;
    }

    public void setSolvable(boolean value) {
        this.solvable = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String value) {
        this.desc = value;
    }

    public Object[] getParentDescs() {
        return parentDescs;
    }

    public void setParentDescs(Object[] value) {
        this.parentDescs = value;
    }

    public boolean getSafe() {
        return safe;
    }

    public void setSafe(boolean value) {
        this.safe = value;
    }
}
