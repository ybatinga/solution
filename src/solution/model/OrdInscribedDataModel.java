/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solution.model;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author ssd
 */
public class OrdInscribedDataModel {

    private String commit;
    private String commit_psbt = null;
    private List<Inscription> inscriptions = new ArrayList<Inscription>();
    private String parent = null;
    private String reveal;
    private String reveal_psbt = null;
    private float total_fees;

    // Getter Methods 
    public String getCommit() {
        return commit;
    }

    public String getCommit_psbt() {
        return commit_psbt;
    }

    public String getParent() {
        return parent;
    }

    public String getReveal() {
        return reveal;
    }

    public String getReveal_psbt() {
        return reveal_psbt;
    }

    public float getTotal_fees() {
        return total_fees;
    }

    // Setter Methods 
    public void setCommit(String commit) {
        this.commit = commit;
    }

    public void setCommit_psbt(String commit_psbt) {
        this.commit_psbt = commit_psbt;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public void setReveal(String reveal) {
        this.reveal = reveal;
    }

    public void setReveal_psbt(String reveal_psbt) {
        this.reveal_psbt = reveal_psbt;
    }

    public void setTotal_fees(float total_fees) {
        this.total_fees = total_fees;
    }
    
    public List<Inscription> getInscriptions() {
        return inscriptions;
    }

    public void setInscriptions(List<Inscription> inscriptions) {
        this.inscriptions = inscriptions;
    }

    public class Inscription {

        private String id;
        private String location;

        public String getID() {
            return id;
        }

        public void setID(String value) {
            this.id = value;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String value) {
            this.location = value;
        }
    }


}
