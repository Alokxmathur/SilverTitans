package org.firstinspires.ftc.teamcode.autonomous;

import org.firstinspires.ftc.teamcode.game.Alliance;

@com.qualcomm.robotcore.eventloop.opmode.Autonomous(name="Red SD", group="Phoebe")
//@Disabled
public class RedStones extends AutonomousHelperStones {

    @Override
    public void init() {
        super.init(Alliance.Color.RED);
    }
}