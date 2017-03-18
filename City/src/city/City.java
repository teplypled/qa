/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city;

/**
 *
 * @author Maryna
 */
public class City {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Building[] buildings = new Building[3];
        Building house = new Building("Private house");
        house.AddRoom("Kitchen", 1);
        house.AddRoom("Living", 1);
        house.AddRoom("Bedroom", 3);
        house.AddRoom("Bathroom", 2);
        buildings[0] = house;
        
        Building apartment = new Building("Apartments");
        apartment.AddRoom("Kitchen", 10);
        apartment.AddRoom("Living", 5);
        apartment.AddRoom("Bedroom", 20);
        apartment.AddRoom("Bathroom", 13);
        buildings[1] = apartment;

        Building school = new Building("School");
        school.AddRoom("Classroom", 10);
        school.AddRoom("TeachersRoom", 2);
        school.AddRoom("Gym", 2);
        school.AddRoom("Bathroom", 5);
        buildings[2] = school;
        
        System.out.println("Number of kitchens in house:" + house.get_Room("Kitchen"));
        System.out.println("Bathrooms in buildings");
        for(int i = 0; i < buildings.length; i++){
            System.out.println("Building " + buildings[i].get_Name() + ", Bathrooms: " + buildings[i].get_Room("Bathroom"));
        }
        
        System.out.println("Living room in buildings");
        for(int i = 0; i < buildings.length; i++){
            System.out.println("Building " + buildings[i].get_Name() + ", Living rooms: " + buildings[i].get_Room("Living"));
        }
    }
}
