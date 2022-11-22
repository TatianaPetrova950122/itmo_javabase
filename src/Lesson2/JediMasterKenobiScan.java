package Lesson2;

public class JediMasterKenobiScan {
    public static void main(String[] args) {
        Kenobi kenobi = new Kenobi("Obi-Wan Kenobi", "male", true, 57L, Color.BEIGE, 1);
        System.out.println(kenobilightsabers(kenobi, 1));
        System.out.println(jediMasterDressColor(kenobi, Color.BLACK));
    }

    public static Boolean kenobilightsabers(Kenobi kenobi, Integer lightsabers) {
        if (lightsabers != 1) {
            return false;
        } else {
            return true;
        }
    }

    public static Color jediMasterDressColor(Kenobi kenobi, Color dressedColor) {
        if (dressedColor != Color.BEIGE) {
            System.err.println("Not a jedi Master Kenobi");
        } else {
            System.out.println("Maybe this robe belongs to Master Kenobi");
        }
        return dressedColor;

    }
}
