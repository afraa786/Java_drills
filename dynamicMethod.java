class Phone {
    public void showTime() {
        System.out.println("The time right now is 8 am");
    }

    public void switchOn() {
        System.out.println("Phone is switching on");
    }
}

class Smartphone extends Phone {
    public void playMusic() {
        System.out.println("Smartphone is playing music");
    }

    @Override
    public void switchOn() {
        System.out.println("Smartphone is switching on");
    }
}

public class dynamicMethod {
    public static void main(String[] args) {
        Phone myPhone = new Smartphone();
        myPhone.switchOn();
    }
}

