/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.github.mdre.joditWrapper;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.DetachEvent;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.HasTheme;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.dom.ClassList;
import com.vaadin.flow.dom.Style;
import com.vaadin.flow.shared.Registration;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marcelo D. Ré {@literal <marcelo.re@gmail.com>}
 */
@Tag("jodit-wrapper")
@JsModule("./joditwrapper/JoditWrapper.js")
public class JoditWrapper  extends Component implements  HasSize, HasTheme, HasStyle, HasComponents {
    private final static Logger LOGGER = Logger.getLogger(JoditWrapper.class .getName());
    private static final long serialVersionUID = 8656320574931728359L;
    static {
        if (LOGGER.getLevel() == null) {
            LOGGER.setLevel(Level.INFO);
        }
    }
    
    public JoditWrapper() {
        
    }
    
    
    @Override
    public Registration addAttachListener(ComponentEventListener<AttachEvent> listener) {
        return super.addAttachListener(listener); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Registration addDetachListener(ComponentEventListener<DetachEvent> listener) {
        return super.addDetachListener(listener); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setWidth(String width) {
        HasSize.super.setWidth(width); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMinWidth(String minWidth) {
        HasSize.super.setMinWidth(minWidth); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMaxWidth(String maxWidth) {
        HasSize.super.setMaxWidth(maxWidth); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getWidth() {
        return HasSize.super.getWidth(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getMinWidth() {
        return HasSize.super.getMinWidth(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getMaxWidth() {
        return HasSize.super.getMaxWidth(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setHeight(String height) {
        HasSize.super.setHeight(height); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMinHeight(String minHeight) {
        HasSize.super.setMinHeight(minHeight); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMaxHeight(String maxHeight) {
        HasSize.super.setMaxHeight(maxHeight); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getHeight() {
        return HasSize.super.getHeight(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getMinHeight() {
        return HasSize.super.getMinHeight(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getMaxHeight() {
        return HasSize.super.getMaxHeight(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSizeFull() {
        HasSize.super.setSizeFull(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setWidthFull() {
        HasSize.super.setWidthFull(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setHeightFull() {
        HasSize.super.setHeightFull(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSizeUndefined() {
        HasSize.super.setSizeUndefined(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addClassName(String className) {
        HasStyle.super.addClassName(className); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeClassName(String className) {
        return HasStyle.super.removeClassName(className); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setClassName(String className) {
        HasStyle.super.setClassName(className); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getClassName() {
        return HasStyle.super.getClassName(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ClassList getClassNames() {
        return HasStyle.super.getClassNames(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setClassName(String className, boolean set) {
        HasStyle.super.setClassName(className, set); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean hasClassName(String className) {
        return HasStyle.super.hasClassName(className); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Style getStyle() {
        return HasStyle.super.getStyle(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addClassNames(String... classNames) {
        HasStyle.super.addClassNames(classNames); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeClassNames(String... classNames) {
        HasStyle.super.removeClassNames(classNames); //To change body of generated methods, choose Tools | Templates.
    }

    
}
