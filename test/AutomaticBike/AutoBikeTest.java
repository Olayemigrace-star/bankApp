//package AutomaticBike;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class AutoBikeTest {
//    @Test
//    public void bikeIsTurnedOnTest() {
//        //given
//        AutoBike bike = new AutoBike();
//        bike.bikeStatus();
//        bike.bikeIsOff();
//        //action
//        bike.bikeIsOn();
//        //assert
//        assertTrue(bike.bikeStatus());
//    }
//
//    @Test
//    public void whenbikeIsOnAndTurnedOffTest() {
//        //given
//        AutoBike bike = new AutoBike();
//        bike.bikeStatus();
//        bike.bikeIsOn();
//        //action
//        bike.bikeIsOff();
//        //assert
//        assertFalse(bike.bikeStatus());
//    }
//
//    @Test
//    public void whenbikeIsOnAndSpeedChangesFrom_15_ItIncreasesTo_16Test() {
//        //given
//        AutoBike bike = new AutoBike();
//        bike.bikeStatus();
//        bike.bikeIsOn();
//        //bike.setSpeed();
//        bike.accelerate(15);
//        bike.speed();
//        assertEquals(16, bike.speed());
//    }
//    @Test
//    public void whenbikeIsOnAndSpeedChangesFrom_24_ItIncreasesTo_26Test() {
//        //given
//        AutoBike bike = new AutoBike();
//        bike.bikeStatus();
//        bike.bikeIsOn();
//        bike.accelerate(24);
//        bike.speed();
//        assertEquals(26, bike.speed());
//    }
//    @Test
//    public void whenbikeIsOnAndSpeedChangesFrom_32_ItIncreasesTo_35Test() {
//        //given
//        AutoBike bike = new AutoBike();
//        bike.bikeStatus();
//        bike.bikeIsOn();
//        bike.accelerate(32);
//        bike.speed();
//        assertEquals(35, bike.speed());
//    }
//    @Test
//    public void whenbikeIsOnAndSpeedChangesFrom_50_ItIncreasesTo_54Test() {
//        //given
//        AutoBike bike = new AutoBike();
//        bike.bikeStatus();
//        bike.bikeIsOn();
//        bike.accelerate(50);
//        bike.speed();
//        assertEquals(54, bike.speed());
//    }
//    @Test
//    public void whenbikeIsOnAndSpeedDecreasesFrom15_ItIncreasesTo_14Test() {
//        //given
//        AutoBike bike = new AutoBike();
//        bike.bikeStatus();
//        bike.bikeIsOn();
//        bike.deccelerate(15);
//        bike.speed();
//        assertEquals(14, bike.speed());
//    }
//    @Test
//    public void whenbikeIsOnAndSpeedDecreasesFrom24_ItIncreasesTo_22Test() {
//        //given
//        AutoBike bike = new AutoBike();
//        bike.bikeStatus();
//        bike.bikeIsOn();
//        bike.deccelerate(24);
//        bike.speed();
//        assertEquals(22, bike.speed());
//    }
//    @Test
//    public void whenbikeIsOnAndSpeedDecreasesFrom35_ItIncreasesTo_32Test() {
//        //given
//        AutoBike bike = new AutoBike();
//        bike.bikeStatus();
//        bike.bikeIsOn();
//        bike.deccelerate(35);
//        bike.speed();
//        assertEquals(32, bike.speed());
//    }
//    @Test
//    public void whenbikeIsOnAndSpeedDecreasesFrom44_ItIncreasesTo_40Test() {
//        //given
//        AutoBike bike = new AutoBike();
//        bike.bikeStatus();
//        bike.bikeIsOn();
//        bike.deccelerate(44);
//        bike.speed();
//        assertEquals(40, bike.speed());
//    }
////    @Test
////    public void whenbikeIsOnAndSpeedChangesAutomaticallyFromGear_1To_2Test() {
////        //given
////        AutoBike bike = new AutoBike();
////        bike.bikeStatus();
////        bike.bikeIsOn();
////        //bike.setSpeed();
////        bike.accelerate();
////        bike.speed();
////        bike.bikeGear();
////        bike.bikeRange();
////        assertEquals(21, bike.speed());
////        assertEquals(2, bike.bikeRange());
////    }
//}
