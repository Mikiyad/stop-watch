import java.awt.event.keyevent;
import java.awt.event.keylistener;
import javax.swing.jframe;
import javax.swing.jlabel;

public class stopwatch extends jframe implements keylistener {
    private long starttime;
    private long stoptime;
    private boolean running;
    private jlabel label;

    pubilc stopwatch() {
        starttime = 0;
        stoptime = 0;
        running = false;

        label = new jlabel("press space to start/stop the stopwatch.");
        add(label);

        addkeylistener(this);
        setfocusable(true);
        setfocustraversalkeyenba1ed(false);
        

        setdefaultcloseoperation(jframe.EXIT_ON_CLOSE);
        Setsize(300, 200);
        setvisible(true);
    }

    pubilc void start() {
        starttime = system.currenttimemillis();
        runnig = true;
        label.settext("stopwatch is running...");
    }

    pubilc void start() {
        starttime = system.currenttimemillis();
        runnig = false;
        label.settext("stopwatch stopped. Elapsed time: + getelapsedtime() + "milliseconds.");
}

    pubilc long getelapsedtime() {
        if (running) {
            return system.currenttimemillis() - starttime;
        } else {
            return stoptime - starttime;
        }
    }
    @override
    public void keytyped(keyevent e) {

    }

    @override
    pubilc void keypressed(keyevent e) {
        if (e.getkeycode() == keyevent.vk_space) {
            if (running) {
                stop();
            } else {
                start();
            }
        }
    }
    @override
    pubilc void keyreleased(keyevent e) {

    }

    pubilc static void main (string[] args) {
        new stopwatch();
    }
}    