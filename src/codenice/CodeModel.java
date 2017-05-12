/*
 * 
*Copyright (c) 2017 Maximiliano Fernandez
*
*Por la presente se autoriza, de forma gratuita, a cualquier persona que haya obtenido una copia de este software y archivos de documentación asociados (el "Software"), a utilizar el Software sin restricción, incluyendo sin limitación los derechos de usar, copiar, modificar, fusionar, publicar, distribuir, sublicenciar, y/o vender copias de este Software, y permitir lo mismo a las personas a las que se les proporcione el Software, de acuerdo con las siguientes condiciones:
*El aviso de copyright anterior y este aviso de permiso tendrán que ser incluidos en todas las copias o partes sustanciales del Software.
*EL SOFTWARE SE ENTREGA "TAL CUAL", SIN GARANTÍA DE NINGÚN TIPO, YA SEA EXPRESA O IMPLÍCITA, INCLUYENDO, A MODO ENUNCIATIVO, CUALQUIER GARANTÍA DE COMERCIABILIDAD, IDONEIDAD PARA UN FIN PARTICULAR Y NO INFRACCIÓN. EN NINGÚN CASO LOS AUTORES O TITULARES DEL COPYRIGHT INCLUIDOS EN ESTE AVISO SERÁN RESPONSABLES DE NINGUNA rECLAMACIÓN, DAÑOS U OTRAS RESPONSABILIDADES, YA SEA EN UN LITIGIO, AGRAVIO O DE OTRO MODO, RESULTANTES DE O EN CONEXION CON EL SOFTWARE, SU USO U OTRO TIPO DE ACCIONES EN EL SOFTWARE.
 */
package codenice;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tools.TagMachine;

/**
 *
 * @author Maximiliano Fernandez - @mxml13
 */
public class CodeModel
{
    private String code;
    private Map<String , String> comments;
    private int indexMap = 0;
    private ArrayList<Integer> position=new ArrayList<>() ;
    private ArrayList<Integer> positionEnd=new ArrayList<>() ;
    public void setTextToParse (String t) {
        code = t;
        comments =new HashMap<String, String>();
    }
    // Removemos los comentarios para evitar problemas 
    public void findComments (){
        String regex = "[//\\*].*+";
         
        Pattern patron = Pattern.compile(regex);
        Matcher emparejador = patron.matcher(code);
        StringBuilder devolver = new StringBuilder();
        while (emparejador.find()) {
            
            String key = TagMachine.PREFIX_COMMENT+indexMap;
            comments.put(key, emparejador.group());
            position.add(emparejador.start());
            positionEnd.add(emparejador.end());
            
            
            indexMap++;
        }
        String tempString="";
        for (int i = comments.size()-1; i >=0 ; i--) {
            
                tempString = code.substring(0, position.get(i))+TagMachine.PREFIX_COMMENT+i+code.substring(positionEnd.get(i));
            
                code = tempString;
           
        }
         
        }
 /*
    Funcion que etiqueta los nombres de los tipos de variable 
    */
    public void tagVar (){
    
         String[] regex = {"String","int","char","float","double","long","void","boolean","Character","Integer","Boolean"};
       
        for (int i=0; i<regex.length;i++) {
            
           String newTag =  TagMachine.tagIt("span", regex[i], "#aaaaff","verdana");
            code = code.replaceAll("\\s"+regex[i]+"\\s"," "+ newTag+" ");
        }
    
    }
    /*
     Metodo que etiqueta las palabras reservadas
    */
     public void tagReserveWords (){
    
         String[] regex = {"static","public","protected","private","new","class","import","pakage","if","for","swicht","while","break","case"};
       
        for (int i=0; i<regex.length;i++) {
            
           String newTag =  TagMachine.tagIt("em", regex[i], "#aaaaff","arial");
            code = code.replaceAll("\\s"+regex[i]+"\\s"," "+ newTag+" ");
        }
    
    }
    /*
     Metodo que etiqueta las palabras reservadas
    */ 
    public void breakTheLine(){
         code = code.replaceAll(TagMachine.OLD_NEW_LINE,TagMachine.NEW_LINE);
    }
    // Y div con paddin para darle tabulacion al codigo dentro de los corchetes.
    public  void divTheBraces(){
     
        code = code.replaceAll(TagMachine.TEMPLATE_BRACE_OPEN,TagMachine.tagTheBrace("#333","1%") );
        code = code.replaceAll(TagMachine.TEMPLATE_BRACE_CLOSE, TagMachine.TEMPLATE_DIV_TAG_CLOSE);
    }
    // Volvemos a escribir los comentarios pero en tags.
    public void writeTheComments(){
         for (int i = comments.size()-1; i >=0 ; i--) {
           String tag =  TagMachine.tagIt("span",comments.get(TagMachine.PREFIX_COMMENT+i), "#aaa", "console")+"<br>";
            code = code.replace(TagMachine.PREFIX_COMMENT+i,tag );
          
    }
         }
    public  void MarcTheCode (){
     code  = TagMachine.tagIt(code, "#ddd", "#000", "arial", "12pt", "1%");
    }
    // El codigo.
    public String getCode() {
    return  code;
            }
    }
   