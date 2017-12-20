package org.firstinspires.ftc.robotcontroller.internal;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by Aawon on 12/20/2017.
 */

@TeleOp(name = "Senior Team", group = "First")

public class Senior_team extends OpMode {

    DcMotor Motor_1;
    DcMotor Motor_2;

    DcMotor Motor_3;
    DcMotor Motor_4;

    DcMotor Lift_Motor;
    DcMotor Extention;

    Servo Claw_1;
    Servo Claw_2;

    @Override
    public void init() {
        Motor_1 = hardwareMap.dcMotor.get("Motor_1");
        Motor_2 = hardwareMap.dcMotor.get("Motor_2");

        Motor_3 = hardwareMap.dcMotor.get("Motor_3");
        Motor_4 = hardwareMap.dcMotor.get("Motor_4");

        Lift_Motor = hardwareMap.dcMotor.get("Lift_Motor");

        Extention = hardwareMap.dcMotor.get("Extention");

        Claw_1 = hardwareMap.servo.get("Claw_1");
        Claw_2 = hardwareMap.servo.get("Claw_2");

        Motor_1.setPower(1.0);
        Motor_2.setPower(1.0);
        Motor_3.setPower(1.0);
        Motor_4.setPower(1.0);

        Motor_1.setDirection(DcMotorSimple.Direction.REVERSE);
    }
    @Override
    public void loop() {
        if (gamepad1.y){
            Claw_1.setPosition(1);
            Claw_2.setPosition(1);
        } else  {
            Claw_1.setPosition(0);
            Claw_2.setPosition(0);

        }


    }
}
