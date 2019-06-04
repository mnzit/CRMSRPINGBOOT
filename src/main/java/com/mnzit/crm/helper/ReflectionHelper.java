/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mnzit.crm.helper;

import java.lang.reflect.Field;

/**
 *
 * @author Mnzit
 */
public class ReflectionHelper {

    public static boolean set(Object object, String fieldName, Object fieldValue) {
        Class<?> cls = object.getClass();
        while (cls != null) {
            try {
                Field field = cls.getDeclaredField(fieldName);
                field.setAccessible(true);
                field.set(object, fieldValue);
                return true;
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        return false;
    }
}
