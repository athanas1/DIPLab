/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author Alex
 */
public class MorningMessageInput implements InputMessageService {
    private String Msg = "WAKE UP, JEEZ";

    @Override
    public Message getMessage() {
    Message msg = new Message(Msg);
    return msg;}
    
}
