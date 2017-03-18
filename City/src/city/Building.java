/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author Maryna
 */


// Тесты:
// 1. Проверка добавленияч типа комнаты.
// 2. Проверка удаления комнат с количеством больше, чем было в здании.
// 3. Проверка добавленияч типа комнаты больше одного раза.
public class Building {
    private HashMap<String, Integer> rooms;
    private String name;
    
    public Building (String name) {
        rooms = new HashMap<String, Integer>();
        this.name = name;
    }
    
    public void AddRoom(String name, Integer quantity){
        if (rooms.containsKey(name)){
            rooms.replace(name, rooms.get(name) + quantity);
        } else {
            rooms.put(name, quantity);
        }
    }
    
    public void DeleteRoom (String name, Integer quantity){
        if (rooms.containsKey(name)){
            rooms.replace(name, rooms.get(name) - quantity);
            if (rooms.get(name) <= 0){
                rooms.remove(name);
            }
        }        
    }
    
    public HashMap<String, Integer> get_Rooms(){
        return rooms;
    }
    
    public Integer get_Room(String name){
        if (rooms.containsKey(name)){
            return rooms.get(name);
        }
        
        return 0;
    }
    
    public String get_Name(){
        return name;
    }
}
