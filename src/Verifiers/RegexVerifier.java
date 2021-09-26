/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Verifiers;

import java.util.Set;
import java.util.HashSet;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

import java.text.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author amit
 */
public class RegexVerifier extends InputVerifier {
    
    private JTextField field;
    private String regex;
    private String fieldName;
    
    
    public RegexVerifier(JTextField field, String regex, String fieldName) {
            this.field = field;
            this.regex = regex;
            this.fieldName = fieldName;
    }
    
    public boolean isValid() {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(field.getText());
        if (!matcher.matches() || (field.getText().isEmpty())) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean verify(JComponent input) {
        if (isValid()) {
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public boolean shouldYieldFocus(JComponent source, JComponent target) {
        if (field.getText().isEmpty() == false) {
            if (!isValid()) {
                JOptionPane.showMessageDialog(source, "Inavlid " + fieldName, "Validation failed ", JOptionPane.ERROR_MESSAGE);
                return false;
            } 
            return true;
        } else {
            JOptionPane.showMessageDialog(source, fieldName.substring(0,1).toUpperCase() + fieldName.substring(1).toLowerCase() + " can not be empty", "Validation failed ", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    } 
}
