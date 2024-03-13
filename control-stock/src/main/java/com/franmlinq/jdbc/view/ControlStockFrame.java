package com.franmlinq.jdbc.view;

import com.franmlinq.jdbc.model.Categoria;

import javax.swing.*;

public class ControlStockFrame extends JFrame {

    private JLabel labelNombre, labelDescripcion, labelCantidad, labelCategoria;
    private JTextField textoNombre, textoDescripcion, textoCantidad;
    private JComboBox<Categoria> comboCategoria;
    private JButton btnGuardar, btnModificar, btnLimpiar, btnEliminar, btnReporte;
    private JTable tabla;
    public ControlStockFrame() {}

    private void configurarTabladeContenido() {
        tabla = new JTable();
    }
}
