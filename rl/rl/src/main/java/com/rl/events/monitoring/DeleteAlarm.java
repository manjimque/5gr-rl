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
public class DeleteAlarm {
    private String alarmid;

    public DeleteAlarm(String alarmid) {
        this.alarmid = alarmid;
    }

    public String getAlarmid() {
        return alarmid;
    }

    public void setAlarmid(String alarmid) {
        this.alarmid = alarmid;
    }
    
}
