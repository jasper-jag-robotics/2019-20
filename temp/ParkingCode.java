package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
@Autonomous(name = "ParkingAuto")
public class ParkingCode extends LinearOpMode {

    public DcMotor frontLeft;
    public DcMotor frontRight;
    public DcMotor backLeft;
    public DcMotor backRight;
    public DcMotor armMotor;
    public DcMotor autoArm;
    public Servo servoGrip;

    public void runOpMode() throws InterruptedException{

        frontLeft = hardwareMap.get(DcMotor.class, "Front_Left");
        frontRight = hardwareMap.get(DcMotor.class, "Front_Right");
        backLeft = hardwareMap.get(DcMotor.class, "Back_Left");
        backRight = hardwareMap.get(DcMotor.class, "Back_Right");
        armMotor = hardwareMap.get(DcMotor.class, "Arm_Motor");
        autoArm = hardwareMap.get(DcMotor.class, "Auto_Arm");
        servoGrip = hardwareMap.get(Servo.class, "Servo_Grip");

        frontRight.setDirection(DcMotor.Direction.REVERSE);
        backRight.setDirection(DcMotor.Direction.REVERSE);

        frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        frontLeft.setTargetPosition(174);
        frontLeft.setPower(1);
        frontRight.setTargetPosition(174);
        frontRight.setPower(1);
        backLeft.setTargetPosition(174);
        backLeft.setPower(1);
        backRight.setTargetPosition(174);
        backRight.setPower(1);

        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        frontLeft.setPower(0);
        frontRight.setPower(0);
        backLeft.setPower(0);
        backRight.setPower(0);

    }
}
