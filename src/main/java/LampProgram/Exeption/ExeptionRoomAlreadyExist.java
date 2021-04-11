package LampProgram.Exeption;

import LampProgram.entity.Room;

import java.util.List;

public class ExeptionRoomAlreadyExist extends Exception {
    private String name;

    public ExeptionRoomAlreadyExist(String message, String num) {

        super(message);
        name = num;
    }
}