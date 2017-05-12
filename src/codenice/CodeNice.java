/*
 * 
*Copyright (c) 2017 Maximiliano Fernandez
*
*Por la presente se autoriza, de forma gratuita, a cualquier persona que haya obtenido una copia de este software y archivos de documentación asociados (el "Software"), a utilizar el Software sin restricción, incluyendo sin limitación los derechos de usar, copiar, modificar, fusionar, publicar, distribuir, sublicenciar, y/o vender copias de este Software, y permitir lo mismo a las personas a las que se les proporcione el Software, de acuerdo con las siguientes condiciones:
*El aviso de copyright anterior y este aviso de permiso tendrán que ser incluidos en todas las copias o partes sustanciales del Software.
*EL SOFTWARE SE ENTREGA "TAL CUAL", SIN GARANTÍA DE NINGÚN TIPO, YA SEA EXPRESA O IMPLÍCITA, INCLUYENDO, A MODO ENUNCIATIVO, CUALQUIER GARANTÍA DE COMERCIABILIDAD, IDONEIDAD PARA UN FIN PARTICULAR Y NO INFRACCIÓN. EN NINGÚN CASO LOS AUTORES O TITULARES DEL COPYRIGHT INCLUIDOS EN ESTE AVISO SERÁN RESPONSABLES DE NINGUNA rECLAMACIÓN, DAÑOS U OTRAS RESPONSABILIDADES, YA SEA EN UN LITIGIO, AGRAVIO O DE OTRO MODO, RESULTANTES DE O EN CONEXION CON EL SOFTWARE, SU USO U OTRO TIPO DE ACCIONES EN EL SOFTWARE.
 */
package codenice;

import com.sun.java.accessibility.util.AWTEventMonitor;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.DriverManager;
import javax.swing.JButton;
import javax.swing.text.DefaultEditorKit;
import tools.ClipBoard;

/**
 * CodeNIce
 *
 * Embellecedor de codigo java, mediante etiquetas html.
 *
 * Controlador principal
 *
 * @author Maximiliano Fernandez - @mxml13
 * @version 0.2
 *
 */
public class CodeNice extends MouseAdapter
{

    private static final String PAST_IT = "past it";
    private static final String DO_IT = "do it";
    private static final String CONFIG_MENU = "menu config";
    private ClipBoard clipboard;
    private CodeFrame view;
    private CodeModel model;

    public CodeNice(CodeFrame v, CodeModel m)
    {
        clipboard = new ClipBoard();
       
        view = v;
        model = m;
        // agregamos los listeners.
        v.getDoIt().setName(DO_IT);
        v.getPasteIt().setName(PAST_IT);
        v.getMenuConfig().setName(CONFIG_MENU);
        v.getDoIt().addMouseListener(this);
        v.getPasteIt().addMouseListener(this);
        v.getMenuConfig().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e)
    {

        // ClipBoard l = new ClipBoard();
        // nice.theCode().
        //System.out.println(e.getComponent().getName());
        switch (e.getComponent().getName()) {
            case DO_IT:
                String codeToNice = view.getJavaIn().getText();
                String t = view.getJavaIn().getText();
                model.setTextToParse(t);
                model.findComments();
                model.breakTheLine();
                model.tagVar();
                model.tagReserveWords();
                model.divTheBraces();
                model.writeTheComments();
                model.MarcTheCode();
                view.getJavaOut().setText(model.getCode());
                clipboard.setText(model.getCode());
                view.setStatus("El codigo se ha copiado al portapapeles !!");
                break;
          case PAST_IT:
              clipboard.textFromClipboard();
              view.getJavaIn().setText(clipboard.getText());
              break;
          case CONFIG_MENU:
              break;
        }

    }
}
