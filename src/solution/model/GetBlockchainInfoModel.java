/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solution.model;

/**
 *
 * @author ssd
 */
public class GetBlockchainInfoModel {
    private String chain;
    private long blocks;
    private long headers;
    private String bestblockhash;
    private double difficulty;
    private long time;
    private long mediantime;
    private long verificationprogress;
    private boolean initialblockdownload;
    private String chainwork;
    private long sizeOnDisk;
    private boolean pruned;
    private String warnings;

    public String getChain() { return chain; }
    public void setChain(String value) { this.chain = value; }

    public long getBlocks() { return blocks; }
    public void setBlocks(long value) { this.blocks = value; }

    public long getHeaders() { return headers; }
    public void setHeaders(long value) { this.headers = value; }

    public String getBestblockhash() { return bestblockhash; }
    public void setBestblockhash(String value) { this.bestblockhash = value; }

    public double getDifficulty() { return difficulty; }
    public void setDifficulty(double value) { this.difficulty = value; }

    public long getTime() { return time; }
    public void setTime(long value) { this.time = value; }

    public long getMediantime() { return mediantime; }
    public void setMediantime(long value) { this.mediantime = value; }

    public long getVerificationprogress() { return verificationprogress; }
    public void setVerificationprogress(long value) { this.verificationprogress = value; }

    public boolean getInitialblockdownload() { return initialblockdownload; }
    public void setInitialblockdownload(boolean value) { this.initialblockdownload = value; }

    public String getChainwork() { return chainwork; }
    public void setChainwork(String value) { this.chainwork = value; }

    public long getSizeOnDisk() { return sizeOnDisk; }
    public void setSizeOnDisk(long value) { this.sizeOnDisk = value; }

    public boolean getPruned() { return pruned; }
    public void setPruned(boolean value) { this.pruned = value; }

    public String getWarnings() { return warnings; }
    public void setWarnings(String value) { this.warnings = value; }
}
