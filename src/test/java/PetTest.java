import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Dragon;
import io.zipcoder.pets.Pet;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetTest {

    @Test
    public void dogSpeakTest() {
        Pet pet = new Dog("Bear");
        assertEquals("Dog says Woof", "Woof!",pet.speak());
    }

    @Test
    public void catSpeakTest() {
        Pet pet = new Cat("Tiger");
        assertEquals("Dog says Woof", "Meow!",pet.speak());
    }

    @Test
    public void dragonSpeakTest() {
        Pet pet = new Dragon("Puff");
        assertEquals("Dog says Woof", "Raaawwwwrrr",pet.speak());
    }

    @Test
    public void setNameTest() {
        Pet pet = new Dragon("Puff");
        pet.setName("Puff");
        assertEquals("set name to puff", "Puff", pet.getName());
    }

}
