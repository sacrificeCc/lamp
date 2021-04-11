package LampProgram.Repository;

import LampProgram.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface RoomRepositore extends JpaRepository<Room, RoomRepositore> {
    Room findAllById(int id);
}
