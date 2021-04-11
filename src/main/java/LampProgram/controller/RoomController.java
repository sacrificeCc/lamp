package LampProgram.controller;

import LampProgram.Exeption.ExeptionRoomAlreadyExist;
import LampProgram.Repository.RoomRepositore;
import LampProgram.Service.RoomService;
import LampProgram.check.Checker;
import LampProgram.entity.Room;
import LampProgram.ip.Ip;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class RoomController {
    private final RoomRepositore roomRepositore;
    private final RoomService roomService;

    @PostMapping("/create")
    public String Roomcreate(@Valid @ModelAttribute Room rooms, HttpServletRequest request) throws IOException, ExeptionRoomAlreadyExist {

        return roomService.CreateRoom(rooms, request);
    }

    @GetMapping("/room/allroom")
    public String[] listrooM() {

        return roomService.AllRoom();
    }

    @GetMapping("/room/{id}")
    public String SerchRoom(@PathVariable int id) {
        System.out.println(id);
        return roomService.SerchRoom(id);
    }

    @GetMapping("/room/{id}/{status}")
    public String LightRoom(@PathVariable int id, @PathVariable int status) {
        return roomService.RoomStatus(id, status);
    }

}


