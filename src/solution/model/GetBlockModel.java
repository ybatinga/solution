/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solution.model;

import java.util.ArrayList;
import java.util.List;

public class GetBlockModel {
    private String hash;
    private long confirmations;
    private long height;
    private long version;
    private String versionHex;
    private String merkleroot;
    private long time;
    private long mediantime;
    private long nonce;
    private String bits;
    private double difficulty;
    private String chainwork;
    private long nTx;
    private String previousblockhash;
    private long strippedsize;
    private long size;
    private long weight;
    private List<String> tx = new ArrayList<String>();

    public String getHash() { return hash; }
    public void setHash(String value) { this.hash = value; }

    public long getConfirmations() { return confirmations; }
    public void setConfirmations(long value) { this.confirmations = value; }

    public long getHeight() { return height; }
    public void setHeight(long value) { this.height = value; }

    public long getVersion() { return version; }
    public void setVersion(long value) { this.version = value; }

    public String getVersionHex() { return versionHex; }
    public void setVersionHex(String value) { this.versionHex = value; }

    public String getMerkleroot() { return merkleroot; }
    public void setMerkleroot(String value) { this.merkleroot = value; }

    public long getTime() { return time; }
    public void setTime(long value) { this.time = value; }

    public long getMediantime() { return mediantime; }
    public void setMediantime(long value) { this.mediantime = value; }

    public long getNonce() { return nonce; }
    public void setNonce(long value) { this.nonce = value; }

    public String getBits() { return bits; }
    public void setBits(String value) { this.bits = value; }

    public double getDifficulty() { return difficulty; }
    public void setDifficulty(double value) { this.difficulty = value; }

    public String getChainwork() { return chainwork; }
    public void setChainwork(String value) { this.chainwork = value; }

    public long getNTx() { return nTx; }
    public void setNTx(long value) { this.nTx = value; }

    public String getPreviousblockhash() { return previousblockhash; }
    public void setPreviousblockhash(String value) { this.previousblockhash = value; }

    public long getStrippedsize() { return strippedsize; }
    public void setStrippedsize(long value) { this.strippedsize = value; }

    public long getSize() { return size; }
    public void setSize(long value) { this.size = value; }

    public long getWeight() { return weight; }
    public void setWeight(long value) { this.weight = value; }

    public List<String> getTx() {
        return tx;
    }

    public void setTx(List<String> tx) {
        this.tx = tx;
    }
    
}
