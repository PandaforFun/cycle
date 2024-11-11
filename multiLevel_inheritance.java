// Program to illustrate multi-level inheritance
class GrandFather {
    String strength = "Strong";
    public void showGrandFather() {
        System.out.println("Grandfather's skill: " + strength);
    }
}

class Father extends GrandFather {
    String wisdom = "Wise";
    public void showFather() {
        System.out.println("Father's skill: " + wisdom);
    }
}

class Me extends Father {
    String curiosity = "Curious";
    public void showMe() {
        System.out.println("My skill: " + curiosity);
    }
    
    public void showAllSkills() {
        System.out.println("Inherited skills: " + strength + ", " + wisdom + ", " + curiosity);
    }
}

public class multiLevel_inheritance {
    public static void main(String[] args) {
        Me me = new Me();
        me.showGrandFather();
        me.showFather();
        me.showMe();
        me.showAllSkills();
    }
}