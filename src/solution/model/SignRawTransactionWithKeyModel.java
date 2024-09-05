/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solution.model;

/**
 *
 * @author ssd
 */
public class SignRawTransactionWithKeyModel {

    private String hex;
    private boolean complete;
    private Error[] errors;

    public String getHex() {
        return hex;
    }

    public void setHex(String value) {
        this.hex = value;
    }

    public boolean getComplete() {
        return complete;
    }

    public void setComplete(boolean value) {
        this.complete = value;
    }

    public Error[] getErrors() {
        return errors;
    }

    public void setErrors(Error[] value) {
        this.errors = value;
    }

    public class Error {

        private String txid;
        private long vout;
        private Object[] witness;
        private String scriptSig;
        private long sequence;
        private String error;

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

        public Object[] getWitness() {
            return witness;
        }

        public void setWitness(Object[] value) {
            this.witness = value;
        }

        public String getScriptSig() {
            return scriptSig;
        }

        public void setScriptSig(String value) {
            this.scriptSig = value;
        }

        public long getSequence() {
            return sequence;
        }

        public void setSequence(long value) {
            this.sequence = value;
        }

        public String getError() {
            return error;
        }

        public void setError(String value) {
            this.error = value;
        }
    }
}
