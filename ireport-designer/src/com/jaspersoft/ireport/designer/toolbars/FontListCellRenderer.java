/*
 * iReport - Visual Designer for JasperReports.
 * Copyright (C) 2002 - 2013 Jaspersoft Corporation. All rights reserved.
 * http://www.jaspersoft.com
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft,
 * the following license terms apply:
 * 
 * This program is part of iReport.
 * 
 * iReport is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * iReport is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with iReport. If not, see <http://www.gnu.org/licenses/>.
 */

/*
 * FontListCellPanel.java
 *
 * Created on 23-ott-2009, 12.16.29
 */

package com.jaspersoft.ireport.designer.toolbars;

import com.jaspersoft.ireport.designer.IReportManager;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JSeparator;
import javax.swing.ListCellRenderer;
import javax.swing.UIManager;
import net.sf.jasperreports.engine.fonts.FontInfo;
import net.sf.jasperreports.engine.util.JRFontUtil;

/**
 *
 * @author gtoffoli
 */
public class FontListCellRenderer extends javax.swing.JPanel implements ListCellRenderer {

    /** Creates new form FontListCellPanel */
    public FontListCellRenderer() {
        initComponents();
    }

    public void setFontInfo(String name, Font font)
    {

        jLabelSample.setFont(font);
        if (font == null || name.length() == 0)
        {
            jLabelSample.setText(" ");
        }
        else
        {
            jLabelSample.setText("Sample");
        }

        jLabelFontName.setText(name);
    }

    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {


        if (value != null)
        {

            if ((value+"").equals("--"))
            {
                JSeparator separator = new JSeparator();
                Dimension size = new Dimension(1,14);
                separator.setPreferredSize(size);
                return separator;
            }

            ClassLoader cl = Thread.currentThread().getContextClassLoader();
            try {

                Thread.currentThread().setContextClassLoader(IReportManager.getJRExtensionsClassLoader());

                Font f = JRFontUtil.getAwtFontFromBundles(""+value, Font.PLAIN, 12, null, true);
                if (f == null)
                {
                    f = new Font("" + value, Font.PLAIN, 12);
                }
                setFontInfo(""+value, f);

            } finally
            {
                Thread.currentThread().setContextClassLoader(cl);
            }
        }

        if (!isSelected)
        {
            Color c = UIManager.getColor("List.background");
            if (c != null) this.setBackground(c);
            c = UIManager.getColor("List.foreground");
            if (c != null)
            {
                jLabelFontName.setForeground(c);
                jLabelSample.setForeground(c);
            }
        }
        else
        {
            Color c = UIManager.getColor("List.selectionBackground");
            if (c != null) this.setBackground(c);
            c = UIManager.getColor("List.selectionForeground");
            if (c != null)
            {
                jLabelFontName.setForeground(c);
                jLabelSample.setForeground(c);
            }
        }
        
        return this;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabelFontName = new javax.swing.JLabel();
        jLabelSample = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        jLabelFontName.setText(org.openide.util.NbBundle.getMessage(FontListCellRenderer.class, "FontListCellRenderer.jLabelFontName.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 0, 0);
        add(jLabelFontName, gridBagConstraints);

        jLabelSample.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelSample.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelSample.setText(org.openide.util.NbBundle.getMessage(FontListCellRenderer.class, "FontListCellRenderer.jLabelSample.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 4);
        add(jLabelSample, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelFontName;
    private javax.swing.JLabel jLabelSample;
    // End of variables declaration//GEN-END:variables

}
