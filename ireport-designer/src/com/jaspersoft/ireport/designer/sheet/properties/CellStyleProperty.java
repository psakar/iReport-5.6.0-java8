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
package com.jaspersoft.ireport.designer.sheet.properties;

import com.jaspersoft.ireport.designer.sheet.properties.AbstractStyleProperty;
import net.sf.jasperreports.crosstabs.design.JRDesignCellContents;
import net.sf.jasperreports.engine.JRStyle;
import net.sf.jasperreports.engine.design.JasperDesign;

/**
 * @author Teodor Danciu (teodord@users.sourceforge.net)
 */
public final class CellStyleProperty extends AbstractStyleProperty
{
    private final JRDesignCellContents cell;

    @SuppressWarnings("unchecked")
    public CellStyleProperty(JRDesignCellContents cell, JasperDesign jd)
    {
        super(cell, jd);
        setName( JRDesignCellContents.PROPERTY_STYLE_NAME_REFERENCE);
        this.cell = cell;
    }

    @Override
    public String getStyleNameReference() 
    {
        return cell.getStyleNameReference();
    }

    @Override
    public void setStyleNameReference(String s) 
    {
        cell.setStyleNameReference(s);
    }

    @Override
    public JRStyle getStyle() 
    {
        return cell.getStyle();
    }

    @Override
    public void setStyle(JRStyle s) 
    {
        cell.setStyle(s);
    }

}
