package io.github.josealmir.designpatterns.creation.demo;

public class SingletonDemo {
    public static void main(String[] args) {
        Repository repository = new Repository();
        repository.create();
    }

    static class Database {
        private static Database instance = null;

        private Database() {
        }

        public static Database getInstance() {
            if (instance == null) {
                instance = new Database();
            }

            return instance;
        }

        public void init() {
            System.out.println("Database initialized");
        }
    }

    static class Repository {
        private final Database database = Database.getInstance();

        public void create() {
            database.init();
        }
    }
}

