package ObjectsAndClassesExercise;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {
    int capacity;
    List<Pet> salon = new ArrayList<>();

    public GroomingSalon(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Pet> getSalon() {
        return salon;
    }

    public void setSalon(List<Pet> salon) {
        this.salon = salon;
    }

    public void add(Pet type) {
        if (salon.size() < capacity) {
            this.salon.add(type);
        }
    }

    public boolean remove(String name) {
        int index = -1;
        for (Pet pet : salon) {
            int currentIndex = 0;
            if (pet.name.equals(name) ){
                index = currentIndex;
            }
            currentIndex++;
        }
        if (index==-1){
            return false;
        }else {
            salon.remove(index);
            return true;
        }
    }

    public Pet getPet(String name, String owner) {
        Pet newPet = new Pet(name,-1,owner);
        for (Pet pet : salon) {
            if (pet.name.equals(name) && pet.owner.equals(owner)) {
                newPet.setAge(pet.age);
                newPet.setName(pet.name);
                newPet.setOwner(pet.owner);
            }
        }
        if (newPet.age==-1){
            return null;
        }else {
            return newPet;
        }
    }
    public Integer getCount (){
        return salon.size();
    }
    public String getStatistics(){
        String statistics = String.format("%n");
        for (Pet pet : salon) {
            statistics+= String.format("%s %s%n",pet.name,pet.owner);
        }
        return "The grooming salon has the following clients:"+statistics;

    }
}
