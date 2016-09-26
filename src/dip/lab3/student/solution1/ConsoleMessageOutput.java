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
public class ConsoleMessageOutput implements OutputMessageService {

    @Override
    public void sendMessage(InputMessageService messageInput) {
    Message msg = messageInput.getMessage();
        System.out.println(msg.getMessageAsString());}
    
}
