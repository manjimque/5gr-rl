/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rl.events.monitoring;

/**
 *
 * @author efabuba
 */
public class GetPM {
    private boolean allexp;
    private String pmid;

    public GetPM(boolean allexp, String pmid) {
        this.allexp = allexp;
        this.pmid = pmid;
    }

    public boolean isAllexp() {
        return allexp;
    }

    public void setAllexp(boolean allexp) {
        this.allexp = allexp;
    }

    public String getPmid() {
        return pmid;
    }

    public void setPmid(String pmid) {
        this.pmid = pmid;
    }
    
}
