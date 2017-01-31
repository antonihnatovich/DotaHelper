package country;


import com.sun.istack.internal.NotNull;

import java.awt.*;

public class Country {
    private Image countryImage;
    private String countryName = "";
    public Country(Image countryImage, String countryName){
        this.countryImage = countryImage;
        this.countryName = countryName;
    }

    public void changeCountryImage(@NotNull Image CountryImage){
            this.countryImage = CountryImage;
    }

    public void changeCountryName(@NotNull String countryName){
        if(!countryName.equals(""))
            this.countryName = countryName;
    }
}
