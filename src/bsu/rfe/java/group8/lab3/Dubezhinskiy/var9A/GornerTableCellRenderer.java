package bsu.rfe.java.group8.lab3.Dubezhinskiy.var9A;


import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

public class GornerTableCellRenderer implements TableCellRenderer {
    private JPanel panel = new JPanel();
    private JLabel label = new JLabel();
    //ищем ячейки, строковое представление совпадает с needle(иголкой)
    private String needle = null;
    private DecimalFormat formatter = (DecimalFormat) NumberFormat.getInstance();

    public GornerTableCellRenderer() {
        //Показать только 5 знаков после запятой
        formatter.setMaximumFractionDigits(5);
        formatter.setGroupingUsed(false);
        //установить в качестве разделителя дробной части точку
        DecimalFormatSymbols dottedDouble = formatter.getDecimalFormatSymbols();
        dottedDouble.setDecimalSeparator('.');
        formatter.setDecimalFormatSymbols(dottedDouble);
        //разместить надпись внутри панели
        panel.add(label);
        //установить выравнивание надписи по левому краю
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
    }
}
