/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codenice;

import frames.ConfigurationFrame;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

/**
 *
 * @author max
 */
public class MenuActionController extends AbstractAction 
{
      ConfigurationFrame confFrame;
      
    public  MenuActionController(){
        super("Configuration Seting");
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        e.getActionCommand();
        switch(e.getActionCommand()){
            
            case CodeNice.CONFIG_MENU:
                confFrame = new ConfigurationFrame();
                CodeNice.closeFrame();
              
                 confFrame.setVisible(true);
                    confFrame.getCloseButton().addActionListener(this);
            break;
            case CodeNice.CLOSE_MENU:
                confFrame.setVisible(false);
                CodeNice.openFrame();
        
        }
        System.out.println(e.getActionCommand());
        
    }
}
