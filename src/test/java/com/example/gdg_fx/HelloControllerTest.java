package com.example.gdg_fx;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {



    @Test
    void start() {
        HelloController helloController = new HelloController();
        helloController.boardGenerate();

    }

    @Test
    void setSize() {
        HelloController helloController = new HelloController();
        helloController.board.setSize(6);
        assertEquals(helloController.board.getSize(),6);

    }

    @Test
    void setName1() {
        HelloController helloController = new HelloController();
        helloController.player_1.setName("cc");
        assertEquals(helloController.player_1.name,"cc");
    }

    @Test
    void setName2() {
        HelloController helloController = new HelloController();
        helloController.player_2.setName("cc");
        assertEquals(helloController.player_2.name,"cc");
    }


    @Test
    void boardGenerate() {
        HelloController helloController = new HelloController();
        helloController.boardGenerate();
    }



    @Test
    void setPlayerPos() {

    }
}