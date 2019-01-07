package e14;

public class HorrorShow {
    static void u(Monster b) {
        b.menace();
    }

    static void v(DangerousMonster d) {
        d.menace();
        d.destroy();
    }

    static void w(Lethal l) {
        l.kill();
    }

    public static void main(String[] args) {
        DangerousMonster barney = new DangerousMonster() {
            @Override
            public void menace() {

            }

            @Override
            public void destroy() {

            }
        };
        HorrorShow.u(barney);
        HorrorShow.v(barney);

        Vampire vlad = new Vampire() {

            @Override
            public void menace() {

            }

            @Override
            public void kill() {

            }

            @Override
            public void destroy() {

            }

            @Override
            public void drinkBlood() {

            }
        };

        u(vlad);
        v(vlad);
        w(vlad);
    }
}