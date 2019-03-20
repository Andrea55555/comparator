import java.util.Comparator;
import java.util.TreeSet;

/**
 * // создал класс.
 */
class Class1 {
    /**
     * // создал name.
     */
    private String name;
    /**
     * // создал count.
     */
    private int count;

    /**
     * @param n *вот он*.
     * @param a *вот она*.
     */
    Class1(final String n, final int a) {
        name = n;
        count = a;
    }
    /**
     * @tag getName *вот он*.
     */
    String getName() {
        return name;
    }

    /**
     * @tag getCount *вот он*.
     */
    int getCount() {
        return count;
    }

    /**
     * // создал Namez.
     */
    public static class Namez implements Comparator<Class1> {
        /**
         * @param n *вот он*.
         * @param a *вот она*.
         */
        public int compare(final Class1 n, final Class1 a) {

            return n.getName().compareTo(a.getName());
        }
    }

    /**
     * // Caunt.
     */
    public static class Caunt implements Comparator<Class1> {
        /**
         * @param n *вот он*.
         * @param a *вот она*.
         */
        public int compare(final Class1 n, final Class1 a) {
            if (a.getCount() > n.getCount()) {
                return -1;
            } else if (a.getCount() < n.getCount()) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    /**
     * @param args *вот он*.
     */
    public static void main(final String[] args) {
        Comparator<Class1> pcomp = new Namez()
                .thenComparing(new Caunt());
        TreeSet<Class1> namez = new TreeSet(pcomp);
        namez.add(new Class1("Dmitri", 33));
        namez.add(new Class1("Andrey", 25));
        namez.add(new Class1("Andrey", 8));
        namez.add(new Class1("Andrey", 99));
        namez.add(new Class1("Timofei", 23));
        namez.add(new Class1("Ilia", 27));

        for (Class1 n : namez) {

            System.out.println(n.getName() + " " + n.getCount());
        }
    }
}
