package client;

import com.sun.istack.internal.NotNull;
import country.Country;
import games.Game;
import heroes.Hero;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Client {
    private List<Hero> clientFavoriteHeroes = new ArrayList<>(3);
    private List<Game> clientPlayedGames = new ArrayList<>();
    private int clientCurrentMMR = 0, clientWantedMMR = 0;
    private List<String> clientFavoriteRolesByPriority = new ArrayList<>(5);
    private int clientRampagesCount = 0, clientGPM = 0, clientEPM = 0,
            clientTripleKillsCount = 0, clientFirstBloodKillsCount = 0;
    private Image clientImage;
    private Country clientCountry;

    public void setClientCurrentMMR(int clientCurrentMMR) {
        if (clientCurrentMMR > 0)
            this.clientCurrentMMR = clientCurrentMMR;
    }

    public void setClientWantedMMR(int clientWantedMMR) {
        if (clientWantedMMR > 0)
            this.clientWantedMMR = clientWantedMMR;
    }

    public void setClientGPM(int clientGPM) {
        if (clientGPM > 0)
            this.clientGPM = clientGPM;
    }

    public void setClientEPM(int clientEPM) {
        if (clientEPM > 0)
            this.clientEPM = clientEPM;
    }

    public void setClientRampagesCount(int clientRampagesCount) {
        if (clientRampagesCount > 0)
            this.clientRampagesCount = clientRampagesCount;
    }

    public void setClientTripleKillsCount(int clientTripleKillsCount) {
        if (clientTripleKillsCount > 0)
            this.clientTripleKillsCount = clientTripleKillsCount;
    }

    public void setClientFirstBloodKillsCount(int clientFirstBloodKillsCount) {
        if (clientFirstBloodKillsCount > 0)
            this.clientFirstBloodKillsCount = clientFirstBloodKillsCount;
    }

    public void setFavoriteHeroes(List<Hero> clientFavoriteHeroes) {
        if (!clientFavoriteHeroes.isEmpty())
            this.clientFavoriteHeroes = clientFavoriteHeroes;
    }

    //TODO create an algorithm to load client game history from site OR create a feature to edit and do it by yourself

    public void setClientCountry(@NotNull Country clientCountry) {
        this.clientCountry = clientCountry;
    }

    public void setClientImage(@NotNull Image clientImage) {
        this.clientImage = clientImage;
    }

    public int getClientCurrentMMR() {
        return clientCurrentMMR;
    }

    public int getClientWantedMMR() {
        return clientWantedMMR;
    }

    public int getClientRampagesCount() {
        return clientRampagesCount;
    }

    public int getClientGPM() {
        return clientGPM;
    }

    public int getClientEPM() {
        return clientEPM;
    }

    public int getClientTripleKillsCount() {
        return clientTripleKillsCount;
    }

    public int getClientFirstBloodKillsCount() {
        return clientFirstBloodKillsCount;
    }
}
