/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modules.penyakit;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ekowibowo
 * from here : http://download.oracle.com/javase/tutorial/uiswing/components/table.html#renderer
 */
public class GejalaPenyakitTableModel extends AbstractTableModel {

    private String[] columnNames = {"No.", "Nilai",
        "Gejala",
        "Deskripsi"};

    public GejalaPenyakitTableModel()
    {
        //TODO : load semua gejala penyakit
    }
    @Override
    public int getRowCount() {
        return 10;
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }

    @Override
    public Object getValueAt(int i, int i1) {
        //atur ambil data yang sesuai, dan atur agar bs ada checkboxnya...
        return "Bagus";
    }
}
