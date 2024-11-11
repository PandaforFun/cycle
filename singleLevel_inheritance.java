// Program to illustrate single-level inheritance
class Father {
    String strength = "Strong";
    
    public void showFather() {
        System.out.println("Father's skill: " + strength);
    }
}

class Me extends Father {
    String curiosity = "Curious";
    
    public void showMe() {
        System.out.println("My skill: " + curiosity);
    }
}

public class singleLevel_inheritance {
    public static void main(String[] args) {
        Me me = new Me();
        me.showFather();
        me.showMe();
        System.out.println("Combined skills: " + me.strength + ", " + me.curiosity);
    }
}