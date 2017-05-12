/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;

/**
 *
 * @author max
 */
public class ClipBoard
{

    private String text;
    private Clipboard clipboard;
    private Toolkit toolkit;

    public ClipBoard()
    {
        toolkit = Toolkit.getDefaultToolkit();
        clipboard = toolkit.getSystemClipboard();

    }

    public void textToClipboard()
    {
        StringSelection ss = new StringSelection(text);
        clipboard.setContents(ss, ss);
    }

    public void textFromClipboard()
    {
        try {
            setText((String) clipboard.getData(DataFlavor.stringFlavor));
            //System.out.println( result);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public String getText()
    {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text)
    {
        this.text = text;
        textToClipboard();
    }
}
