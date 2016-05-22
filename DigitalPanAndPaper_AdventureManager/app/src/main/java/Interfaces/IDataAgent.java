package Interfaces;


import android.content.Context;

import java.util.ArrayList;

import Data.Character;

/**
 * Created by Dimas on 04-May-16.
 */
public interface IDataAgent {
    /**
     * Gets a character by her name
      * @param name Characters name
     * @return Character model
     */
    Character getCharByName(String name);

    /**
     * Gets all characters from the user
     * @return Arraylist of character models
     */
    ArrayList<Character> getAllCharsByUser();

    /**
     * Deletes character from a user
     * @param username The username
     * @param charName The characters name
     */
    void deleteCharFromUser(String username,String charName);

    /**
     * Insert or update character of a user
     * @param username The username
     * @param character The character to insert or update
     */
    void updateOrInsertCharOfUser(String username,Character character);

    /**
     * Saves a local temp character
     * @param character the character
     */
    void setLocalTemporaryCharacter(Character character);

    /**
     * Gets the local temp character or null if not exists
     * @return Temp character saved by setLocalTemporaryCharacter()
     */
    Character getLocalTemporaryCharacter();
}
