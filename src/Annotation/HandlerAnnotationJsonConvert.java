package Annotation;

import java.lang.reflect.Field;
import java.util.Optional;

public class HandlerAnnotationJsonConvert {

    public static String toJson(Object object) throws IllegalAccessException {
        StringBuilder sb = new StringBuilder();

        Class<?> clazz = object.getClass();
        JsonConvert jsonConvert = clazz.getDeclaredAnnotation(JsonConvert.class);
        sb.append("{\n")
                .append("\t\"")
                .append(Optional.ofNullable(jsonConvert).map(JsonConvert::value).orElse(clazz.getSimpleName()))
                .append("\": {\n");

        Field fields[] = clazz.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            JsonConvert jsonFieldName = fields[i].getDeclaredAnnotation(JsonConvert.class);
            sb.append("\t\t\"")
                    .append(Optional.ofNullable(jsonFieldName).map(JsonConvert::value).orElse(fields[i].getName())) // L
                    .append("\": ")
                    .append(fields[i].getType() == String.class || !fields[i].getType().isPrimitive() ? "\"" : "")
                    .append(fields[i].get(object))
                    .append(fields[i].getType() == String.class || !fields[i].getType().isPrimitive()? "\"" : "")
                    .append(i != fields.length -1 ? ",\n" : "\n");
        }
        sb.append("\t}\n");
        sb.append("}");

        return sb.toString();



    }
}
