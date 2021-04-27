package SpaseLab.HW1.Singleton;

class SingletonInstant {
    private static SingletonInstant instance = null;

    private SingletonInstant() {
    }

    public static SingletonInstant getInstance() {
        if (instance == null) {
            instance = new SingletonInstant();
        }
        return (instance);
    }
}
