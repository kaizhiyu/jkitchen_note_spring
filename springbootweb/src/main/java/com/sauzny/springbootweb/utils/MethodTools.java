package com.sauzny.springbootweb.utils;

import java.lang.reflect.Method;

import com.sauzny.springbootweb.controller.vo.PageContent;

public class MethodTools {

    public static void setget(Class<?> clazz, String otherName){
        String simpleName = clazz.getSimpleName();
        String className = simpleName.substring(0, 1).toLowerCase() + clazz.getSimpleName().substring(1);
        Method[] methods = clazz.getMethods();
        for(Method method : methods){
            if(method.getName().startsWith("set")){
                System.out.println(className+"."+method.getName()+"("+otherName+".g"+method.getName().substring(1)+"());");
            }
        }
    }
    
    public static void main(String[] args) {
        MethodTools.setget(PageContent.class, "page");
    }
}
