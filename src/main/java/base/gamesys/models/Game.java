package base.gamesys.models;

import base.gamesys.utils.ScratchList;

public class Game {
    private String name;
    private String publisher;
    private String description;
    private String originalDeveloper;
    private String originalGamesMachine;
    private int yearOfFirstRelease;
    private String coverArtURL;
    private ScratchList<GamePort> gamePorts;

    // Constructor
    public Game(String name, String publisher, String description, String originalDeveloper,
                String originalGamesMachine, int yearOfFirstRelease, String coverArtURL) {
        this.name = name;
        this.publisher = publisher;
        this.description = description;
        this.originalDeveloper = originalDeveloper;
        this.originalGamesMachine = originalGamesMachine;
        this.yearOfFirstRelease = yearOfFirstRelease;
        this.coverArtURL = coverArtURL;
        this.gamePorts = new ScratchList<>();
    }

    //Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOriginalDeveloper() {
        return originalDeveloper;
    }

    public void setOriginalDeveloper(String originalDeveloper) {
        this.originalDeveloper = originalDeveloper;
    }

    public String getOriginalGamesMachine() {
        return originalGamesMachine;
    }

    public void setOriginalGamesMachine(String originalGamesMachine) {
        this.originalGamesMachine = originalGamesMachine;
    }
    public int getYearOfFirstRelease() {
        return yearOfFirstRelease;
    }

    public void setYearOfFirstRelease(int yearOfFirstRelease) {
        this.yearOfFirstRelease = yearOfFirstRelease;
    }

    public String getCoverArtURL() {
        return coverArtURL;
    }

    public void setCoverArtURL(String coverArtURL) {
        this.coverArtURL = coverArtURL;
    }

    public ScratchList<GamePort> getGamePorts() {
        return gamePorts;
    }

    public void setGamePorts(ScratchList<GamePort> gamePorts) {
        this.gamePorts = gamePorts;
    }

    // Method to add a new GamePort
    public void addGamePort(GamePort newGamePort) {
        gamePorts.addElement(newGamePort);
    }

    // Method to edit Game information
    public void editGame(Game updatedGame) {
        this.name = updatedGame.getName();
        this.publisher = updatedGame.getPublisher();
        this.description = updatedGame.getDescription();
        this.originalDeveloper = updatedGame.getOriginalDeveloper();
        this.originalGamesMachine = updatedGame.getOriginalGamesMachine();
        this.yearOfFirstRelease = updatedGame.getYearOfFirstRelease();
        this.coverArtURL = updatedGame.getCoverArtURL();
    }

    // Method to delete a specific GamePort
    public void deleteGamePort(GamePort gamePort) {
        gamePorts.removeElement(gamePort.getReleaseYear());
    }

    //Search & Filter
    public ScratchList<Game> searchGames(ScratchList<Game> games, String name, String publisher,
                                                String developer, String gamesMachine, int yearOfRelease) {
        ScratchList<Game> result = new ScratchList<>();

        for (Game game : games) {
            if ((name == null || game.getName().toLowerCase().contains(name.toLowerCase())) &&
                    (publisher == null || game.getPublisher().toLowerCase().contains(publisher.toLowerCase())) &&
                    (developer == null || game.getOriginalDeveloper().toLowerCase().contains(developer.toLowerCase())) &&
                    (gamesMachine == null || game.getOriginalGamesMachine().toLowerCase().contains(gamesMachine.toLowerCase())) &&
                    (yearOfRelease < 0 || game.getYearOfFirstRelease() == yearOfRelease))  {
                result.addElement(game);
            }
        }
        return result;
    }
}