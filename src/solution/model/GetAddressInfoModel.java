/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solution.model;

/**
 *
 * @author ssd
 */
public class GetAddressInfoModel {

    private Result result;
    private Object error;
    private String id;

    public Result getResult() {
        return result;
    }

    public void setResult(Result value) {
        this.result = value;
    }

    public Object getError() {
        return error;
    }

    public void setError(Object value) {
        this.error = value;
    }

    public String getID() {
        return id;
    }

    public void setID(String value) {
        this.id = value;
    }

    public class Result {

        private String address;
        private String scriptPubKey;
        private boolean ismine;
        private boolean solvable;
        private String desc;
        private boolean iswatchonly;
        private boolean isscript;
        private boolean iswitness;
        private String pubkey;
        private boolean iscompressed;
        private boolean ischange;
        private long timestamp;
        private String hdkeypath;
        private String hdseedid;
        private String hdmasterfingerprint;
        private String[] labels;

        public String getAddress() {
            return address;
        }

        public void setAddress(String value) {
            this.address = value;
        }

        public String getScriptPubKey() {
            return scriptPubKey;
        }

        public void setScriptPubKey(String value) {
            this.scriptPubKey = value;
        }

        public boolean getIsmine() {
            return ismine;
        }

        public void setIsmine(boolean value) {
            this.ismine = value;
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

        public boolean getIswatchonly() {
            return iswatchonly;
        }

        public void setIswatchonly(boolean value) {
            this.iswatchonly = value;
        }

        public boolean getIsscript() {
            return isscript;
        }

        public void setIsscript(boolean value) {
            this.isscript = value;
        }

        public boolean getIswitness() {
            return iswitness;
        }

        public void setIswitness(boolean value) {
            this.iswitness = value;
        }

        public String getPubkey() {
            return pubkey;
        }

        public void setPubkey(String value) {
            this.pubkey = value;
        }

        public boolean getIscompressed() {
            return iscompressed;
        }

        public void setIscompressed(boolean value) {
            this.iscompressed = value;
        }

        public boolean getIschange() {
            return ischange;
        }

        public void setIschange(boolean value) {
            this.ischange = value;
        }

        public long getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(long value) {
            this.timestamp = value;
        }

        public String getHdkeypath() {
            return hdkeypath;
        }

        public void setHdkeypath(String value) {
            this.hdkeypath = value;
        }

        public String getHdseedid() {
            return hdseedid;
        }

        public void setHdseedid(String value) {
            this.hdseedid = value;
        }

        public String getHdmasterfingerprint() {
            return hdmasterfingerprint;
        }

        public void setHdmasterfingerprint(String value) {
            this.hdmasterfingerprint = value;
        }

        public String[] getLabels() {
            return labels;
        }

        public void setLabels(String[] value) {
            this.labels = value;
        }
    }
}
