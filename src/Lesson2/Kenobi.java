package Lesson2;

public class Kenobi {

    private String name;
    private String gender;
    private Boolean jediMaster;
    private Long age;
    private Color dressedColor;
    private int lightsabers;

    public Kenobi(String name, String gender, Boolean jediMaster, Long age, Color dressedColor, int lightsabers) {
        this.name = name;
        this.gender = gender;
        this.jediMaster = jediMaster;
        this.age = age;
        this.dressedColor = dressedColor;
        this.lightsabers = lightsabers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Boolean getJediMaster() {
        return jediMaster;
    }

    public void setJediMaster(Boolean jediMaster) {
        this.jediMaster = jediMaster;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public Color getDressedColor() {
        return dressedColor;
    }

    public void setDressedColor(Color dressedColor) {
        this.dressedColor = dressedColor;
    }

    public int getLightsabers() {
        return lightsabers;
    }

    public void setLightsabers(int lightsabers) {
        this.lightsabers = lightsabers;
    }

    @Override
    public String toString() {
        return "Kenobi{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", jediMaster=" + jediMaster +
                ", age=" + age +
                ", dressedColor=" + dressedColor +
                ", lightsabers=" + lightsabers +
                '}';
    }
}

