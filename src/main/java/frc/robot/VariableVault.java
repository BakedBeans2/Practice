/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import sun.net.www.content.text.plain;

/**
 * The VariableVault class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All Variables should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * Variables are needed, to reduce verbosity.
 */
public final class VariableVault {
    //Intake variables
    public static final int kIntakeWristID = 6;
    public static final int kIntakeMotorID = 1;
    public static final int kModuleNumber = 1;
    public static final int kIntakeForwardChannel = 0;
    public static final int kIntakeReverseChannel = 1;

    //Climber variables
    public static final int kClimberMotorID = 0;

    public static final int kClimberUpperForwardChannel = 4;
    public static final int kClimberUpperReverseChannel = 5;
    public static final int kClimberLowerForwardChannel = 2;
    public static final int kClimberLowerReverseChannel = 3;

    //Drivetrain variables
    public static final int kLeftMasterMotorID = 1;
    public static final int kLeftSlaveMotorID = 3;
    public static final int kRightMasterMotorID = 0;
    public static final int kRightSlaveMotorID = 2;

    public static final int kDrivetrainForwardChannel = 1;
    public static final int kDrivetrainReverseChannel = 0;

    //Elevator variables
    public static final int kElevatorMotor = 5;
    public static final int kElevatorForwardChannel = 6;
    public static final int kElevatorReverseChannel = 7;
    //Vision variables

    //Joystick
    public static final int kJoystickID = 3;
    
}
