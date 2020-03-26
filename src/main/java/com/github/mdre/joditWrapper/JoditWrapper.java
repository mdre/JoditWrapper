/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.github.mdre.joditWrapper;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.CompositionEndEvent;
import com.vaadin.flow.component.CompositionNotifier;
import com.vaadin.flow.component.CompositionStartEvent;
import com.vaadin.flow.component.CompositionUpdateEvent;
import com.vaadin.flow.component.DetachEvent;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.HasTheme;
import com.vaadin.flow.component.InputEvent;
import com.vaadin.flow.component.InputNotifier;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.KeyDownEvent;
import com.vaadin.flow.component.KeyModifier;
import com.vaadin.flow.component.KeyNotifier;
import com.vaadin.flow.component.KeyPressEvent;
import com.vaadin.flow.component.KeyUpEvent;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.data.value.HasValueChangeMode;
import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.dom.ClassList;
import com.vaadin.flow.dom.Style;
import com.vaadin.flow.shared.Registration;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marcelo D. Ré {@literal <marcelo.re@gmail.com>}
 */
@Tag("joeditWrapper")
@JsModule("./joeditwrapper/joedit.min.js")
public class JoditWrapper  extends PolymerTemplate<IBubbleDialogModel> implements HasTheme, HasStyle, HasComponents, HasSize {
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
    public void setRequiredIndicatorVisible(boolean requiredIndicatorVisible) {
        super.setRequiredIndicatorVisible(requiredIndicatorVisible); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isRequiredIndicatorVisible() {
        return super.isRequiredIndicatorVisible(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setReadOnly(boolean readOnly) {
        super.setReadOnly(readOnly); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isReadOnly() {
        return super.isReadOnly(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<String> getOptionalValue() {
        return super.getOptionalValue(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        super.clear(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEnabled() {
        return super.isEnabled(); //To change body of generated methods, choose Tools | Templates.
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

    @Override
    public ValueChangeMode getValueChangeMode() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setValueChangeMode(ValueChangeMode valueChangeMode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setValueChangeTimeout(int valueChangeTimeout) {
        HasValueChangeMode.super.setValueChangeTimeout(valueChangeTimeout); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getValueChangeTimeout() {
        return HasValueChangeMode.super.getValueChangeTimeout(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Registration addInputListener(ComponentEventListener<InputEvent> listener) {
        return InputNotifier.super.addInputListener(listener); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Registration addKeyDownListener(ComponentEventListener<KeyDownEvent> listener) {
        return KeyNotifier.super.addKeyDownListener(listener); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Registration addKeyPressListener(ComponentEventListener<KeyPressEvent> listener) {
        return KeyNotifier.super.addKeyPressListener(listener); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Registration addKeyUpListener(ComponentEventListener<KeyUpEvent> listener) {
        return KeyNotifier.super.addKeyUpListener(listener); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Registration addKeyDownListener(Key key, ComponentEventListener<KeyDownEvent> listener, KeyModifier... modifiers) {
        return KeyNotifier.super.addKeyDownListener(key, listener, modifiers); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Registration addKeyPressListener(Key key, ComponentEventListener<KeyPressEvent> listener, KeyModifier... modifiers) {
        return KeyNotifier.super.addKeyPressListener(key, listener, modifiers); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Registration addKeyUpListener(Key key, ComponentEventListener<KeyUpEvent> listener, KeyModifier... modifiers) {
        return KeyNotifier.super.addKeyUpListener(key, listener, modifiers); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Registration addCompositionStartListener(ComponentEventListener<CompositionStartEvent> listener) {
        return CompositionNotifier.super.addCompositionStartListener(listener); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Registration addCompositionUpdateListener(ComponentEventListener<CompositionUpdateEvent> listener) {
        return CompositionNotifier.super.addCompositionUpdateListener(listener); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Registration addCompositionEndListener(ComponentEventListener<CompositionEndEvent> listener) {
        return CompositionNotifier.super.addCompositionEndListener(listener); //To change body of generated methods, choose Tools | Templates.
    }
}
