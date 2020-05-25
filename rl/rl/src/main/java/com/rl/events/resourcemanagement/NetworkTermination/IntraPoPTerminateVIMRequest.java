/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rl.events.resourcemanagement.NetworkTermination;

import java.util.List;

/**
 *
 * @author efabuba
 */
public class IntraPoPTerminateVIMRequest {
    private long reqid;
    private List<Long> domlist;
    private List<String> netreslist;
    private List<String> subnetreslist;
    private List<String> portnetreslist;
    private List<String> domreslist;

    public IntraPoPTerminateVIMRequest(long reqid, List<Long> domlist, List<String> netreslist, List<String> subnetreslist, List<String> portnetreslist, List<String> domreslist) {
        this.reqid = reqid;
        this.domlist = domlist;
        this.netreslist = netreslist;
        this.subnetreslist = subnetreslist;
        this.portnetreslist = portnetreslist;
        this.domreslist = domreslist;
    }

    public List<String> getSubnetreslist() {
        return subnetreslist;
    }

    public void setSubnetreslist(List<String> subnetreslist) {
        this.subnetreslist = subnetreslist;
    }

    public List<String> getPortnetreslist() {
        return portnetreslist;
    }

    public void setPortnetreslist(List<String> portnetreslist) {
        this.portnetreslist = portnetreslist;
    }





    public long getReqid() {
        return reqid;
    }

    public void setReqid(long reqid) {
        this.reqid = reqid;
    }

    public List<Long> getDomlist() {
        return domlist;
    }

    public void setDomlist(List<Long> domlist) {
        this.domlist = domlist;
    }

    public List<String> getNetreslist() {
        return netreslist;
    }

    public void setNetreslist(List<String> netreslist) {
        this.netreslist = netreslist;
    }

    public List<String> getDomreslist() {
        return domreslist;
    }

    public void setDomreslist(List<String> domreslist) {
        this.domreslist = domreslist;
    }
    
    
}
