package lunainc.utilerias;

import lunainc.sombras.DropShadowBorder;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class BordesMaterial {

    public static final Border LIGHT_LINE_BORDER = BorderFactory.createLineBorder (ColoresMaterial.GRAY_200, 1);
    public static final Border LIGHT_SHADOW_BORDER =
            new DropShadowBorder (Color.BLACK, 0, 4, 0.3f, 12,
                    true, true, true, true);
    public static final Border DEFAULT_SHADOW_BORDER =
            new DropShadowBorder(Color.BLACK, 5, 5, 0.3f, 12,
                    true, true, true, true);

    private BordesMaterial() {}

}
