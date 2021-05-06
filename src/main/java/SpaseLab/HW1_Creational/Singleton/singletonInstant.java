package SpaseLab.HW1_Creational.Singleton;

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
