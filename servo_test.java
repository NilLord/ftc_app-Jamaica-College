package org.firstinspires.ftc.robotcontroller.internal;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by Administrator on 11/16/2017.
 */
@TeleOp(name = "Servo test", group = "Test")
public class servo_test extends OpMode {
    Servo Test_1;
    Servo Test_2;

    @Override
    public void init() {
        Test_1 = hardwareMap.servo.get("Test_1");
        Test_2= hardwareMap.servo.get("Test_2");
    }

    @Override
    public void loop() {
        if (gamepad1.x) {
            Test_1.setPosition(1);
            Test_2.setPosition(1);
        } else {
            Test_1.setPosition(0);
            Test_2.setPosition(0);
        }



    }
}
