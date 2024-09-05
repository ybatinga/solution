/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solution.model;

import java.util.List;

/**
 *
 * @author ssd
 */
public class DecodeRawTransactionModel {

    private String txid;
    private String hash;
    private long version;
    private long size;
    private long vsize;
    private long weight;
    private long locktime;
//    private Vin[vin] vin;
    private List<Vin> vin;
//    private Vout[] vout;
    private List<Vout> vout;

    public String getTxid() {
        return txid;
    }

    public void setTxid(String value) {
        this.txid = value;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String value) {
        this.hash = value;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long value) {
        this.version = value;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long value) {
        this.size = value;
    }

    public long getVsize() {
        return vsize;
    }

    public void setVsize(long value) {
        this.vsize = value;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long value) {
        this.weight = value;
    }

    public long getLocktime() {
        return locktime;
    }

    public void setLocktime(long value) {
        this.locktime = value;
    }

//    public Vin[] getVin() {
//        return vin;
//    }
//
//    public void setVin(Vin[] value) {
//        this.setVin(value);
//    }

//    public Vout[] getVout() {
//        return vout;
//    }
//
//    public void setVout(Vout[] value) {
//        this.vout = value;
//    }
    
    public void setVin(List<Vin> vin) {
        this.vin = vin;
    }

    public List<Vin> getVin() {
        return vin;
    }
    
    public List<Vout> getVout() {
        return vout;
    }

    public void setVout(List<Vout> vout) {
        this.vout = vout;
    }

    public class Vin {

        private String txid;
        private long vout;
        private ScriptSig scriptSig;
        private long sequence;

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

        public ScriptSig getScriptSig() {
            return scriptSig;
        }

        public void setScriptSig(ScriptSig value) {
            this.scriptSig = value;
        }

        public long getSequence() {
            return sequence;
        }

        public void setSequence(long value) {
            this.sequence = value;
        }
    }

    public class ScriptSig {

        private String asm;
        private String hex;

        public String getASM() {
            return asm;
        }

        public void setASM(String value) {
            this.asm = value;
        }

        public String getHex() {
            return hex;
        }

        public void setHex(String value) {
            this.hex = value;
        }
    }

    public class Vout {

        private double value;
        private long n;
        private ScriptPubKey scriptPubKey;

        public double getValue() {
            return value;
        }

        public void setValue(double value) {
            this.value = value;
        }

        public long getN() {
            return n;
        }

        public void setN(long value) {
            this.n = value;
        }

        public ScriptPubKey getScriptPubKey() {
            return scriptPubKey;
        }

        public void setScriptPubKey(ScriptPubKey value) {
            this.scriptPubKey = value;
        }
    }

    public class ScriptPubKey {

        private String asm;
        private String desc;
        private String hex;
        private String address;
        private String type;

        public String getASM() {
            return asm;
        }

        public void setASM(String value) {
            this.asm = value;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String value) {
            this.desc = value;
        }

        public String getHex() {
            return hex;
        }

        public void setHex(String value) {
            this.hex = value;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String value) {
            this.address = value;
        }

        public String getType() {
            return type;
        }

        public void setType(String value) {
            this.type = value;
        }
    }

}
