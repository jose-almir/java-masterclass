package io.github.josealmir.designpatterns.structural.demo;

public class DecoratorDemo {
    public static void main(String[] args) {
        Gun agaragan = new Pistol(15);
        agaragan = new WithSilencer(agaragan);
        agaragan = new WithExtendedShell(agaragan, 5);
        agaragan = new WithTripleFire(agaragan);

        agaragan.fire();
        agaragan.reload(4);
        agaragan.fire();
    }


    interface Gun {
        void fire();

        void reload(int bullets);
    }

    static class Pistol implements Gun {
        private int bullets;

        public Pistol(int bullets) {
            this.bullets = bullets;
        }

        @Override
        public void fire() {
            if (this.bullets > 0) {
                this.bullets -= 1;
                System.out.println("Firing with Pistol");
            }
            System.out.println(bullets);
        }

        @Override
        public void reload(int bullets) {
            System.out.println("Reloading ammo" + this.bullets);
            this.bullets += bullets;
        }
    }

    static class WithSilencer implements Gun {
        private Gun gun;

        public WithSilencer(Gun gun) {
            this.gun = gun;
        }

        @Override
        public void fire() {
            gun.fire();
            System.out.println("With silencer...");
        }

        @Override
        public void reload(int bullets) {
            gun.reload(bullets);
        }
    }

    static class WithExtendedShell implements Gun {
        private Gun gun;

        private int extraBullets;

        public WithExtendedShell(Gun gun, int extraBullets) {
            this.gun = gun;
            this.extraBullets = extraBullets;
            gun.reload(extraBullets);
        }

        @Override
        public void fire() {
            gun.fire();
        }

        @Override
        public void reload(int bullets) {
            gun.reload(extraBullets + bullets);
        }
    }

    static class WithTripleFire implements Gun {
        private Gun gun;

        public WithTripleFire(Gun gun) {
            this.gun = gun;
        }

        @Override
        public void fire() {
            gun.fire();
            gun.fire();
            gun.fire();
        }

        @Override
        public void reload(int bullets) {
            gun.reload(bullets);
        }
    }
}
