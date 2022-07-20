package org.javaadvanced;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class C40StreamOfFile {
    public static void main(String[] args) {

        List<Bunny> bunnies = loadBunnies("Bunny.txt");
        bunnies.forEach(System.out::println);

    }
    public static List<Bunny> loadBunnies(String fileName){
        List<Bunny> bunnies = new ArrayList<>();
        try(Stream<String> stringStream = Files.lines(Paths.get(fileName))){
            stringStream.forEach(line->{
                String bunnyArray[] = line.split("/");
                bunnies.add(new Bunny(bunnyArray[0], bunnyArray[1]));
            });
        } catch (IOException e){
            e.printStackTrace();
        }
        return bunnies;
    }
}

class Bunny {
    private String name;
    private String color;

    Bunny(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Bunny{name=" + name + ", color=" + color + "}";
    }
}
