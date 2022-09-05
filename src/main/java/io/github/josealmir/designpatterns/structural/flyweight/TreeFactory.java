package io.github.josealmir.designpatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class TreeFactory {
    static private final List<TreeType> treeTypes;

    static {
        treeTypes = new ArrayList<>();
    }

    static public TreeType getTreeType(String name, String color, String texture) {
        Optional<TreeType> treeType = treeTypes.stream().filter(exists(name, color, texture)).findFirst();
        TreeType type;

        if (treeType.isPresent()) {
            return treeType.get();
        }

        type = new TreeType(name, color, texture);
        treeTypes.add(type);
        return type;
    }

    static private Predicate<TreeType> exists(String name, String color, String texture) {
        return (type) -> type.getName().equals(name) && type.getColor().equals(color) && type.getTexture().equals(texture);
    }
}
