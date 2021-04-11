package LampProgram.Service;

import LampProgram.Exeption.ExeptionNoStatusLight;
import LampProgram.Exeption.ExeptionRoomAlreadyExist;
import LampProgram.Repository.RoomRepositore;
import LampProgram.check.Checker;
import LampProgram.check.LightControl;
import LampProgram.entity.Room;
import LampProgram.ip.Ip;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Service
@RequiredArgsConstructor
public class RoomServiceClass implements RoomService {
    private final RoomRepositore roomRepositore;

    @Override
    public String RoomStatus(int id, int sttus) {
        try {
            Room room = roomRepositore.findAllById(id);
            room.setLight(LightControl.Control(sttus, room.isLight()));
            roomRepositore.save(room);
            return room.toString();
        } catch (ExeptionNoStatusLight ex) {
            System.out.println(ex);
            return "/errorstatus";
        }
    }

    @Override
    public String CreateRoom(Room name, HttpServletRequest request) throws IOException {
        try {

            Checker.ckeckRoom(name, roomRepositore.findAll());
            name.setCountry(Ip.chek(request.getRemoteAddr()));
            roomRepositore.save(name);
        } catch (ExeptionRoomAlreadyExist ex) {
            System.out.println(ex);
            return "/error";
        }
        return "/exelent";
    }

    @Override
    public String SerchRoom(int id) {
        Room room = roomRepositore.findAllById(id);
        return room.toString();
    }

    @Override
    //поправить вывод
    public String[] AllRoom() {
        String[] allroom = roomRepositore.findAll().toString().split("}");
        return allroom;
    }
}







