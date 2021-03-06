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

import com.jaspersoft.ireport.designer.ModelUtils;
import com.jaspersoft.ireport.designer.editor.ExpressionContext;
import com.jaspersoft.ireport.locale.I18n;
import net.sf.jasperreports.crosstabs.design.JRDesignCellContents;
import net.sf.jasperreports.engine.design.JRDesignDataset;
import net.sf.jasperreports.engine.design.JRDesignExpression;
import net.sf.jasperreports.engine.design.JRDesignTextField;

/**
 *
 * @author gtoffoli
 */
public class TextfieldPatternExpressionProperty extends ExpressionProperty {

    private JRDesignTextField element;


    public TextfieldPatternExpressionProperty(JRDesignTextField element, JRDesignDataset dataset)
    {
        super(element, dataset);
        this.element = element;

        if (ModelUtils.getTopElementGroup(element) instanceof JRDesignCellContents)
        {
            JRDesignCellContents contents = (JRDesignCellContents) ModelUtils.getTopElementGroup(element);
            this.setValue(ExpressionContext.ATTRIBUTE_EXPRESSION_CONTEXT, new ExpressionContext(contents.getOrigin().getCrosstab()));
        }
    }

    @Override
    public String getName()
    {
        return JRDesignTextField.PROPERTY_PATTERN_EXPRESSION;
    }

    @Override
    public String getDisplayName()
    {
        return I18n.getString("TextfieldPatternExpression.name");
    }

    @Override
    public String getShortDescription()
    {
        return I18n.getString("TextfieldPatternExpression.desc");
    }

    @Override
    public String getDefaultExpressionClassName() {
        return "java.lang.String";
    }

    @Override
    public JRDesignExpression getExpression() {
        return (JRDesignExpression)element.getPatternExpression();
    }

    @Override
    public void setExpression(JRDesignExpression expression) {
        element.setPatternExpression(expression);
    }

}
