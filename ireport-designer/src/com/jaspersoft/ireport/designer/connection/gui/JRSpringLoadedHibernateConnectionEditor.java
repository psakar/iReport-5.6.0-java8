/*
 * iReport - Visual Designer for JasperReports.
 * Copyright (C) 2002 - 2009 Jaspersoft Corporation. All rights reserved.
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
package com.jaspersoft.ireport.designer.connection.gui;

import com.jaspersoft.ireport.locale.I18n;
import com.jaspersoft.ireport.designer.IReportConnection;
import com.jaspersoft.ireport.designer.IReportConnectionEditor;
import com.jaspersoft.ireport.designer.connection.JRSpringLoadedHibernateConnection;

/**
 *
 * @author  gtoffoli
 */
public class JRSpringLoadedHibernateConnectionEditor extends javax.swing.JPanel implements IReportConnectionEditor {
    
    private IReportConnection iReportConnection = null;
    private boolean init = false;
    
    /** Creates new form EJBQLConnectionEditor */
    public JRSpringLoadedHibernateConnectionEditor() {
        initComponents();
        //applyI18n();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanelSpringLoadedHibernate = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jTextFieldSLHSpringConfig = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextFieldSLHSessionFactory = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanelSpringLoadedHibernate.setLayout(new java.awt.GridBagLayout());

        jLabel21.setText(I18n.getString("JRSpringLoadedHibernateConnectionEditor.Label.Config")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 0, 4);
        jPanelSpringLoadedHibernate.add(jLabel21, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(2, 4, 4, 4);
        jPanelSpringLoadedHibernate.add(jTextFieldSLHSpringConfig, gridBagConstraints);

        jLabel22.setText(I18n.getString("JRSpringLoadedHibernateConnectionEditor.Label.BeanID")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 0, 4);
        jPanelSpringLoadedHibernate.add(jLabel22, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(2, 4, 4, 4);
        jPanelSpringLoadedHibernate.add(jTextFieldSLHSessionFactory, gridBagConstraints);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jaspersoft/ireport/designer/connection/gui/hibernate.png"))); // NOI18N
        jLabel16.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanelSpringLoadedHibernate.add(jLabel16, gridBagConstraints);

        add(jPanelSpringLoadedHibernate, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanelSpringLoadedHibernate;
    private javax.swing.JTextField jTextFieldSLHSessionFactory;
    private javax.swing.JTextField jTextFieldSLHSpringConfig;
    // End of variables declaration//GEN-END:variables
    
    
    public void setIReportConnection(IReportConnection c) {
        
        this.iReportConnection = c;
        if (iReportConnection instanceof JRSpringLoadedHibernateConnection)
        {
            this.jTextFieldSLHSpringConfig.setText( ((JRSpringLoadedHibernateConnection)iReportConnection).getSpringConfig() );
            this.jTextFieldSLHSessionFactory.setText( ((JRSpringLoadedHibernateConnection)iReportConnection).getSessionFactoryBeanId() );
        }
    }

    public IReportConnection getIReportConnection() {
        
        IReportConnection irConn = new JRSpringLoadedHibernateConnection();
        ((JRSpringLoadedHibernateConnection)irConn).setSessionFactoryBeanId(jTextFieldSLHSessionFactory.getText());
        ((JRSpringLoadedHibernateConnection)irConn).setSpringConfig(jTextFieldSLHSpringConfig.getText());

        iReportConnection = irConn;
        return iReportConnection;
    }
    
    /*
    public void applyI18n(){

                jLabel21.setText(I18n.getString("connectionDialog.label21","Spring configuration"));
                jLabel22.setText(I18n.getString("connectionDialog.label22","Session Factory Bean ID"));
                                
    }
     */
    
    
}