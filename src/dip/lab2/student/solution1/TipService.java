/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author Alex
 */
public class TipService {

    public double doTip(TipCalculator TC) {
        return TC.getTip();
    }
    private TipCalculator tipCalculator;

    public TipService(TipCalculator tipCalculator) {
        this.tipCalculator = tipCalculator;
    }

    public TipCalculator getTipCalculator() {
        return tipCalculator;
    }

    public void setTipCalculator(TipCalculator tipCalculator) {
        this.tipCalculator = tipCalculator;
    }
}
