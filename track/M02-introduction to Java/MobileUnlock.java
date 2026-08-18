
public class MobileUnlock {

    public static void main(String[] args) {
        Phone phone = new Phone();

        phone.unlock(1234);
        phone.unlock("MySecretPass");

        Fingerprint fp = new Fingerprint("Finger Print Detected");
        phone.unlock(fp);

        FaceLock face = new FaceLock("unlocked using Face Detection");
        phone.unlock(face);
    }
}

class Fingerprint {

    String printData;

    Fingerprint(String printData) {
        this.printData = printData;
    }
}

class FaceLock {

    String faceData;

    FaceLock(String faceData) {
        this.faceData = faceData;
    }
}

class Phone {

    void unlock(int pin) {
        System.out.println("Unlocked mobile using PIN: " + pin);
    }

    void unlock(String password) {
        System.out.println("Unlocked mobile using Password: " + password);
    }

    void unlock(Fingerprint fp) {
        System.out.println("Unlocked mobile using Fingerprint (" + fp.printData + ")");
    }

    void unlock(FaceLock face) {
        System.out.println("Unlocked mobile using Face Lock (" + face.faceData + ")");
    }
}
