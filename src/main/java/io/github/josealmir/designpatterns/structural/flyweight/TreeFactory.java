package io.github.josealmir.designpatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TreeFactory {
    static private List<TreeType> treeTypes;

    static {
        treeTypes = new ArrayList<>();
    }

    static public TreeType getTreeType(String name, String color, String texture) {
        Optional<TreeType> treeType = treeTypes.stream().filter((type) -> type.getName().equals(name) && type.getColor().equals(color) && type.getTexture().equals(texture)).findFirst();
        TreeType type;

        if (treeType.isPresent()) {
            return treeType.get();
        }

        type = new TreeType(name, color, texture);
        treeTypes.add(type);
        return type;
    }
}
