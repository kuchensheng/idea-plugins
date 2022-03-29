package com.isyscore.plugins.ark.com.isyscore.plugins.ui;

import javax.swing.*;
import java.io.File;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author 酷达舒（kucs@isyscore.com）
 * @since 2022/3/29 17:03 星期二
 */
public class SettingUI {
    private JPanel panel1;
    private JPanel mainPanel;
    private JPanel settingPanel;
    private JLabel urlLabel;
    private JTextField urlTextField;
    private JButton urlBtn;

    public SettingUI() {

        urlBtn.addActionListener(e ->{
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            fileChooser.showOpenDialog(settingPanel);
            File file = fileChooser.getSelectedFile();
            urlTextField.setText(file.getPath());
        });
    }

    public JComponent getComponent() {
        return mainPanel;
    }
    public JTextField getUrlTextField() {
        return urlTextField;
    }
}
