package Test;
import javax.swing.UIManager;

import View.thongTinTS;
public class Test {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            thongTinTS dangKy = new thongTinTS();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}