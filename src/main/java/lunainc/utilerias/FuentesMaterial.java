package lunainc.utilerias;

import java.awt.*;
import java.awt.font.TextAttribute;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class FuentesMaterial {

    private static final Map<TextAttribute, Object> fontSettings = new HashMap<TextAttribute, Object>();
    public static final Font BLACK = loadFont ("/fonts/NotoSans-Black.ttf");
    public static final Font BLACK_ITALIC = loadFont ("/fonts/NotoSans-BlackItalic.ttf");
    public static final Font BOLD = loadFont ("/fonts/NotoSans-Bold.ttf");
    public static final Font BOLD_ITALIC = loadFont ("/fonts/NotoSans-BoldItalic.ttf");
    public static final Font ITALIC = loadFont ("/fonts/NotoSans-Italic.ttf");
    public static final Font LIGHT = loadFont ("/fonts/NotoSans-Light.ttf");
    public static final Font LIGHT_ITALIC = loadFont ("/fonts/NotoSans-LightItalic.ttf");
    public static final Font MEDIUM = loadFont ("/fonts/NotoSans-Medium.ttf");
    public static final Font MEDIUM_ITALIC = loadFont ("/fonts/NotoSans-MediumItalic.ttf");
    public static final Font REGULAR = loadFont ("/fonts/NotoSans-Regular.ttf");
    public static final Font THIN = loadFont ("/fonts/NotoSans-Thin.ttf");
    public static final Font THIN_ITALIC = loadFont ("/fonts/NotoSans-ThinItalic.ttf");

    /**
     * Fix the problem with this post
     * https://stackoverflow.com/questions/5829703/java-getting-a-font-with-a-specific-height-in-pixels
     * @author https://github.com/vincenzopalazzo
     */
    private static Font loadFont (String fontPath) {
        if (fontSettings.isEmpty ()) {
            fontSettings.put (TextAttribute.SIZE, new Float( 11 * Toolkit.getDefaultToolkit().getScreenResolution() / 72.0));
            fontSettings.put (TextAttribute.KERNING, TextAttribute.KERNING_ON);
        }

        try (InputStream inputStream = FuentesMaterial.class.getResourceAsStream (fontPath)) {
            return Font.createFont (Font.TRUETYPE_FONT, inputStream).deriveFont (fontSettings);
        }
        catch (IOException | FontFormatException e) {
            e.printStackTrace ();
            throw new RuntimeException ("Font " + fontPath + " wasn't loaded");
        }
    }

}
