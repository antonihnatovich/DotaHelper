package skills;

import javafx.scene.image.Image;
import java.math.*;

public class Skill {
    private String skillName = "", skillInfo = "", skillType = "";
    private double skillCooldownTime = 0, skillRequiredMana = 0, skillDamage = 0;
    private Image skillImage = null;

    /**
     * This method is required for changing double parameters of SKill class.
     *
     * @param requiredItem Possible variants of requiredItem are:
     *                     1.skillCooldownTime.
     *                     2.skillRequiredMana.
     *                     3.skillDamage.
     * @param percent      1.All non-null and non-zero values.
     */
    public void correctSkillNumberParametr(String requiredItem, double percent) {
        switch (requiredItem) {
            case "skillCooldownTime":
                skillCooldownTime *= percent;
                break;
            case "skillRequiredMana":
                skillRequiredMana *= percent;
                break;
            case "skillDamage":
                skillDamage *= percent;
                break;
            default:
                throw new TypeNotPresentException(". Not supported type of parameter.", null);
        }
    }

    /**
     * *This method is required for changing String parameters of Skill class.
     *
     * @param requiredItem *Possible variants of requiredItem are:
     *                     1.skillName.
     *                     2.skillInfo.
     *                     3.skillType
     *                     4.Otherwise the TypeNotPresentException will be thrown.
     * @param toChange     Possible variants of toChange:
     *                     1.All non-null and non-empty strings.
     */
    public void correctSkillStringParametr(String requiredItem, String toChange) {
        switch (requiredItem) {
            case "skillName":
                skillName = toChange;
                break;
            case "skillInfo":
                skillInfo = toChange;
                break;
            case "skillType":
                skillType = toChange;
            default:
                throw new TypeNotPresentException(". Not supported type of parameter.", null);
        }
    }

    /**
     * This method is required for changing Image parameter of skill.
     * Image must have 100x100 size.
     *
     * @param skillImage Possible variants fo skillImage item are:
     *                   1.All non-null and non-empty 100x100 size Image objects.
     */
    public void correctSkillImage(Image skillImage) {
        this.skillImage = skillImage;
    }

    public String getSkillName() {
        return skillName;
    }

    public String getSkillInfo() {
        return skillInfo;
    }

    public String getSkillType(){
        return skillType;
    }

    public double getSkillCooldownTime() {
        return skillCooldownTime;
    }

    public double getSkillRequiredMana() {
        return skillRequiredMana;
    }

    public double getSkillDamage() {
        return skillDamage;
    }

    public Image getSkillImage() {
        return skillImage;
    }
}
