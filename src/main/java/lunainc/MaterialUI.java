package lunainc;

import lunainc.componentes.button.MaterialButtonUI;
import lunainc.componentes.checkbox.MaterialCheckBoxUI;
import lunainc.componentes.checkboxmenuitem.MaterialCheckBoxMenuItemUI;
import lunainc.componentes.combobox.MaterialComboBoxUI;
import lunainc.componentes.filechooser.MaterialFileChooserUI;
import lunainc.componentes.formattertextfield.MaterialFormattedTextFieldUI;
import lunainc.componentes.label.MaterialLabelUI;
import lunainc.componentes.list.MaterialListUI;
import lunainc.componentes.menu.MaterialMenuUI;
import lunainc.componentes.menubar.MaterialMenuBarUI;
import lunainc.componentes.menuitem.MaterialMenuItemUI;
import lunainc.componentes.optionpane.MaterialOptionPaneUI;
import lunainc.componentes.panel.MaterialPanelUI;
import lunainc.componentes.password.MaterialPasswordFieldUI;
import lunainc.componentes.popupmenu.MaterialPopupMenuUI;
import lunainc.componentes.progressbar.MaterialProgressBarUI;
import lunainc.componentes.radiobutton.MaterialRadioButtonUI;
import lunainc.componentes.radiobuttonmenuitem.MaterialRadioButtonMenuItemUI;
import lunainc.componentes.scrollbar.MaterialScrollBarUI;
import lunainc.componentes.separator.MaterialSeparatorUI;
import lunainc.componentes.slider.MaterialSliderUI;
import lunainc.componentes.spinner.MaterialSpinnerUI;
import lunainc.componentes.tabbedpane.MaterialTabbedPaneUI;
import lunainc.componentes.table.MaterialTableHeaderUI;
import lunainc.componentes.table.MaterialTableUI;
import lunainc.componentes.taskpane.MaterialTaskPaneUI;
import lunainc.componentes.textfield.MaterialTextFieldUI;
import lunainc.componentes.textpane.MaterialTextPaneUI;
import lunainc.componentes.togglebutton.MaterialToggleButtonUI;
import lunainc.componentes.toolbar.MaterialToolBarUI;
import lunainc.componentes.tooltip.MaterialToolTipUI;
import lunainc.componentes.tree.MaterialTreeUI;
import lunainc.utilerias.BordesMaterial;
import lunainc.utilerias.ColoresMaterial;
import lunainc.utilerias.FuentesMaterial;
import lunainc.utilerias.ImagenesMaterial;

import javax.swing.*;
import javax.swing.plaf.basic.BasicLookAndFeel;
import javax.swing.plaf.metal.DefaultMetalTheme;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.text.DefaultEditorKit;
import java.awt.*;
import java.lang.reflect.Method;

public class MaterialUI extends MetalLookAndFeel {

    private static final String buttonUI = MaterialButtonUI.class.getCanonicalName ();
    private static final String textfieldUI = MaterialTextFieldUI.class.getCanonicalName ();
    private static final String passwordFieldUI = MaterialPasswordFieldUI.class.getCanonicalName ();
    private static final String tableUI = MaterialTableUI.class.getCanonicalName ();
    private static final String tableHeaderUI = MaterialTableHeaderUI.class.getCanonicalName ();
    private static final String treeUI = MaterialTreeUI.class.getCanonicalName ();
    private static final String spinnerUI = MaterialSpinnerUI.class.getCanonicalName ();
    private static final String panelUI = MaterialPanelUI.class.getCanonicalName ();
    private static final String labelUI = MaterialLabelUI.class.getCanonicalName ();
    private static final String menuItemUI = MaterialMenuItemUI.class.getCanonicalName ();
    private static final String menuBarUI = MaterialMenuBarUI.class.getCanonicalName ();
    private static final String menuUI = MaterialMenuUI.class.getCanonicalName ();
    private static final String checkBoxUI = MaterialCheckBoxUI.class.getCanonicalName ();
    private static final String radioButtonUI = MaterialRadioButtonUI.class.getCanonicalName ();
    private static final String tabbedPaneUI = MaterialTabbedPaneUI.class.getCanonicalName ();
    private static final String toggleButtonUI = MaterialToggleButtonUI.class.getCanonicalName ();
    private static final String scrollBarUI = MaterialScrollBarUI.class.getCanonicalName ();
    private static final String comboBoxUI = MaterialComboBoxUI.class.getCanonicalName ();
    private static final String popupMenuUI = MaterialPopupMenuUI.class.getCanonicalName ();
    private static final String toolbarUI = MaterialToolBarUI.class.getCanonicalName ();
    private static final String sliderUI = MaterialSliderUI.class.getCanonicalName ();
    private static final String progressBarUI = MaterialProgressBarUI.class.getCanonicalName ();
    private static final String radioButtonMenuItemUI = MaterialRadioButtonMenuItemUI.class.getCanonicalName ();
    private static final String checkBoxMenuItemUI = MaterialCheckBoxMenuItemUI.class.getCanonicalName ();
    private static final String textPaneUI = MaterialTextPaneUI.class.getCanonicalName ();
    private static final String editorPane = MaterialTextPaneUI.class.getCanonicalName ();
    private static final String separatorUI = MaterialSeparatorUI.class.getCanonicalName ();
    private static final String fileChooserUI = MaterialFileChooserUI.class.getCanonicalName ();
    private static final String toolTipUI = MaterialToolTipUI.class.getCanonicalName ();
    private static final String taskPaneUI = MaterialTaskPaneUI.class.getCanonicalName ();
    private static final String optionPaneUI = MaterialOptionPaneUI.class.getCanonicalName();
    private static final String formattedTextFieldUI = MaterialFormattedTextFieldUI.class.getCanonicalName();
    private static final String listUI = MaterialListUI.class.getCanonicalName();

    private BasicLookAndFeel basicLookAndFeel;

    public MaterialUI() {
        try {
            basicLookAndFeel = new MetalLookAndFeel();
            MetalLookAndFeel.setCurrentTheme(new DefaultMetalTheme());
        } catch (Exception ignore) {
            //do nothing
        }
    }

    @Override
    public String getName () {
        return "Material Look And Feel";
    }

    @Override
    public String getID () {
        return "MaterialUI";
    }

    @Override
    public String getDescription () {
        return "A modern Material Design UI for Java Swing";
    }

    @Override
    public boolean isNativeLookAndFeel () {
        return false;
    }

    @Override
    public boolean isSupportedLookAndFeel () {
        return true;
    }

    @Override
    protected void initClassDefaults (UIDefaults table) {
        super.initClassDefaults (table);
        table.put ("ButtonUI", buttonUI);
        table.put ("TextFieldUI", textfieldUI);
        table.put ("PasswordFieldUI", passwordFieldUI);
        table.put ("TableUI", tableUI);
        table.put ("TableHeaderUI", tableHeaderUI);
        table.put ("TreeUI", treeUI);
        table.put ("SpinnerUI", spinnerUI);
        table.put ("PanelUI", panelUI);
        table.put ("LabelUI", labelUI);
        table.put ("MenuItemUI", menuItemUI);
        table.put ("MenuBarUI", menuBarUI);
        table.put ("MenuUI", menuUI);
        table.put ("CheckBoxUI", checkBoxUI);
        table.put ("RadioButtonUI", radioButtonUI);
        table.put ("TabbedPaneUI", tabbedPaneUI);
        table.put ("ToggleButtonUI", toggleButtonUI);
        table.put ("ScrollBarUI", scrollBarUI);
        table.put ("ComboBoxUI", comboBoxUI);
        table.put ("PopupMenuUI", popupMenuUI);
        table.put ("ToolBarUI", toolbarUI);
        table.put ("SliderUI", sliderUI);
        table.put ("ProgressBarUI", progressBarUI);
        table.put ("RadioButtonMenuItemUI", radioButtonMenuItemUI);
        table.put ("CheckBoxMenuItemUI", checkBoxMenuItemUI);
        table.put ("TextPaneUI", textPaneUI);
        table.put ("EditorPaneUI", editorPane);
        table.put ("SeparatorUI", separatorUI);
        table.put ("FileChooserUI", fileChooserUI);
        table.put ("ToolTipUI", toolTipUI);
        table.put("OptionPaneUI", optionPaneUI);
        table.put("FormattedTextFieldUI", formattedTextFieldUI);
        table.put("ListUI", listUI);

        table.put ("swingx/TaskPaneUI", taskPaneUI);
    }

    @Override
    protected void initComponentDefaults (UIDefaults table) {
        super.initComponentDefaults (table);

        table.put("Button.highlight", ColoresMaterial.GRAY_200);
        table.put("Button.opaque", true);
        table.put("Button.border", BorderFactory.createEmptyBorder (7, 17, 7, 17));
        table.put("Button.background", ColoresMaterial.GRAY_200);
        table.put("Button.foreground", Color.BLACK);
        table.put("Button.font", FuentesMaterial.MEDIUM);
        table.put("Button.mouseHoverColor", ColoresMaterial.GRAY_400);
        table.put("Button.mouseHoverEnable", true);
        table.put("Button.focusable", false);
        table.put("Button[focus].color", ColoresMaterial.GRAY_900);
        table.put("Button.disabledText", ColoresMaterial.GRAY_700);

        table.put("CheckBox.font", FuentesMaterial.REGULAR);
        table.put("CheckBox.background", Color.WHITE);
        table.put("CheckBox.foreground", Color.BLACK);
        table.put("CheckBox.icon", new ImageIcon (ImagenesMaterial.UNCHECKED_BOX));
        table.put("CheckBox.selectedIcon", new ImageIcon (ImagenesMaterial.PAINTED_CHECKED_BOX));

        table.put("ComboBox.font", FuentesMaterial.REGULAR);
        table.put("ComboBox.background", Color.WHITE);
        table.put("ComboBox.foreground", Color.BLACK);
        table.put("ComboBox.border", BorderFactory.createCompoundBorder (BordesMaterial.LIGHT_LINE_BORDER, BorderFactory.createEmptyBorder (0, 5, 0, 0)));
        table.put("ComboBox.buttonBackground", ColoresMaterial.GRAY_300);
        table.put("ComboBox.selectionBackground", ColoresMaterial.GRAY_300);
        table.put("ComboBox.disabledBackground", ColoresMaterial.GRAY_500);
        table.put("ComboBox.disabledForeground", ColoresMaterial.GRAY_900);
        table.put("ComboBox.selectionForeground", ColoresMaterial.BLACK);
        table.put("ComboBox.selectedInDropDownBackground", ColoresMaterial.GRAY_200);
        table.put("ComboBox.mouseHoverColor", ColoresMaterial.GRAY_400);
        table.put("ComboBox.mouseHoverEnabled", true);

        table.put("Label.font", FuentesMaterial.REGULAR);
        table.put("Label.background", Color.WHITE);
        table.put("Label.foreground", Color.BLACK);
        table.put("Label.border", BorderFactory.createEmptyBorder ());

        table.put("Menu.font", FuentesMaterial.BOLD);
        table.put("Menu.border", BorderFactory.createEmptyBorder (5, 5, 5, 5));
        table.put("Menu.background", Color.WHITE);
        table.put("Menu.foreground", Color.BLACK);
        table.put("Menu.opaque", true);
        table.put("Menu.selectionBackground", ColoresMaterial.GRAY_200);
        table.put("Menu.selectionForeground", Color.BLACK);
        table.put("Menu.disabledForeground", new Color (0, 0, 0, 100));
        table.put("Menu.menuPopupOffsetY", 3);
        table.put("Menu[MouseOver].enable", true); //TODO testing
        //TODO refactoinh and using the convensioni Component[Action].ohYeah

        table.put("MenuBar.font", FuentesMaterial.BOLD);
        table.put("MenuBar.background", Color.WHITE);
        table.put("MenuBar.border", BordesMaterial.LIGHT_SHADOW_BORDER);
        table.put("MenuBar.foreground", Color.BLACK);

        table.put("MenuItem.disabledForeground", new Color (0, 0, 0, 100));
        table.put("MenuItem.selectionBackground", ColoresMaterial.GRAY_200);
        table.put("MenuItem.selectionForeground", Color.BLACK);
        table.put("MenuItem.font", FuentesMaterial.MEDIUM);
        table.put("MenuItem.background", Color.WHITE);
        table.put("MenuItem.foreground", Color.BLACK);
        table.put("MenuItem.border", BorderFactory.createEmptyBorder (5, 0, 5, 0));

        table.put("OptionPane.background", Color.WHITE);
        table.put("OptionPane.border", BordesMaterial.DEFAULT_SHADOW_BORDER);
        table.put("OptionPane.font", FuentesMaterial.REGULAR);

        table.put("Panel.font", FuentesMaterial.REGULAR);
        table.put("Panel.background", Color.WHITE);
        table.put("Panel.border", BorderFactory.createEmptyBorder ());

        table.put("PopupMenu.border", BordesMaterial.LIGHT_LINE_BORDER);
        table.put("PopupMenu.background", Color.WHITE);
        table.put("PopupMenu.foreground", Color.BLACK);

        table.put("RadioButton.font", FuentesMaterial.REGULAR);
        table.put("RadioButton.background", Color.WHITE);
        table.put("RadioButton.foreground", Color.BLACK);
        table.put("RadioButton.icon", new ImageIcon (ImagenesMaterial.RADIO_BUTTON_OFF));
        table.put("RadioButton.selectedIcon", new ImageIcon (ImagenesMaterial.RADIO_BUTTON_ON));

        table.put("Spinner.font", FuentesMaterial.REGULAR);
        table.put("Spinner.background", Color.WHITE);
        table.put("Spinner.foreground", Color.BLACK);
        table.put("Spinner.border", BordesMaterial.LIGHT_LINE_BORDER);
        table.put("Spinner.arrowButtonBackground", ColoresMaterial.GRAY_200);
        table.put("Spinner.arrowButtonBorder", BorderFactory.createEmptyBorder ());
        table.put("Spinner.mouseHoverEnabled", true);
        table.put("Spinner.mouseHoverColor", ColoresMaterial.GRAY_400);

        table.put("ScrollBar.font", FuentesMaterial.REGULAR);
        table.put("ScrollBar.track", ColoresMaterial.GRAY_200);
        table.put("ScrollBar.thumb", ColoresMaterial.GRAY_500);
        table.put("ScrollBar.thumbDarkShadow", ColoresMaterial.GRAY_500);
        table.put("ScrollBar.thumbHighlight", ColoresMaterial.GRAY_500);
        table.put("ScrollBar.thumbShadow", ColoresMaterial.GRAY_500);
        table.put("ScrollBar.arrowButtonBackground", ColoresMaterial.GRAY_200);
        table.put("ScrollBar.enableArrow", true);
        table.put("ScrollBar.arrowButtonBorder", BorderFactory.createEmptyBorder());
        table.put("ScrollBar[MouseHover].enable", true);
        table.put("ScrollBar[MouseHover].color", ColoresMaterial.GRAY_400);
        table.put("ScrollBar[OnClick].color", ColoresMaterial.GRAY_500);

        table.put("ScrollPane.background", Color.WHITE);
        table.put("ScrollPane.border", BorderFactory.createEmptyBorder ());
        table.put("ScrollPane.font", FuentesMaterial.REGULAR);

        table.put("Slider.font", FuentesMaterial.REGULAR);
        table.put("Slider.background", Color.WHITE);
        table.put("Slider.foreground", ColoresMaterial.LIGHT_BLUE_400);
        table.put("Slider.trackColor", Color.BLACK);
        table.put("Slider.border", BorderFactory.createCompoundBorder (BordesMaterial.LIGHT_LINE_BORDER, BorderFactory.createEmptyBorder (20, 20, 20, 20)));

        table.put("SplitPane.border", BorderFactory.createEmptyBorder ());
        table.put("SplitPane.background", Color.WHITE);
        table.put("SplitPane.dividerSize", 5);
        table.put("SplitPaneDivider.border", BorderFactory.createEmptyBorder ());

        table.put("TabbedPane.font", FuentesMaterial.REGULAR);
        table.put("TabbedPane.background", Color.WHITE);
        table.put("TabbedPane.foreground", Color.BLACK);
        table.put("TabbedPane.border", BorderFactory.createEmptyBorder ());
        table.put("TabbedPane.shadow", null);
        table.put("TabbedPane.darkShadow", null);
        table.put("TabbedPane.highlight", ColoresMaterial.GRAY_200);
        table.put("TabbedPane.borderHighlightColor", ColoresMaterial.GRAY_300);

        table.put("Table.selectionBackground", ColoresMaterial.GRAY_100);
        table.put("Table.selectionForeground", Color.BLACK);
        table.put("Table.background", Color.WHITE);
        table.put("Table.font", FuentesMaterial.REGULAR);
        table.put("Table.border", BordesMaterial.LIGHT_LINE_BORDER);
        table.put("Table.gridColor", ColoresMaterial.GRAY_200);
        table.put("TableHeader.background", ColoresMaterial.GRAY_200);
        table.put("TableHeader.font", FuentesMaterial.BOLD);
        table.put("TableHeader.cellBorder", BorderFactory.createCompoundBorder (BordesMaterial.LIGHT_LINE_BORDER, BorderFactory.createEmptyBorder (5, 5, 5, 5)));

        table.put("TextArea.background", ColoresMaterial.GRAY_200);
        table.put("TextArea.border", BorderFactory.createEmptyBorder ());
        table.put("TextArea.foreground", Color.BLACK);

        table.put("TextField.inactiveForeground", ColoresMaterial.GRAY_800);
        table.put("TextField.inactiveBackground", ColoresMaterial.GRAY_200);
        table.put("TextField.selectionBackground", ColoresMaterial.LIGHT_BLUE_400);
        table.put("TextField.selectionForeground", ColoresMaterial.BLACK);
        table.put("TextField.border", BorderFactory.createEmptyBorder(3, 5, 2, 5));
        table.put("TextField.focusInputMap", fieldInputMap); //install shortcut

        table.put("PasswordField.inactiveForeground", ColoresMaterial.GRAY_800);
        table.put("PasswordField.inactiveBackground", ColoresMaterial.GRAY_200);
        table.put("PasswordField.selectionBackground", ColoresMaterial.LIGHT_BLUE_400);
        table.put("PasswordField.selectionForeground", ColoresMaterial.BLACK);
        table.put("PasswordField.border", BorderFactory.createEmptyBorder(3, 5, 2, 5));
        table.put("PasswordField.focusInputMap", fieldInputMap); //install shortcut

        table.put("ToggleButton.border", BorderFactory.createEmptyBorder ());
        table.put("ToggleButton.font", FuentesMaterial.REGULAR);
        table.put("ToggleButton.background", Color.WHITE);
        table.put("ToggleButton.foreground", Color.BLACK);
        table.put("ToggleButton.icon", new ImageIcon (ImagenesMaterial.TOGGLE_BUTTON_OFF));
        table.put("ToggleButton.selectedIcon", new ImageIcon (ImagenesMaterial.TOGGLE_BUTTON_ON));

        table.put("ToolBar.font", FuentesMaterial.REGULAR);
        table.put("ToolBar.background", Color.WHITE);
        table.put("ToolBar.foreground", Color.BLACK);
        table.put("ToolBar.border", BordesMaterial.LIGHT_SHADOW_BORDER);
        table.put("ToolBar.dockingBackground", ColoresMaterial.LIGHT_GREEN_A100);
        table.put("ToolBar.floatingBackground", ColoresMaterial.GRAY_200);

        table.put("Tree.font", FuentesMaterial.REGULAR);
        table.put("Tree.selectionForeground", Color.BLACK);
        table.put("Tree.foreground", Color.BLACK);
        table.put("Tree.selectionBackground", ColoresMaterial.GRAY_200);
        table.put("Tree.background", Color.WHITE);
        table.put("Tree.closedIcon", new ImageIcon (ImagenesMaterial.RIGHT_ARROW));
        table.put("Tree.openIcon", new ImageIcon (ImagenesMaterial.DOWN_ARROW));
        table.put("Tree.selectionBorderColor", null);

        table.put("RadioButtonMenuItem.foreground", Color.BLACK);
        table.put("RadioButtonMenuItem.selectionForeground", Color.BLACK);
        //If it changes the background of the menuitem it must change this too, irrespective of its setting
        table.put("RadioButtonMenuItem.background", UIManager.getColor ("MenuItem.background"));
        table.put("RadioButtonMenuItem.selectionBackground", ColoresMaterial.GRAY_200);
        table.put("RadioButtonMenuItem.border", BorderFactory.createEmptyBorder (5, 0, 5, 0));
        table.put("RadioButtonMenuItem.checkIcon", new ImageIcon (ImagenesMaterial.RADIO_BUTTON_OFF));
        table.put("RadioButtonMenuItem.selectedCheckIcon", new ImageIcon (ImagenesMaterial.RADIO_BUTTON_ON));

        //If it changes the background of the menuitem it must change this too, irrespective of its setting
        table.put ("CheckBoxMenuItem.background", UIManager.getColor ("MenuItem.background"));
        table.put ("CheckBoxMenuItem.selectionBackground", ColoresMaterial.GRAY_200);
        table.put ("CheckBoxMenuItem.foreground", Color.BLACK);
        table.put ("CheckBoxMenuItem.selectionForeground", Color.BLACK);
        table.put ("CheckBoxMenuItem.border", BorderFactory.createEmptyBorder(5, 0, 5, 0));
        table.put ("CheckBoxMenuItem.checkIcon", new ImageIcon (ImagenesMaterial.UNCHECKED_BOX));
        table.put ("CheckBoxMenuItem.selectedCheckIcon", new ImageIcon (ImagenesMaterial.PAINTED_CHECKED_BOX));

        table.put ("TextPane.border", BordesMaterial.LIGHT_LINE_BORDER);
        table.put ("TextPane.background", ColoresMaterial.GRAY_50);
        table.put ("TextPane.selectionBackground", ColoresMaterial.LIGHT_BLUE_200);
        table.put ("TextPane.inactiveForeground", ColoresMaterial.GRAY_500);
        table.put ("TextPane.font", FuentesMaterial.REGULAR);

        table.put ("EditorPane.border", BordesMaterial.LIGHT_LINE_BORDER);
        table.put ("EditorPane.background", ColoresMaterial.GRAY_50);
        table.put ("EditorPane.selectionBackground", ColoresMaterial.LIGHT_BLUE_200);
        table.put ("EditorPane.inactiveForeground", ColoresMaterial.GRAY_500);
        table.put ("EditorPane.font", FuentesMaterial.REGULAR);

        table.put ("Separator.background", ColoresMaterial.GRAY_300);
        table.put ("Separator.foreground", ColoresMaterial.GRAY_300);

        table.put ("ToolTip.background", ColoresMaterial.GRAY_500);
        table.put ("ToolTip.foreground", ColoresMaterial.GRAY_50);
        table.put ("ToolTip.border", BorderFactory.createEmptyBorder (5, 5, 5, 5));

        table.put ("ColorChooser.background ", ColoresMaterial.WHITE);
        table.put ("ColorChooser.foreground ", ColoresMaterial.BLACK);

        table.put ("TitledBorder.font", FuentesMaterial.REGULAR);

        table.put("TaskPane.font", FuentesMaterial.MEDIUM);
        table.put("TaskPane.titleBackgroundGradientStart", ColoresMaterial.GRAY_300);
        table.put("TaskPane.titleBackgroundGradientEnd", ColoresMaterial.GRAY_500);
        table.put("TaskPane.titleOver", ColoresMaterial.LIGHT_BLUE_500);
        table.put("TaskPane.specialTitleOver", ColoresMaterial.LIGHT_BLUE_500);
        table.put("TaskPane.background", ColoresMaterial.LIGHT_BLUE_500);
        table.put("TaskPane.foreground", ColoresMaterial.BLACK);
        table.put("TaskPane.borderColor", ColoresMaterial.LIGHT_BLUE_500);
        table.put("TaskPane.border", BordesMaterial.DEFAULT_SHADOW_BORDER);
        table.put("TaskPane.contentBackground", ColoresMaterial.GRAY_50);
        table.put("TaskPane.yesCollassed", new ImageIcon(ImagenesMaterial.YES_COLLASSED));
        table.put("TaskPane.noCollassed", new ImageIcon(ImagenesMaterial.NO_COLLASSED));

        table.put("OptionPaneUI.warningIcon", new ImageIcon(ImagenesMaterial.WARNING));
        table.put("OptionPaneUI.errorIcon", new ImageIcon(ImagenesMaterial.ERROR));
        table.put("OptionPaneUI.questionIcon", new ImageIcon(ImagenesMaterial.QUESTION));
        table.put("OptionPaneUI.informationIcon", new ImageIcon(ImagenesMaterial.INFORMATION));

        table.put ("FormattedTextField.inactiveForeground", ColoresMaterial.GRAY_800);
        table.put ("FormattedTextField.inactiveBackground", ColoresMaterial.GRAY_200);
        table.put ("FormattedTextField.selectionBackground", ColoresMaterial.LIGHT_BLUE_400);
        table.put ("FormattedTextField.selectionForeground", Color.BLACK);
        table.put("FormattedTextField.border", BorderFactory.createEmptyBorder(3, 5, 2, 5));

        table.put("List.background", ColoresMaterial.WHITE);
        table.put("List.foreground", ColoresMaterial.BLACK);
        table.put("List.border", BordesMaterial.LIGHT_SHADOW_BORDER);
        table.put("List.font", FuentesMaterial.MEDIUM);
        table.put("List.selectionBackground", ColoresMaterial.GRAY_400);
        table.put("List.selectionForeground", ColoresMaterial.BLACK);
        table.put("List.focusable", true);
    }

    @Override
    public UIDefaults getDefaults() {
        try {
            final Method superMethod = BasicLookAndFeel.class.getDeclaredMethod("getDefaults");
            superMethod.setAccessible(true);
            final UIDefaults defaults = (UIDefaults)superMethod.invoke(basicLookAndFeel);
            initClassDefaults(defaults);
            initComponentDefaults(defaults);
            defaults.put("OptionPane.warningIcon", new ImageIcon(ImagenesMaterial.WARNING));
            defaults.put("OptionPane.errorIcon", new ImageIcon(ImagenesMaterial.ERROR));
            defaults.put("OptionPane.questionIcon", new ImageIcon(ImagenesMaterial.QUESTION));
            defaults.put("OptionPane.informationIcon", new ImageIcon(ImagenesMaterial.INFORMATION));
            return defaults;
        }
        catch (Exception ignore) {
        }
        return super.getDefaults();
    }

    /*Shortcut for filed input*/
    Object fieldInputMap = new UIDefaults.LazyInputMap(new Object[]{
            "ctrl C", DefaultEditorKit.copyAction,
            "ctrl V", DefaultEditorKit.pasteAction,
            "ctrl X", DefaultEditorKit.cutAction,
            "COPY", DefaultEditorKit.copyAction,
            "PASTE", DefaultEditorKit.pasteAction,
            "CUT", DefaultEditorKit.cutAction,
            "control INSERT", DefaultEditorKit.copyAction,
            "shift INSERT", DefaultEditorKit.pasteAction,
            "shift DELETE", DefaultEditorKit.cutAction,
            "shift LEFT", DefaultEditorKit.selectionBackwardAction,
            "shift KP_LEFT", DefaultEditorKit.selectionBackwardAction,
            "shift RIGHT", DefaultEditorKit.selectionForwardAction,
            "shift KP_RIGHT", DefaultEditorKit.selectionForwardAction,
            "ctrl LEFT", DefaultEditorKit.previousWordAction,
            "ctrl KP_LEFT", DefaultEditorKit.previousWordAction,
            "ctrl RIGHT", DefaultEditorKit.nextWordAction,
            "ctrl KP_RIGHT", DefaultEditorKit.nextWordAction,
            "ctrl shift LEFT", DefaultEditorKit.selectionPreviousWordAction,
            "ctrl shift KP_LEFT", DefaultEditorKit.selectionPreviousWordAction,
            "ctrl shift RIGHT", DefaultEditorKit.selectionNextWordAction,
            "ctrl shift KP_RIGHT", DefaultEditorKit.selectionNextWordAction,
            "ctrl A", DefaultEditorKit.selectAllAction,
            "HOME", DefaultEditorKit.beginLineAction,
            "END", DefaultEditorKit.endLineAction,
            "shift HOME", DefaultEditorKit.selectionBeginLineAction,
            "shift END", DefaultEditorKit.selectionEndLineAction,
            "BACK_SPACE", DefaultEditorKit.deletePrevCharAction,
            "shift BACK_SPACE", DefaultEditorKit.deletePrevCharAction,
            "ctrl H", DefaultEditorKit.deletePrevCharAction,
            "DELETE", DefaultEditorKit.deleteNextCharAction,
            "ctrl DELETE", DefaultEditorKit.deleteNextWordAction,
            "ctrl BACK_SPACE", DefaultEditorKit.deletePrevWordAction,
            "RIGHT", DefaultEditorKit.forwardAction,
            "LEFT", DefaultEditorKit.backwardAction,
            "KP_RIGHT", DefaultEditorKit.forwardAction,
            "KP_LEFT", DefaultEditorKit.backwardAction,
            "ENTER", JTextField.notifyAction,
            "ctrl BACK_SLASH", "unselect"/*DefaultEditorKit.unselectAction*/,
            "control shift O", "toggle-componentOrientation"/*DefaultEditorKit.toggleComponentOrientation*/
    });


    /*Shortcut for multiline input*/
    Object multilineInputMap = new UIDefaults.LazyInputMap(new Object[]{
            "ctrl C", DefaultEditorKit.copyAction,
            "ctrl V", DefaultEditorKit.pasteAction,
            "ctrl X", DefaultEditorKit.cutAction,
            "COPY", DefaultEditorKit.copyAction,
            "PASTE", DefaultEditorKit.pasteAction,
            "CUT", DefaultEditorKit.cutAction,
            "control INSERT", DefaultEditorKit.copyAction,
            "shift INSERT", DefaultEditorKit.pasteAction,
            "shift DELETE", DefaultEditorKit.cutAction,
            "shift LEFT", DefaultEditorKit.selectionBackwardAction,
            "shift KP_LEFT", DefaultEditorKit.selectionBackwardAction,
            "shift RIGHT", DefaultEditorKit.selectionForwardAction,
            "shift KP_RIGHT", DefaultEditorKit.selectionForwardAction,
            "ctrl LEFT", DefaultEditorKit.previousWordAction,
            "ctrl KP_LEFT", DefaultEditorKit.previousWordAction,
            "ctrl RIGHT", DefaultEditorKit.nextWordAction,
            "ctrl KP_RIGHT", DefaultEditorKit.nextWordAction,
            "ctrl shift LEFT", DefaultEditorKit.selectionPreviousWordAction,
            "ctrl shift KP_LEFT", DefaultEditorKit.selectionPreviousWordAction,
            "ctrl shift RIGHT", DefaultEditorKit.selectionNextWordAction,
            "ctrl shift KP_RIGHT", DefaultEditorKit.selectionNextWordAction,
            "ctrl A", DefaultEditorKit.selectAllAction,
            "HOME", DefaultEditorKit.beginLineAction,
            "END", DefaultEditorKit.endLineAction,
            "shift HOME", DefaultEditorKit.selectionBeginLineAction,
            "shift END", DefaultEditorKit.selectionEndLineAction,

            "UP", DefaultEditorKit.upAction,
            "KP_UP", DefaultEditorKit.upAction,
            "DOWN", DefaultEditorKit.downAction,
            "KP_DOWN", DefaultEditorKit.downAction,
            "PAGE_UP", DefaultEditorKit.pageUpAction,
            "PAGE_DOWN", DefaultEditorKit.pageDownAction,
            "shift PAGE_UP", "selection-page-up",
            "shift PAGE_DOWN", "selection-page-down",
            "ctrl shift PAGE_UP", "selection-page-left",
            "ctrl shift PAGE_DOWN", "selection-page-right",
            "shift UP", DefaultEditorKit.selectionUpAction,
            "shift KP_UP", DefaultEditorKit.selectionUpAction,
            "shift DOWN", DefaultEditorKit.selectionDownAction,
            "shift KP_DOWN", DefaultEditorKit.selectionDownAction,
            "ENTER", DefaultEditorKit.insertBreakAction,
            "BACK_SPACE", DefaultEditorKit.deletePrevCharAction,
            "shift BACK_SPACE", DefaultEditorKit.deletePrevCharAction,
            "ctrl H", DefaultEditorKit.deletePrevCharAction,
            "DELETE", DefaultEditorKit.deleteNextCharAction,
            "ctrl DELETE", DefaultEditorKit.deleteNextWordAction,
            "ctrl BACK_SPACE", DefaultEditorKit.deletePrevWordAction,
            "RIGHT", DefaultEditorKit.forwardAction,
            "LEFT", DefaultEditorKit.backwardAction,
            "KP_RIGHT", DefaultEditorKit.forwardAction,
            "KP_LEFT", DefaultEditorKit.backwardAction,
            "TAB", DefaultEditorKit.insertTabAction,
            "ctrl BACK_SLASH", "unselect"/*DefaultEditorKit.unselectAction*/,
            "ctrl HOME", DefaultEditorKit.beginAction,
            "ctrl END", DefaultEditorKit.endAction,
            "ctrl shift HOME", DefaultEditorKit.selectionBeginAction,
            "ctrl shift END", DefaultEditorKit.selectionEndAction,
            "ctrl T", "next-link-action",
            "ctrl shift T", "previous-link-action",
            "ctrl SPACE", "activate-link-action",
            "control shift O", "toggle-componentOrientation"/*DefaultEditorKit.toggleComponentOrientation*/
    });
}
