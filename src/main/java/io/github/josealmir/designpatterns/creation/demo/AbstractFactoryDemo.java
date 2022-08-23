package io.github.josealmir.designpatterns.creation.demo;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AppFactory factory = new DesktopAppFactory();
        Resources resources = factory.getResources();
        App app = factory.renderApp(resources);
        app.render();
    }

    interface AppFactory {
        App renderApp(Resources resources);

        Resources getResources();
    }

    static class MobileAppFactory implements AppFactory {
        @Override
        public App renderApp(Resources resources) {
            return new MobileApp();
        }

        @Override
        public Resources getResources() {
            return new MobileResources();
        }
    }

    static class DesktopAppFactory implements AppFactory {
        @Override
        public App renderApp(Resources resources) {
            return new DesktopApp();
        }

        @Override
        public Resources getResources() {
            return new DesktopResources();
        }
    }


    interface App {
        void render();
    }

    static class MobileApp implements App {
        @Override
        public void render() {
            System.out.println("Rendering mobile app");
        }
    }

    static class DesktopApp implements App {
        @Override
        public void render() {
            System.out.println("Rendering desktop app");
        }
    }

    interface Resources {
        String getString(String key);
    }

    static class MobileResources implements Resources {
        @Override
        public String getString(String key) {
            return "Mobile string";
        }
    }

    static class DesktopResources implements Resources {
        @Override
        public String getString(String key) {
            return "Desktop string";
        }
    }
}

