package Level2.ex1;

import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException, IllegalAccessException {
        MyObject obj1 = new MyObject("Youssef", 25, "youssef.eg09@gmail.com");

        JsonSerializer.serializeJson(obj1);
    }
}
