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
public class InscriptionModel {
    private String address;
    private Object[] charms;
    private List<String> children = new ArrayList<String>();
    private long contentLength;
    private String contentType;
    private String effectiveContentType;
    private long fee;
    private long height;
    private String id;
    private String next;
    private long number;
    private List<Object> parents = new ArrayList<Object>();
    private String previous;
    private Object rune;
    private Object sat;
    private String satpoint;
    private long timestamp;
    private long value;

    public String getAddress() { return address; }
    public void setAddress(String value) { this.address = value; }

    public Object[] getCharms() { return charms; }
    public void setCharms(Object[] value) { this.charms = value; }

    public long getContentLength() { return contentLength; }
    public void setContentLength(long value) { this.contentLength = value; }

    public String getContentType() { return contentType; }
    public void setContentType(String value) { this.contentType = value; }

    public String getEffectiveContentType() { return effectiveContentType; }
    public void setEffectiveContentType(String value) { this.effectiveContentType = value; }

    public long getFee() { return fee; }
    public void setFee(long value) { this.fee = value; }

    public long getHeight() { return height; }
    public void setHeight(long value) { this.height = value; }

    public String getID() { return id; }
    public void setID(String value) { this.id = value; }

    public String getNext() { return next; }
    public void setNext(String value) { this.next = value; }

    public long getNumber() { return number; }
    public void setNumber(long value) { this.number = value; }

    public String getPrevious() { return previous; }
    public void setPrevious(String value) { this.previous = value; }

    public Object getRune() { return rune; }
    public void setRune(Object value) { this.rune = value; }

    public Object getSat() { return sat; }
    public void setSat(Object value) { this.sat = value; }

    public String getSatpoint() { return satpoint; }
    public void setSatpoint(String value) { this.satpoint = value; }

    public long getTimestamp() { return timestamp; }
    public void setTimestamp(long value) { this.timestamp = value; }

    public long getValue() { return value; }
    public void setValue(long value) { this.value = value; }

    /**
     * @return the children
     */
    public List<String> getChildren() {
        return children;
    }

    /**
     * @param children the children to set
     */
    public void setChildren(List<String> children) {
        this.children = children;
    }

    /**
     * @return the parents
     */
    public List<Object> getParents() {
        return parents;
    }

    /**
     * @param parents the parents to set
     */
    public void setParents(List<Object> parents) {
        this.parents = parents;
    }
    
    
}
