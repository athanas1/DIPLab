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
public class Startup {
    public static void main(String[] args) {
//        InputMessageService input = new MorningMessageInput();
        InputMessageService input = new KeyboardMessageInput();
        OutputMessageService output = new GuiMessageOutput();
//        OutputMessageService output = new ConsoleMessageOutput();
        
        
        MessageService msg1 = new MessageService(input,output);
        msg1.makeMessage();
    }
}
