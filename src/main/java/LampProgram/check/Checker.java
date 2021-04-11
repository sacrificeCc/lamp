package LampProgram.check;

import LampProgram.Exeption.ExeptionRoomAlreadyExist;
import LampProgram.entity.Room;


import java.util.List;

public class Checker {

    public boolean ck;

    public static void ckeckRoom(Room Rooms, List<Room> RoomList) throws ExeptionRoomAlreadyExist {
        boolean ck = true;


        for (int i = 0; i < RoomList.size(); i++) {
            if (Rooms.getName().equals(RoomList.get(i).getName()))
                throw new ExeptionRoomAlreadyExist("комната с данным именем уже существует", Rooms.getName());


        }


    }
}
