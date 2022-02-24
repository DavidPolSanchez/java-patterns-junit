package com.example.structural.decoratorCustomized;

import com.example.structural.decoratorCustomized.decoradoresCustomized.EffectRetro;
import com.example.structural.decoratorCustomized.decoradoresCustomized.EffectVintage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test del patter Decorator")
class DecoratorPatternTest {

    @Nested
    @DisplayName("Test sobre DigitalPhoto")
    class DigitalPhotoTest{
        @Test
        @DisplayName("Test obtener una DigitalPhoto")
        void getDigitalPhotoTest() {
            Photo selfie = new DigitalPhoto();
            //assertNotNull(selfie);
            //assertInstanceOf(DigitalPhoto.class,selfie);
            //assertEquals("Normal photo without edit",selfie.show());
            assertAll(
                    ()->assertNotNull(selfie),
                    ()->assertInstanceOf(DigitalPhoto.class,selfie),
                    ()->assertEquals("Normal photo without edit",selfie.show())
            );


        }

        @Test
        @DisplayName("Test obtener coste de DigitalPhoto")
        void getCostDigitalPhotoTest() {
            Photo selfie = new DigitalPhoto();
            assertEquals(15,selfie.cost());
        }

    }

    @Nested
    @DisplayName("Test EffectRetro")
    class EffectRetroTest{
        @Test
        @DisplayName("Test aplicar EffectRetro a una DigitalPhoto")
        void getDigitalPhotoWithEffectRetroTest() {
            Photo selfie = new DigitalPhoto();
            /*Se mantienen estos test o no hacen falta por no testear esta funcionalidad en este caso?
                assertAll(
                    ()->assertNotNull(selfie),
                    ()->assertInstanceOf(DigitalPhoto.class,selfie),
                    ()->assertEquals("Normal photo without edit",selfie.show())
            );
            */

            Photo selfieRetro = new EffectRetro(selfie);
            String resultMsg=selfieRetro.show();
            assertAll(
                    ()->assertNotNull(selfieRetro),
                    ()->assertInstanceOf(EffectRetro.class,selfieRetro),
                    ()->assertTrue(resultMsg.contains("Retro")),
                    ()->assertEquals(50,selfieRetro.getBrightness()),//Duda ver por qué no se modifican las clases
                    ()->assertEquals(20,selfieRetro.getContrast())
            );
        }

        @Test
        @DisplayName("Test obtener coste de aplicar EffectRetro")
        void getCostApplyEffectRetroTest() {
            Photo selfie = new DigitalPhoto();
            double costeWithoutEffect = selfie.cost();
            Photo selfieRetro = new EffectRetro(selfie);
            selfieRetro.show();
            assertEquals(costeWithoutEffect+20,selfieRetro.cost());

        }

        @Test
        @DisplayName("Test aplicar EffectRetro a un null")
        void getNullWithEffectRetroTest() {
            assertThrows(IllegalArgumentException.class,()->new EffectRetro(null).show());
        }

    }

    @Nested
    @DisplayName("Test EffectVintage")
    class EffectVintageTest{
        @Test
        @DisplayName("Test aplicar EffectVintage a una DigitalPhoto")
        void getDigitalPhotoWithEffectVintageTest() {
            Photo selfie = new DigitalPhoto();
            /*Se mantienen estos test o no hacen falta por no testear esta funcionalidad en este caso?
                assertAll(
                    ()->assertNotNull(selfie),
                    ()->assertInstanceOf(DigitalPhoto.class,selfie),
                    ()->assertEquals("Normal photo without edit",selfie.show())
            );
            */

            Photo selfieVintage = new EffectVintage(selfie);
            String resultMsg=selfieVintage.show();
            assertAll(
                    ()->assertNotNull(selfieVintage),
                    ()->assertInstanceOf(EffectVintage.class,selfieVintage),
                    ()->assertTrue(resultMsg.contains("Vintage")),
                    ()->assertEquals(90,selfieVintage.getBrightness()),
                    ()->assertEquals(20,selfieVintage.getContrast()),
                    ()->assertEquals(5,selfieVintage.getBlur())

            );
        }

        @Test
        @DisplayName("Test obtener coste de aplicar EffectVintage")
        void getCostApplyEffectVintageTest() {
            Photo selfie = new DigitalPhoto();
            double costeWithoutEffect = selfie.cost();
            Photo selfieVintage = new EffectVintage(selfie);
            assertEquals(costeWithoutEffect+15,selfieVintage.cost());

        }

        @Test
        @DisplayName("Test aplicar EffectRetro a un null")
        void getNullWithEffectVintageTest() {
            assertThrows(IllegalArgumentException.class,()->new EffectVintage(null).show());
        }

    }

    @Nested
    @DisplayName("Test de foto retrovintage")
    class selfieRetroVintage{
        @Test
        @DisplayName("Test aplicar EffectRetroVintage a una DigitalPhoto")
        void getDigitalPhotoWithEffectRetroVintageTest() {
            Photo selfie = new DigitalPhoto();
            Photo selfieRetroVintage = new EffectRetro(new EffectVintage(selfie));
            /*Se mantienen estos test o no hacen falta por no testear esta funcionalidad en este caso?
                assertAll(
                    ()->assertNotNull(selfie),
                    ()->assertInstanceOf(DigitalPhoto.class,selfie),
                    ()->assertEquals("Normal photo without edit",selfie.show())
            );
            */

            String resultMsg=selfieRetroVintage.show();
            assertAll(
                    ()->assertNotNull(selfieRetroVintage),
                    ()->assertInstanceOf(EffectRetro.class,selfieRetroVintage),
                    ()->assertTrue(resultMsg.contains("Vintage")),
                    ()->assertTrue(resultMsg.contains("Retro")),
                    ()->assertEquals(90,selfieRetroVintage.getBrightness()),
                    ()->assertEquals(20,selfieRetroVintage.getContrast()),
                    ()->assertNull(selfieRetroVintage.getBlur())

            );
        }

    }


    @Nested
    @DisplayName("Test PhotoImpl para tener 100%")
    class PhotoImplTest{
        @Test
        void getSaturationTest() {
            Photo photo= new PhotoImpl();
            photo.setSaturation(100);
            assertEquals(100,photo.getSaturation());

        }
    }

}