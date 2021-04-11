package LampProgram.check;

import LampProgram.Exeption.ExeptionNoStatusLight;

public class LightControl {

    public static boolean Control(int status, boolean hh) throws ExeptionNoStatusLight {
        boolean st = hh;
        if (!(status == 1 || status == 0)) throw new ExeptionNoStatusLight("несуществующее состояние света");
        switch (status) {
            case 0:
                st = false;
                break;
            case 1:
                st = true;
                break;

        }
        return st;
    }
}
