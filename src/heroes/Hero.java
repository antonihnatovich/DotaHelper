package heroes;

import com.sun.istack.internal.NotNull;
import javafx.scene.image.Image;
import skills.Skill;

import java.util.ArrayList;
import java.util.List;

public class Hero {
    private List<Skill> heroSkills = new ArrayList<>();
    private int heroManaValue = 0;
    private int heroAttackValue = 0;
    private int heroAgilityValue = 0;
    private int heroMoveSpeedValue = 0;
    private int heroStrengthValue = 0;
    private int heroArmorValue = 0;
    private int heroHealthsValueFirst = 0;
    private int heroHealthsValueFifteen = 0;
    private int heroTwentyFifthHealthValue = 0;
    private String heroName = "", heroBiography = "";
    private Image heroImage = null;
    private boolean isRangeAttackHero = false;
    private List<HeroGameRoleType> heroGameRoleTypes = new ArrayList<>();

    public void setHeroSkills(@NotNull List<Skill> heroSkills) {
        this.heroSkills = heroSkills;
    }

    public void setHeroGameRoleTypes(@NotNull List<HeroGameRoleType> heroGameRoleTypes) {
        this.heroGameRoleTypes = heroGameRoleTypes;
    }

    public void setRangeAttackHero(boolean isRangeAttackHero) {
        this.isRangeAttackHero = isRangeAttackHero;
    }

    public void setHeroImage(@NotNull Image heroImage) {
        this.heroImage = heroImage;
    }

    public void setHeroName(@NotNull String heroName) {
        this.heroName = heroName;
    }

    public void setHeroBiography(@NotNull String heroBiography) {
        this.heroBiography = heroBiography;
    }

    public void setHeroManaValue(int heroManaValue) {
        if (heroManaValue > 0)
            this.heroManaValue = heroManaValue;
    }

    public void setHeroAttackValue(int heroAttackValue) {
        if (heroAttackValue > 0)
            this.heroAttackValue = heroAttackValue;
    }

    public void setHeroAgilityValue(int heroAgilityValue) {
        if (heroAgilityValue > 0)
            this.heroAgilityValue = heroAgilityValue;
    }

    public void setHeroMoveSpeedValue(int heroMoveSpeedValue) {
        if (heroMoveSpeedValue > 0)
            this.heroMoveSpeedValue = heroMoveSpeedValue;
    }

    public void setHeroStrengthValue(int heroStrengthValue) {
        if (heroStrengthValue > 0)
            this.heroStrengthValue = heroStrengthValue;
    }

    public void setHeroArmorValue(int heroArmorValue) {
        if (heroArmorValue > 0)
            this.heroArmorValue = heroArmorValue;
    }

    public void setHeroHealthsValueFirst(int heroHealthsValueFirst) {
        if (heroHealthsValueFirst > 0)
            this.heroHealthsValueFirst = heroHealthsValueFirst;
    }

    public void setHeroHealthsValueFifteen(int heroHealthsValueFifteen) {
        if (heroHealthsValueFifteen > 0)
            this.heroHealthsValueFifteen = heroHealthsValueFifteen;
    }

    public void setHeroTwentyFifthHealthValue(int heroTwentyFifthHealthValue) {
        if (heroTwentyFifthHealthValue > 0)
            this.heroTwentyFifthHealthValue = heroTwentyFifthHealthValue;
    }

    public List<Skill> getHeroSkills() {
        return heroSkills;
    }

    public int getHeroArmorValue() {
        return heroArmorValue;
    }

    public int getHeroManaValue() {
        return heroManaValue;
    }

    public int getHeroAttackValue() {
        return heroAttackValue;
    }

    public int getHeroAgilityValue() {
        return heroAgilityValue;
    }

    public int getHeroMoveSpeedValue() {
        return heroMoveSpeedValue;
    }

    public int getHeroStrengthValue() {
        return heroStrengthValue;
    }

    public int getHeroHealthsValueFirst() {
        return heroHealthsValueFirst;
    }

    public int getHeroHealthsValueFifteen() {
        return heroHealthsValueFifteen;
    }

    public int getHeroTwentyFifthHealthValue() {
        return heroTwentyFifthHealthValue;
    }

    public String getHeroName() {
        return heroName;
    }

    public String getHeroBiography() {
        return heroBiography;
    }

    public Image getHeroImage() {
        return heroImage;
    }

    public boolean isRangeAttackHero() {
        return isRangeAttackHero;
    }

    public List<HeroGameRoleType> getHeroGameRoleTypes() {
        return heroGameRoleTypes;
    }
}
