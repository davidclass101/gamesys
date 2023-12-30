package base.gamesys.models;

import base.gamesys.utils.ScratchList;

public class GameMachine {
    private String machineName;
    private String manufacturer;
    private String description;
    private String type;
    private String media;
    private int initialLaunchYear;
    private double initialRRP;
    private String imageUrl;

    // Constructor
    public GameMachine(String machineName, String manufacturer, String description, String type,
                       String media, int initialLaunchYear, double initialRRP, String imageUrl) {
        this.machineName = machineName;
        this.manufacturer = manufacturer;
        this.description = description;
        this.type = type;
        this.media = media;
        this.initialLaunchYear = initialLaunchYear;
        this.initialRRP = initialRRP;
        this.imageUrl = imageUrl;
    }

    // Getter methods
    public String getMachineName() {
        return machineName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public String getMedia() {
        return media;
    }

    public int getInitialLaunchYear() {
        return initialLaunchYear;
    }

    public double getInitialRRP() {
        return initialRRP;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    //add, edit and delete game machines
    public static void addGameMachine(ScratchList<GameMachine> gameMachineList, GameMachine newGameMachine) {
        gameMachineList.addElement(newGameMachine);
    }

    public static void editGameMachine(ScratchList<GameMachine> gameMachineList, int index, GameMachine updatedGameMachine) {
        if (gameMachineList.isValidIndex(index)) {
            gameMachineList.accessIndex(index).updateAttributes(updatedGameMachine);
        }
    }

    public static void deleteGameMachine(ScratchList<GameMachine> gameMachineList, int index) {
        if (gameMachineList.isValidIndex(index)) {
            gameMachineList.removeElement(index);
        }
    }

    //updateAttributes method
    private void updateAttributes(GameMachine updatedGameMachine) {
        this.machineName = updatedGameMachine.getMachineName();
        this.manufacturer = updatedGameMachine.getManufacturer();
        this.description = updatedGameMachine.getDescription();
        this.type = updatedGameMachine.getType();
        this.media = updatedGameMachine.getMedia();
        this.initialLaunchYear = updatedGameMachine.getInitialLaunchYear();
        this.initialRRP = updatedGameMachine.getInitialRRP();
        this.imageUrl = updatedGameMachine.getImageUrl();
    }

    // Method to search or filter game machines by name/title
    public static ScratchList<GameMachine> searchByName(ScratchList<GameMachine> gameMachines, String machineName) {
        ScratchList<GameMachine> result = new ScratchList<>();

        for (GameMachine gameMachine : gameMachines) {
            if (gameMachine.getMachineName().toLowerCase().contains(machineName.toLowerCase())) {
                result.addElement(gameMachine);
            }
        }
        return result;
    }


    // Method to search or filter game machines by type
    public static ScratchList<GameMachine> searchByType(ScratchList<GameMachine> gameMachines, String type) {
        ScratchList<GameMachine> result = new ScratchList<>();

        for (GameMachine gameMachine : gameMachines) {
            if (gameMachine.getType().equalsIgnoreCase(type)) {
                result.addElement(gameMachine);
            }
        }
        return result;
    }

    // Method to search or filter game machines by year
    public static ScratchList<GameMachine> searchByYear(ScratchList<GameMachine> gameMachines, int year) {
        ScratchList<GameMachine> result = new ScratchList<>();

        for (GameMachine gameMachine : gameMachines) {
            if (gameMachine.getInitialLaunchYear() == year) {
                result.addElement(gameMachine);
            }
        }
        return result;
    }

    // Method to search or filter game machines by manufacturer
    public static ScratchList<GameMachine> searchByManufacturer(ScratchList<GameMachine> gameMachines, String manufacturer) {
        ScratchList<GameMachine> result = new ScratchList<>();

        for (GameMachine gameMachine : gameMachines) {
            if (gameMachine.getManufacturer().equalsIgnoreCase(manufacturer)) {
                result.addElement(gameMachine);
            }
        }
        return result;
    }

    // Method to search or filter game machines by media
    public static ScratchList<GameMachine> searchByMedia(ScratchList<GameMachine> gameMachines, String media) {
        ScratchList<GameMachine> result = new ScratchList<>();

        for (GameMachine gameMachine : gameMachines) {
            if (gameMachine.getMedia().equalsIgnoreCase(media)) {
                result.addElement(gameMachine);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "GameMachine{" +
                "machineName='" + machineName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", media='" + media + '\'' +
                ", initialLaunchYear=" + initialLaunchYear +
                ", initialRRP=" + initialRRP +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}


