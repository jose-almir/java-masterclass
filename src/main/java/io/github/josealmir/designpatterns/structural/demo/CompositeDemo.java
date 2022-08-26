package io.github.josealmir.designpatterns.structural.demo;

import java.util.ArrayList;
import java.util.List;

public class CompositeDemo {
    public static void main(String[] args) {
        Folder root = new Folder("home");
        root.add(new File("me.jpg"));
        root.add(new File("her.mp3"));
        Folder documents = new Folder("documents");
        documents.add(new File("tcc.doc"));
        documents.add(new File("planning.xls"));
        documents.add(new File("certification.pdf"));
        root.add(documents);
        System.out.println(root.search("tcc.doc"));
    }

    interface Component {
        String EMPTY = "";

        String search(String name);
    }

    static class File implements Component {
        private final String name;

        public File(String name) {
            this.name = name;
        }

        @Override
        public String search(String name) {
            return this.name.equals(name) ? String.format("%s%s", "/", name) : Component.EMPTY;
        }
    }

    static class Folder implements Component {
        private final String name;
        private final List<Component> children;

        public Folder(String name) {
            this.children = new ArrayList<>();
            this.name = name;
        }

        public void add(Component child) {
            this.children.add(child);
        }

        public void remove(Component child) {
            this.children.remove(child);
        }

        @Override
        public String search(String name) {
            for (Component child : this.children) {
                String result = child.search(name);
                if (!result.equals(Component.EMPTY)) {
                    return String.format("%s%s%s", "/", this.name, result);
                }
            }
            return Component.EMPTY;
        }
    }
}
