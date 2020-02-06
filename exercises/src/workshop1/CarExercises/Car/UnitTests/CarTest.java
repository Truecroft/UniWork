package workshop1.CarExercises.Car.UnitTests;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import workshop1.CarExercises.Car.Car;

public class CarTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testSetLengthHappyPath() throws Exception {
        Car car = new Car();
        car.setLength(1.6);
        assertEquals(1.6, car.getLength(), 0);
    }

    @Test(expected = Exception.class)
    public void testSetLengthTooSmall() throws Exception {
        Car car = new Car();
        car.setLength(-1);
    }

    @Test(expected = Exception.class)
    public void testSetLengthTooBig() throws Exception {
        Car car = new Car();
        car.setLength(100);
    }

    @Test
    public void testSetDoorCountHappyPath() throws Exception {
        Car car = new Car();
        car.setDoorCount(3);
        assertEquals(3 ,car.getDoorCount());
    }

    @Test(expected = Exception.class)
    public void testSetDoorCountTooSmall() throws Exception {
        Car car = new Car();
        car.setDoorCount(-1);
    }

    @Test(expected = Exception.class)
    public void testSetDoorCountTooBig() throws Exception {
        Car car = new Car();
        car.setLength(100);
    }

    @Test
    public void testSetEngineSizeHappyPath() throws Exception {
        Car car = new Car();
        car.setEngineSize("5.5L");
        assertEquals("5.5L", car.getEngineSize());
    }

    @Test
    public void testSetMakeHappyPath() throws Exception {
        Car car = new Car();
        car.setMake("Volvo");
        assertEquals("Volvo", car.getMake());
    }


    @After
    public void tearDown() throws Exception {
    }
}