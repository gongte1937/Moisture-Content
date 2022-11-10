package org.example;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// create some unit test
class MoistureContentTest {

    // Unit Test
    @Test
    void getMaterialWetMass() {
        MoistureContent m = new MoistureContent(10,40,33);
        assertEquals(30, m.materialWetMass());

        MoistureContent m1 = new MoistureContent(5,20,13);
        assertEquals(15, m1.materialWetMass());
    }

    @Test
    void getMaterialDryMass() {
        MoistureContent m = new MoistureContent(10,40,33);
        assertEquals(23, m.materialDryMass());

        MoistureContent m1 = new MoistureContent(5,20,13);
        assertEquals(8, m1.materialDryMass());
    }

    @Test
    void getWaterContent() {
        MoistureContent m = new MoistureContent(10,40,33);
        assertEquals(30, m.waterContent());

        MoistureContent m1 = new MoistureContent(5,20,13);
        assertEquals(88, m1.waterContent());
    }

}