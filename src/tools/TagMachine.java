/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

/**
 *
 * @author max
 */
public class TagMachine
{

    private static String CANVAS_TAG = "<div style=\"background-color:b4ckgr0und;color:c0l0r;font-family:t1p3f4m1ly;font-size:f0n7s1z3;padding:p4dd1n\">C0NT3NT</div>";
    private static String TEMPLATE_TAG = "<tag style=\"color:c0l0r;font-family:t1p3f4m1ly\">C0NT3NT</tag>";
    public static String TEMPLATE_BRACE_OPEN = "\\{";
    public static String TEMPLATE_BRACE_CLOSE = "\\}";
    private static String TEMPLATE_DIV_TAG_OPEN = "{<div style=\"padding:pdnpx;background-color:c0l0r\">";
    public static String TEMPLATE_DIV_TAG_CLOSE = "</div>}";
    public static String OLD_NEW_LINE = ";";
    public static String NEW_LINE = ";<br>";
    // Constante prefijo de los comentarios.
    public static final String PREFIX_COMMENT = "c0mm3nt-";

    public TagMachine()
    {

    }

    public static String tagIt(String tag, String content, String color, String font)
    {

        String taged;
        taged = TEMPLATE_TAG;
        taged = taged.replace("tag", tag);
        taged = taged.replace("c0l0r", color);
        taged = taged.replace("t1p3f4m1ly", font);
        taged = taged.replace("C0NT3NT", content);

        return taged;
    }

    public static String tagIt(String content, String color, String backGround, String font, String fontSize, String paddin)
    {
        String taged;
        taged = CANVAS_TAG;
        taged = taged.replace("c0l0r", color);
        taged = taged.replace("t1p3f4m1ly", font);
        taged = taged.replace("b4ckgr0und", backGround);
        taged = taged.replace("p4dd1n", paddin);
        taged = taged.replace("f0n7s1z3", fontSize);
        taged = taged.replace("C0NT3NT", content);
        return taged;
    }

    public static String tagTheBrace(String color, String padding)
    {
        String taged;
        taged = TEMPLATE_DIV_TAG_OPEN;
        taged = taged.replace("c0l0r", color);
        taged = taged.replace("pdnpx", padding);

        return taged;
    }
}
