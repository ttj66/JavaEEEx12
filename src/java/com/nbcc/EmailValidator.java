/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nbcc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlInputText;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author joe
 */
@FacesValidator("emailValidator")
public class EmailValidator implements Validator {

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
      Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,6}$",Pattern.CASE_INSENSITIVE);
      Matcher matcher = pattern.matcher((CharSequence)value);
      // get label from the control
      HtmlInputText htmlInputText = (HtmlInputText) component;
      String label;
      // Lets determine if the label is in fact included within the control
      if( htmlInputText.getLabel() == null ||  htmlInputText.getLabel().trim().equals("")){
      label = htmlInputText.getLabel();
      // test our matcher for failures on regex compare
      //throw validation error gets picked up by the front end
      if(!matcher.matches()){
          FacesMessage faceMessage = new FacesMessage(label + "is an invalid email");
          throw new ValidatorException(faceMessage);
      }
      }
    }
    
}
