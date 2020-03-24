/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nbcc;

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
@FacesValidator("ageValidator")
public class AgeValidator implements Validator {

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
      // get label from the control
      HtmlInputText htmlInputText = (HtmlInputText) component;
      String label;
      // Lets determine if the label is in fact included within the control
      if( htmlInputText.getLabel() == null ||  htmlInputText.getLabel().trim().equals("")){
          label = htmlInputText.getId();
      }else{
           label = htmlInputText.getLabel();
      }
      label = htmlInputText.getLabel();
      // test our matcher for failures on regex compare
      //throw validation error gets picked up by the front end
      int age = Integer.parseInt(value.toString());
      if(age < 18){
          FacesMessage faceMessage = new FacesMessage(label + "Valid age must be older that 18");
          throw new ValidatorException(faceMessage);
      }
      
    }
    
}
