package LampProgram.Service;

import LampProgram.Exeption.ExeptionRoomAlreadyExist;
import LampProgram.Repository.RoomRepositore;
import LampProgram.entity.Room;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

public interface RoomService {

    //изменение состояния лампочки
String  RoomStatus(int id,int sttus);
    //создание комнаты
String CreateRoom(Room country, HttpServletRequest request) throws IOException, ExeptionRoomAlreadyExist;
    //поиск комнаты
String SerchRoom(int id);
    //список всех комнат
 String[] AllRoom();

}
