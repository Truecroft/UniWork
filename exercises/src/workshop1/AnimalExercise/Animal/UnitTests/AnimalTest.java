package workshop1.AnimalExercise.Animal.UnitTests;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import workshop1.AnimalExercise.Animal.Animal;

public class AnimalTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void positiveLimbCountWithinUpperLimit() throws Exception{
        //Arrange
        Animal animal = new Animal();
        //Act
        animal.setLimbCount(4);
        //Assert
        assertEquals(4, animal.getLimbCount());
    }

    @Test
    public void colourIsCorrectlySet() {
        Animal animal = new Animal();
        animal.setColour("Black");
        assertEquals("Black", animal.getColour());
    }

    @Test
    public void nameIsCorrectlySet() {
        Animal animal = new Animal();
        animal.setName("Jack");
        assertEquals("Jack", animal.getName());
    }

    @Test
    public void exceptionThrownOnSettingANegativeNumberOfLimbs() throws Exception {
        Animal animal = new Animal();
        try {
            animal.setLimbCount(-5);
            fail("Anticipated Illegal Limb Exception");
        }
        catch (Exception e){

        }
    }

    @Test(expected = Exception.class)
    public void exceptionThrownOnSettingANegativeNumberOfLimbsNoMessage() throws Exception{
        Animal animal = new Animal();
        animal.setLimbCount(-5);
    }

    @After
    public void tearDown() throws Exception {
    }
}