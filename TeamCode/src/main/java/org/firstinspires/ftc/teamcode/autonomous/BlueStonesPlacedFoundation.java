package org.firstinspires.ftc.teamcode.autonomous;

import org.firstinspires.ftc.teamcode.game.Alliance;


@com.qualcomm.robotcore.eventloop.opmode.Autonomous(name="Blue SP+F", group="Phoebe")
//@Disabled
public class BlueStonesPlacedFoundation extends AutonomousHelperStonesPlacedFoundation {

    @Override
    public void init() {

        super.init(Alliance.Color.BLUE);
    }
}