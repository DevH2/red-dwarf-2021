// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final int LEFT_FRONT_MOTOR_CAN_ID  = 0;
    public static final int LEFT_REAR_MOTOR_CAN_ID  = 1;
    public static final int RIGHT_FRONT_MOTOR_CAN_ID  = 2;
    public static final int RIGHT_REAR_MOTOR_CAN_ID = 3;

    public static final int LEFT_JOY_AXIS = 1;
    public static final int RIGHT_JOY_AXIS = 5;

    public static final int ARM_MOTOR_CAN_ID = 4;

    public static final int GYRO_ANALOG_INPUT = 0;
    public static final int DISTANCE_SENSOR_PING = 0;
    public static final int DISTANCE_SENSOR_ECHO = 1;
    public static final int LIMIT_SWITCH_DIO = 0;

    public static final double AUTONOMOUS_SPIN_SPEED = 0.5;

    public static final double ARM_UP_SPEED = 0.5;
    public static final double ARM_DOWN_SPEED = -0.4;

    public static final int LEFT_JOY_USB_PORT = 0;
    public static final int RIGHT_JOY_USB_PORT = 1;

    public static final int LEFT_JOY_BUTTON_WIGGLE_ARM = 6;
    public static final int LEFT_JOY_BUTTON_SPIN = 7;
    public static final int RIGHT_JOY_BUTTON_DRIVE_CIRCLE = 6;
    public static final int RIGHT_JOY_BUTTON_GO_BACK_AND_FORTH = 7;
}
