package Level2.ex1;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonSerializer {

    public static void serializeJson (Object object) throws IOException, IllegalAccessException {
        Class<?> objectClass = object.getClass();

        if(objectClass.isAnnotationPresent(JsonSerializable.class)) {
            JsonSerializable annotation = objectClass.getAnnotation(JsonSerializable.class);
            String directory = annotation.directory();

            Files.createDirectories(Paths.get(directory));

            StringBuilder jsonBuilder = new StringBuilder();
            jsonBuilder.append("{\n");

            Field[] fields = objectClass.getDeclaredFields();
            for (int i = 0; i < fields.length; i++) {
                fields[i].setAccessible(true);
                String name = fields[i].getName();
                Object value = fields[i].get(object);

                jsonBuilder.append("  \"").append(name).append("\": ");

                if (value instanceof String) {
                    jsonBuilder.append("\"").append(value).append("\"");
                } else {
                    jsonBuilder.append(value);
                }

                if (i < fields.length - 1) {
                    jsonBuilder.append(",");
                }
                jsonBuilder.append("\n");
            }
                jsonBuilder.append("}");
                String filename = Paths.get(directory, objectClass.getSimpleName() + ".json").toString();

                try (FileWriter writer = new FileWriter(filename)) {
                    writer.write(jsonBuilder.toString());
                }

                System.out.println("JSON saved to : " + filename);

        } else {
            System.out.println("Class is not annotated with @JsonSerializable");

        }


    }
}
