/**
 * Jimmy Huynh
 * January 25, 2019
 * ICS 3U - ISU [2019]
 * A program which is intended to teach the user about computer hardware.
 */

import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {

        //Declaration statements for the entire project.
        Scanner inputInt = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);
        int exit, points = 0, menuSelect=1, luck;
        int choiceMemory=1, choiceDisk=1, choiceCD=1, choiceBIOS=1, choiceBurner=1;
        int choicePiracy=1, choiceHelp=1, choiceLuck;
        boolean compMemQuiz=false, diskQuiz=false, cdQuiz=false, biosQuiz=false;
        boolean burnerQuiz=false, piracyQuiz=false;
        boolean piracyOverride=false, bypassPrompt=false;
        String q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,q11,q12,q13,q14,q15,q16,q17,q18;
        String bypass="", redeemPoints;
        final String BYPASS_CODE = "ICS3U1";

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println(" \uD83D\uDCDA\uD83D\uDCBB Computer Basics for Dummies \uD83D\uDCBB\uD83D\uDCDA");
        System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

        System.out.println("              ,---------------------------,\n" +
                "              |  /---------------------\\  |\n" +
                "              | |                       | |\n" +
                "              | |       Computer        | |\n" +
                "              | |        Basics         | |\n" +
                "              | |         for           | |\n" +
                "              | |       Dummies         | |\n"+
                "              | |                       | |\n" +
                "              |  \\_____________________/  |\n" +
                "              |___________________________|\n" +
                "            ,---\\_____     []     _______/------,\n" +
                "          /         /______________\\           /|\n" +
                "        /___________________________________ /  | ___\n" +
                "        |                                   |   |    )\n" +
                "        |  _ _ _                 [-------]  |   |   (\n" +
                "        |  o o o                 [-------]  |  /    _)_\n" +
                "        |__________________________________ |/     /  /\n" +
                "    /-------------------------------------/|      ( )/\n" +
                "  /-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/ /\n" +
                "/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/ /\n" +
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Welcome to Computer Basics for Dummies. " +
                "This application will teach you the basics of computer " +
                "hardware with lessons and small quizzes.");

        System.out.print("Enter 0 to start and -1 to exit: ");
        exit = inputInt.nextInt();
        System.out.println();

        while (exit !=0 && exit !=-1)
        {
            System.out.println("Please enter a valid number.");
            System.out.println("");
            System.out.print("Enter 0 to start and -1 to exit: ");
            exit = inputInt.nextInt();
        }
        //Main Menu
        while (exit == 0)
        {
            while (menuSelect>=1 && menuSelect<=7)
            {
                System.out.format("%-30s %20s", "【Main Menu】", "Points: " + points + "\n");
                System.out.println("--------------------------------------------------------");
                System.out.println("1. Computer Memory ");
                System.out.println("2. Hard Disk/Floppy Disk ");
                System.out.println("3. CDs ");
                System.out.println("4. BIOS ");
                System.out.println("5. CD-Burners ");
                if (points >= 12 || piracyOverride==true)
                    System.out.println("6. Piracy ☠️");
                else
                    System.out.println("6. UNLOCK AT 12 POINTS.");
                System.out.println("7. Help");

                //Bypass for the Piracy Quiz, if the user cannot get enough points.

                if (points < 12 && compMemQuiz==true && biosQuiz==true && burnerQuiz==true && cdQuiz==true
                && diskQuiz==true && piracyQuiz==false && bypassPrompt==false)
                {
                    while (!(bypass.trim().equalsIgnoreCase("yes")) &&
                            !(bypass.trim().equalsIgnoreCase("no")))
                    {
                        System.out.println("\nIt looks like you do not have enough points for the last game mode, but " +
                                "you can play if you enter the bypass code found in the game manual.");
                        System.out.println("If you would like to enter the code, type \"yes\", if not, type \"no\".");
                        bypass = inputStr.nextLine();
                    }

                    if (bypass.trim().equalsIgnoreCase("yes"))
                    {
                        System.out.println("Enter your code here (ONLY 1 ATTEMPT): ");
                        bypass = inputStr.nextLine();

                        if (bypass.trim().equalsIgnoreCase(BYPASS_CODE))
                            piracyOverride= true;
                        else
                            System.out.println("Wrong code.");
                    }
                    else
                        bypassPrompt= true;

                    System.out.println("--------------------------------------------------------");

                    //Redisplay main menu after the user is finished with the piracy bypass prompt.
                    System.out.format("%-30s %20s", "【Main Menu】", "Points: " + points + "\n");
                    System.out.println("--------------------------------------------------------");
                    System.out.println("1. Computer Memory ");
                    System.out.println("2. Hard Disk/Floppy Disk ");
                    System.out.println("3. CDs ");
                    System.out.println("4. BIOS ");
                    System.out.println("5. CD-Burners ");
                    if (points >= 12 || piracyOverride==true)
                        System.out.println("6. Piracy ☠️");
                    else
                        System.out.println("6. UNLOCK AT 12 POINTS.");
                    System.out.println("7. Help");
                }

                System.out.println("Enter anything other than 1-7 to exit.");
                System.out.print("Please choose a topic and enter its number: ");
                menuSelect = inputInt.nextInt();
                System.out.println("--------------------------------------------------------");

                //Topic Menu: Computer Memory
                while (menuSelect == 1 && (choiceMemory==1||choiceMemory==2))
                {
                    System.out.format("%-30s %20s", "「COMPUTER MEMORY」", "Points: " + points + "\n");
                    System.out.println("--------------------------------------------------------");
                    System.out.println("◈◈ What would you like to do? ◈◈\n");
                    System.out.println("1. Learn the lesson.");
                    System.out.println("2. Take the quiz!");
                    System.out.println("3. Exit to the main menu. (Enter any number other than 1 or 2.)");
                    System.out.print("Please enter the number of your choice: ");
                    choiceMemory=inputInt.nextInt();
                    System.out.println("--------------------------------------------------------");

                    //Lesson: Computer Memory
                    if (choiceMemory==1)
                    {
                        System.out.format("%-30s %20s", "「COMPUTER MEMORY」", "Points: " + points + "\n");
                        System.out.println("--------------------------------------------------------");
                        System.out.println("◈◈ Lesson ◈◈\n");
                        System.out.println("Many electronics today have different forms of memory, and " +
                                "the computer you sit at to use this application has memory as well. " +
                                "Notable types of memories within the computer can be defined below:\n");

                        System.out.format("%-40s %60s", "Type of Memory", "Function\n");
                        System.out.format("%-40s %60s", "RAM (Random Access Memory)","Temporarily stores " +
                                "data from the\n");
                        System.out.format("%-40s %60s", "","computer that is used for processing. It\n");
                        System.out.format("%-40s %60s", "", "loses all data when the computer is off\n");
                        System.out.format("%-40s %60s", "", "and is upgradable.\n\n");

                        System.out.format("%-40s %60s", "ROM (Read Only Memory)","A long-term storage of memory which\n");
                        System.out.format("%-40s %60s","","is slower and integrated onto the\n");
                        System.out.format("%-40s %60s","","computer's motherboard. This is not\n");
                        System.out.format("%-40s %60s","","upgradable and is programmed with\n");
                        System.out.format("%-40s %60s","","firmware.\n\n");

                        System.out.format("%-40s %60s", "BIOS Chip (Basic Input/Output System)","Using flash memory, " +
                                "which has no\n");
                        System.out.format("%-40s %60s","","moving parts, it makes sure that all\n");
                        System.out.format("%-40s %60s","","other chips, hard drives, and ports can\n");
                        System.out.format("%-40s %60s","","function together. Note: there is a\n");
                        System.out.format("%-40s %60s","","hardware and software function of\n");
                        System.out.format("%-40s %60s","","BIOS. In some cases, BIOS and ROM are\n");
                        System.out.format("%-40s %60s","","used interchangeably as ROM is a type\n");
                        System.out.format("%-40s %60s","","of flash memory BIOS is stored on.\n\n");

                        System.out.println("These 3 types of memories can come into play during a typical" +
                                " boot sequence:");
                        System.out.println("1. The computer turns on.");
                        System.out.println("2. The ROM performs a power-on self-test, " +
                                "checking major components of the computer. This can be performed by the " +
                                "BIOS stored as ROM.");
                        System.out.println("3. BIOS is then loaded and provides information " +
                                "on and recognizes devices.");
                        System.out.println("4. The operation system (OS) is then loaded on to the RAM " +
                                "from a hard drive, allowing the processor immediate access to the OS.\n");

                        System.out.println("RAM can be sold with high clock cycles, working fast to send " +
                                "and receive data to and from the processor, however, RAM doesn’t " +
                                "usually operate at optimum speed. Latency is the process which " +
                                "bottlenecks the speed of the RAM. Latency is the time it takes to " +
                                "read information, which can slow down the RAM. To compensate for " +
                                "latency, CPUs use burst mode. This is a technique of reading data " +
                                "in bursts to allow for a faster read of data on the bits after the " +
                                "first one. The first one still suffers the reduced speed due to " +
                                "latency, however, burst mode can increase the performance of RAM.\n");

                        System.out.print("Enter any character to return to the computer memory menu: ");
                        inputStr.nextLine();
                        System.out.println("--------------------------------------------------------");
                    }

                    //Quiz: Computer Memory
                    else if(choiceMemory==2 && compMemQuiz==false)
                    {
                        System.out.format("%-30s %20s", "「COMPUTER MEMORY」", "Points: " + points + "\n");
                        System.out.println("--------------------------------------------------------");
                        System.out.println("◈◈ Quiz ◈◈");
                        System.out.println("1. During a boot sequence, what performs a power-on self-test?");
                        System.out.println("\t a. RAM");
                        System.out.println("\t b. ROM");
                        System.out.println("\t c. CD drive");
                        System.out.println("\t d. BLT");
                        System.out.print("Type in the answer: ");
                        q1 = inputStr.nextLine();

                        if (q1.trim().equalsIgnoreCase("ROM") || q1.trim().equalsIgnoreCase("b"))
                        {
                            System.out.println("✔️ Correct!");
                            points++;
                            System.out.println("👍 POINTS INCREASE BY 1.");
                        }
                        else
                        {
                            System.out.println("✖️ Incorrect.");
                            System.out.println("The correct answer was ROM.");
                        }
                        System.out.println("--------------------------------------------------------");

                        System.out.format("%-30s %20s", "「COMPUTER MEMORY」", "Points: " + points + "\n");
                        System.out.println("--------------------------------------------------------");
                        System.out.println("◈◈ Quiz ◈◈");
                        System.out.println("2. Which of these types of storage lose their memory " +
                                "once the computer is shut off?");
                        System.out.println("\t a. Random access memory");
                        System.out.println("\t b. Read only memory");
                        System.out.println("\t c. BIOS chip");
                        System.out.println("\t d. Operating System");
                        System.out.print("Type in the answer: ");
                        q2 = inputStr.nextLine();

                        if (q2.trim().equalsIgnoreCase("Random access memory") ||
                            q2.trim().equalsIgnoreCase("a"))
                        {
                            System.out.println("✔️ Correct!");
                            points++;
                            System.out.println("👍 POINTS INCREASE BY 1.");
                        } else
                        {
                            System.out.println("✖️ Incorrect.");
                            System.out.println("RAM loses its storage of memory when " +
                                    "the computer is off.");
                        }
                        System.out.println("--------------------------------------------------------");

                        System.out.format("%-30s %20s", "「COMPUTER MEMORY」", "Points: " + points + "\n");
                        System.out.println("--------------------------------------------------------");
                        System.out.println("◈◈ Quiz ◈◈");
                        System.out.println("3. What process lowers the speed of RAM?");
                        System.out.println("\t a. Slow Down Mode");
                        System.out.println("\t b. Latency");
                        System.out.println("\t c. Burst Mode");
                        System.out.println("\t d. Clock Cycle");
                        System.out.print("Type in the answer: ");
                        q3 = inputStr.nextLine();

                        if (q3.trim().equalsIgnoreCase("Latency")
                            || q3.trim().equalsIgnoreCase("b"))
                        {
                            System.out.println("✔️ Correct!");
                            points++;
                            System.out.println("👍 POINTS INCREASE BY 1.");
                        } else
                        {
                            System.out.println("✖️ Incorrect.");
                            System.out.println("Latency slows down RAM speed.");
                        }
                        System.out.println("--------------------------------------------------------");

                        compMemQuiz = true;
                    }

                    else if(choiceMemory==2 && compMemQuiz==true)
                        System.out.println("You have already done this quiz.\n");

                }

                // Topic Menu: Hard Disk/Floppy Disk
                while (menuSelect==2 && (choiceDisk==1 || choiceDisk==2))
                {
                    System.out.format("%-30s %20s", "「HARD DISK/FLOPPY DISK」", "Points: " + points + "\n");
                    System.out.println("--------------------------------------------------------");
                    System.out.println("◈◈ What would you like to do? ◈◈\n");
                    System.out.println("1. Learn the lesson.");
                    System.out.println("2. Take the quiz!");
                    System.out.println("3. Exit to the main menu. (Enter any number other than 1 or 2.)");
                    System.out.print("Please enter the number of your choice: ");
                    choiceDisk= inputInt.nextInt();
                    System.out.println("--------------------------------------------------------");

                    //Lesson: Hard Disk/Floppy Disk
                    if (choiceDisk==1)
                    {
                        System.out.format("%-30s %20s", "「HARD DISK/FLOPPY DISK」", "Points: " + points + "\n");
                        System.out.println("--------------------------------------------------------");
                        System.out.println("◈◈ Lesson ◈◈\n");
                        System.out.println(" _________________\n" +
                                "| | ___________ |o|\n" +
                                "| | ___________ | |\n" +
                                "| | ___________ | |\n" +
                                "| | ___________ | |\n" +
                                "| |_____________| |\n" +
                                "|     _______     |\n" +
                                "|    |       |   ||\n" +
                                "| DD |       |   V|\n" +
                                "|____|_______|____|");
                        System.out.println("Hard disks and floppy disks are used as forms of media storage. \n");
                        System.out.println("Hard disks are made up of hard platters and an arm with a read/write head. " +
                                "The platters, which are in the shape of a disc, spin at high speeds during " +
                                "operation and are the part of the drive which holds the data. The arm with " +
                                "the read/write head is responsible for moving up and down the platter (towards " +
                                "the edges) which is spinning to find a specified location where data is either " +
                                "read/written.\n");
                        System.out.println("Floppy disks are made up of a flexible plastic coated in iron oxide " +
                                "in a disk shape. Unlike hard drives, floppy disks rely on the drive to read/write " +
                                "onto the disk as well as spin the disk. It has two read/write heads, one on each " +
                                "side. It has a drive motor to spin the disk and a stepper motor to move " +
                                "the read/write head to the proper track position (concentric ring of data on a side " +
                                "of a disk).\n ");
                        System.out.println("To measure the performance of a hard disk, one component which could be " +
                                "measured is its data rate. Data rate refers to the number of bytes per second that " +
                                "can be delivered to the CPU (central processing unit). Another component is seek time." +
                                " Seek time refers to the amount of time between a request of a file from " +
                                "the processing unit to the time in which the first byte of the file is " +
                                "sent to the CPU.\n");

                        System.out.print("Enter any character to return to the hard disk/floppy disk menu: ");
                        inputStr.nextLine();
                        System.out.println("--------------------------------------------------------");
                    }

                    //Quiz: Hard Disk/Floppy Disk
                    else if (choiceDisk == 2 && diskQuiz==false)
                    {
                        System.out.format("%-30s %20s", "「HARD DISK/FLOPPY DISK」", "Points: " + points + "\n");
                        System.out.println("--------------------------------------------------------");
                        System.out.println("◈◈ Quiz ◈◈");
                        System.out.println("1. What are the two main parts of a hard drive?");
                        System.out.println("\t a. Data rate and seek time");
                        System.out.println("\t b. Drive motor and stepper motor");
                        System.out.println("\t c. Disk and magnet");
                        System.out.println("\t d. Platter and arm");
                        System.out.print("Type in the answer: ");
                        q4 = inputStr.nextLine();

                        if (q4.trim().equalsIgnoreCase("Platter and arm")
                            || q4.trim().equalsIgnoreCase("d"))
                        {
                            System.out.println("✔️ Correct!");
                            points++;
                            System.out.println("👍 POINTS INCREASE BY 1.");
                        }
                        else
                        {
                            System.out.println("✖️ Incorrect.");
                            System.out.println("The main parts of a hard drive are the platter and the arm.");
                        }
                        System.out.println("--------------------------------------------------------");

                        System.out.format("%-30s %20s", "「HARD DISK/FLOPPY DISK」", "Points: " + points + "\n");
                        System.out.println("--------------------------------------------------------");
                        System.out.println("◈◈ Quiz ◈◈");
                        System.out.println("2. Fill in the blank:\n" +
                                "The _ _ _ _ _ motor spins the disk in a floppy disk drive.");
                        System.out.print("Type in the answer: ");
                        q5 = inputStr.nextLine();

                        if (q5.trim().equalsIgnoreCase("drive")
                        || q5.trim().equalsIgnoreCase("d r i v e"))
                        {
                            System.out.println("✔️ Correct!");
                            points++;
                            System.out.println("👍 POINTS INCREASE BY 1.");
                        }
                        else
                        {
                            System.out.println("✖️ Incorrect.");
                            System.out.println("The drive motor spins the disk in a floppy disk.");
                        }
                        System.out.println("--------------------------------------------------------");

                        System.out.format("%-30s %20s", "「HARD DISK/FLOPPY DISK」", "Points: " + points + "\n");
                        System.out.println("--------------------------------------------------------");
                        System.out.println("◈◈ Quiz ◈◈");
                        System.out.println("3. A measurement of hard disk performance measured in bytes per second.");
                        System.out.println("\t a. Seek time");
                        System.out.println("\t b. Data rate");
                        System.out.println("\t c. Clock speed");
                        System.out.println("\t d. Drive time");
                        System.out.print("Type in the answer: ");
                        q6 = inputStr.nextLine();

                        if (q6.trim().equalsIgnoreCase("Data rate")||q6.trim().equalsIgnoreCase("b"))
                        {
                            System.out.println("✔️ Correct!");
                            points++;
                            System.out.println("👍 POINTS INCREASE BY 1.");
                        }
                        else
                        {
                            System.out.println("✖️ Incorrect.");
                            System.out.println("Data rate is measured in bytes per second.");
                        }
                        System.out.println("--------------------------------------------------------");
                        diskQuiz=true;
                    }
                    else if (choiceDisk==2 && diskQuiz==true)
                        System.out.println("You have already done this quiz.\n");
                }

                //Topic Menu: Compact Discs
                while (menuSelect==3 && (choiceCD==1 || choiceCD==2))
                {
                    System.out.format("%-30s %20s", "「COMPACT DISC」", "Points: " + points + "\n");
                    System.out.println("--------------------------------------------------------");
                    System.out.println("◈◈ What would you like to do? ◈◈\n");
                    System.out.println("1. Learn the lesson.");
                    System.out.println("2. Take the quiz!");
                    System.out.println("3. Exit to the main menu. (Enter any number other than 1 or 2.)");
                    System.out.print("Please enter the number of your choice: ");
                    choiceCD= inputInt.nextInt();
                    System.out.println("--------------------------------------------------------");

                    //Lesson: Compact Discs
                    if (choiceCD==1)
                    {
                        System.out.format("%-30s %20s", "「COMPACT DISC」", "Points: " + points + "\n");
                        System.out.println("--------------------------------------------------------");
                        System.out.println("◈◈ Lesson ◈◈\n");
                        System.out.println("   .'‾‾‾'.\n" +
                                " /       \\\n" +
                                "(   (0)   )\n" +
                                " \\       /\n" +
                                "  '.___.'");
                        System.out.println("Compact discs (CDs) are made up of mostly injection molded clear " +
                                "polycarbonate plastic with a reflective aluminium layer and an acrylic layer. " +
                                "The plastic has bumps pressed into it which is covered by the aluminium. " +
                                "A CD has a single spiral track of data circling from the inside to the outside.\n");

                        System.out.println("The bumps are essential because this is how the CD player is able to " +
                                "read data. It has a drive motor that spins the disc, a laser with a lens system " +
                                "to focus on reading the bumps, and a tracking mechanism for the beam to follow " +
                                "the spiral track. The reading of the data depends on how the aluminium layer " +
                                "reflects the light emitted from the laser. The bumps reflect the light differently " +
                                "compared to the smooth areas, which allows the drive to read the bits. " +
                                "When light hits a bump, a 0 is read. A flat area is read as a 1.\n ");

                        System.out.println("To prevent scratches from causing a misread of data, " +
                                "interleaving stores data non-sequentially. The drive then has to " +
                                "un-interleave the data in order to play it, which is more work, however, " +
                                "entire packets of bytes will not be misread with this technique.\n");

                        System.out.print("Enter any character to return to the compact disc menu: ");
                        inputStr.nextLine();
                        System.out.println("--------------------------------------------------------");
                    }

                    //Quiz: Compact Discs
                    else if (choiceCD == 2 && cdQuiz==false)
                    {
                        System.out.format("%-30s %20s", "「COMPACT DISC」", "Points: " + points + "\n");
                        System.out.println("--------------------------------------------------------");
                        System.out.println("◈◈ Quiz ◈◈");
                        System.out.println("1. Name the process of storing data on a CD non-sequentially.");
                        System.out.print("Type in the answer: ");
                        q7 = inputStr.nextLine();

                        if (q7.trim().equalsIgnoreCase("interleaving"))
                        {
                            System.out.println("✔️ Correct!");
                            points++;
                            System.out.println("👍 POINTS INCREASE BY 1.");
                        }
                        else
                        {
                            System.out.println("✖️ Incorrect.");
                            System.out.println("Interleaving stores data on a CD non-sequentially.");
                        }
                        System.out.println("--------------------------------------------------------");

                        System.out.format("%-30s %20s", "「COMPACT DISC」", "Points: " + points + "\n");
                        System.out.println("--------------------------------------------------------");
                        System.out.println("◈◈ Quiz ◈◈");
                        System.out.println("2. Fill in the blank:\n" +
                                "Compact discs are mostly made of polycarbonate _ _ _ _ _ _ _.");
                        System.out.print("Type in the answer: ");
                        q8 = inputStr.nextLine();

                        if (q8.trim().equalsIgnoreCase("plastic")
                        ||q8.trim().equalsIgnoreCase("p l a s t i c"))
                        {
                            System.out.println("✔️ Correct!");
                            points++;
                            System.out.println("👍 POINTS INCREASE BY 1.");
                        }
                        else
                        {
                            System.out.println("✖️ Incorrect.");
                            System.out.println("Compact discs are mostly made of polycarbonate plastic.");
                        }
                        System.out.println("--------------------------------------------------------");

                        System.out.format("%-30s %20s", "「COMPACT DISC」", "Points: " + points + "\n");
                        System.out.println("--------------------------------------------------------");
                        System.out.println("◈◈ Quiz ◈◈");
                        System.out.println("3. What emits a light to read the data on a CD?");
                        System.out.println("\t a. Stepping motor");
                        System.out.println("\t b. Flashlight");
                        System.out.println("\t c. Laser");
                        System.out.println("\t d. Read/write head");
                        System.out.print("Type in the answer: ");
                        q9 = inputStr.nextLine();

                        if (q9.trim().equalsIgnoreCase("laser")||q9.trim().equalsIgnoreCase("c"))
                        {
                            System.out.println("✔️ Correct!");
                            points++;
                            System.out.println("👍 POINTS INCREASE BY 1.");
                        }
                        else
                        {
                            System.out.println("✖️ Incorrect.");
                            System.out.println("A laser emits a light to read the data on a CD.");
                        }
                        System.out.println("--------------------------------------------------------");
                        cdQuiz=true;
                    }
                    else if (choiceCD==2 && cdQuiz==true)
                        System.out.println("You have already done this quiz.\n");
                }

                //Topic Menu: BIOS
                while (menuSelect==4 && (choiceBIOS==1 || choiceBIOS==2))
                {
                    System.out.format("%-30s %20s", "「BIOS」", "Points: " + points + "\n");
                    System.out.println("--------------------------------------------------------");
                    System.out.println("◈◈ What would you like to do? ◈◈\n");
                    System.out.println("1. Learn the lesson.");
                    System.out.println("2. Take the quiz!");
                    System.out.println("3. Exit to the main menu. (Enter any number other than 1 or 2.)");
                    System.out.print("Please enter the number of your choice: ");
                    choiceBIOS= inputInt.nextInt();
                    System.out.println("--------------------------------------------------------");

                    //Lesson: BIOS
                    if (choiceBIOS==1)
                    {
                        System.out.format("%-30s %20s", "「BIOS」", "Points: " + points + "\n");
                        System.out.println("--------------------------------------------------------");
                        System.out.println("◈◈ Lesson ◈◈\n");

                        System.out.println("Basic input/output system (BIOS) is on virtually every computer " +
                                "available to ensure pieces of hardware like hard drives and CPU function together. " +
                                "BIOS has both a hardware and software component as BIOS can be used to reference " +
                                "either the BIOS chip or the BIOS software process. The hardware can be seen on " +
                                "your motherboard as a piece of flash memory/ROM. The BIOS software provides " +
                                "instructions for the processor including the following tasks:\n");

                        System.out.println("\t\t ○ A power-on self-test for all different hardware components.");
                        System.out.println("\t\t ○ Activating the BIOS chips on other cards. " +
                                "(Ex: Some graphics cards have their own BIOS chip.)");
                        System.out.println("\t\t ○ Manage input/output devices like the keyboard and screen.\n");

                        System.out.println("When you turn on your computer, the first thing the BIOS does is check " +
                                "for information stored in a complementary metal oxide semiconductor (CMOS) chip. " +
                                "The CMOS chip provides details about the system which can be altered if the system " +
                                "is changed.\n ");

                        System.out.println("Turning on the computer is known as a boot. " +
                                "There are different types of boot sequences and this affects what the BIOS does. \n");
                        System.out.println("During a cold boot, the BIOS verifies RAM by performing a read/write test " +
                                "to each memory address, checks the ports for devices, and notifies you of any errors " +
                                "found during the power-on self-test. \n\n" +
                                "During a reboot, the BIOS checks the CMOS and whether the video card is operational, " +
                                "skipping over the rest of the power-on self-test.\n");

                        System.out.print("Enter any character to return to the basic input/output system menu: ");
                        inputStr.nextLine();
                        System.out.println("--------------------------------------------------------");
                    }

                    //Quiz: BIOS
                    else if (choiceBIOS == 2 && biosQuiz==false)
                    {
                        System.out.format("%-30s %20s", "「BIOS」", "Points: " + points + "\n");
                        System.out.println("--------------------------------------------------------");
                        System.out.println("◈◈ Quiz ◈◈");
                        System.out.println("1. What does the term BIOS stand for?");
                        System.out.println("\t a. Basic import/output system");
                        System.out.println("\t b. Basic input/output system");
                        System.out.println("\t c. Beginning input/output system");
                        System.out.println("\t d. Beginning import/output system");
                        System.out.print("Type in the answer: ");
                        q10 = inputStr.nextLine();

                        if (q10.trim().equalsIgnoreCase("basic input/output system")||
                            q10.trim().equalsIgnoreCase("b"))
                        {
                            System.out.println("✔️ Correct!");
                            points++;
                            System.out.println("👍 POINTS INCREASE BY 1.");
                        }
                        else
                        {
                            System.out.println("✖️ Incorrect.");
                            System.out.println("BIOS stands for basic input/output system.");
                        }
                        System.out.println("--------------------------------------------------------");

                        System.out.format("%-30s %20s", "「BIOS」", "Points: " + points + "\n");
                        System.out.println("--------------------------------------------------------");
                        System.out.println("◈◈ Quiz ◈◈");
                        System.out.println("2. Name the first chip the BIOS checks when a PC is turned on.");
                        System.out.print("Type in the answer: ");
                        q11 = inputStr.nextLine();

                        if (q11.trim().equalsIgnoreCase("CMOS")||
                            q11.trim().equalsIgnoreCase("complementary metal oxide semiconductor")||
                            q11.trim().equalsIgnoreCase("CMOS chip"))
                        {
                            System.out.println("✔️ Correct!");
                            points++;
                            System.out.println("👍 POINTS INCREASE BY 1.");
                        }
                        else
                        {
                            System.out.println("✖️ Incorrect.");
                            System.out.println("The CMOS chip (complementary metal oxide semiconductor) is first " +
                                    "checked by the BIOS.");
                        }
                        System.out.println("--------------------------------------------------------");

                        System.out.format("%-30s %20s", "「BIOS」", "Points: " + points + "\n");
                        System.out.println("--------------------------------------------------------");
                        System.out.println("◈◈ Quiz ◈◈");
                        System.out.println("3. In which boot process is a part of the power-on self-test skipped over?");
                        System.out.println("\t a. Turkey boot");
                        System.out.println("\t b. Hard boot");
                        System.out.println("\t c. Reboot");
                        System.out.println("\t d. Cold boot");
                        System.out.print("Type in the answer: ");
                        q12 = inputStr.nextLine();

                        if (q12.trim().equalsIgnoreCase("reboot")
                            ||q12.trim().equalsIgnoreCase("c"))
                        {
                            System.out.println("✔️ Correct!");
                            points++;
                            System.out.println("👍 POINTS INCREASE BY 1.");
                        }
                        else
                        {
                            System.out.println("✖️ Incorrect.");
                            System.out.println("During the reboot process, parts of the power-on self-test are " +
                                    "skipped over.");
                        }
                        //Additional Feature: A 50% chance of being rewarded with a powerup.
                        luck = (int)((4-1+1)*Math.random() + 1);
                        if (luck >=3)
                        {
                            System.out.println("--------------------------------------------------------");
                            System.out.format("%-30s %20s", "「SPECIAL」", "Points: " + points + "\n");
                            System.out.println("--------------------------------------------------------");
                            System.out.println("\uD83C\uDF89\uD83C\uDF89 CONGRATULATIONS \uD83C\uDF89\uD83C\uDF89, " +
                                    "you have luckily won a power up for your points!");
                            System.out.println("Choose which of the following power ups you would like to apply.\n");
                            System.out.println("1. Add 3 points to your current total.");
                            System.out.println("2. Get a 50% chance at doubling your current points total.");
                            System.out.println("3. Get a 10% change at tripling your current points total.");
                            System.out.println("4. Enter any number other than 1-3 to give up this power up.");
                            System.out.print("Enter the number of the option you choose: ");
                            choiceLuck=inputInt.nextInt();
                            System.out.println();

                            if (choiceLuck==1)
                            {
                                System.out.println("3 points have been added to your total point value.");
                                points+=3;
                            }
                            else if (choiceLuck==2)
                            {
                                luck = (int)((4-1+1)*Math.random() + 1);
                                if (luck >=3)
                                {
                                    System.out.println("Your risk has paid off, your point value will now double.");
                                    points *= 2;
                                }
                                else
                                    System.out.println("Unfortunately, the odds were not in your favour.");
                            }
                            else if (choiceLuck==3)
                            {
                                luck = (int)((10-1+1)*Math.random()+1);
                                if (luck == 7)
                                {
                                    System.out.println("Your risk has paid off, your point value will now triple.");
                                    points *=3;
                                }
                                else
                                    System.out.println("Unfortunately, the odds were not in your favour.");
                            }

                        }
                        System.out.println("--------------------------------------------------------");
                        biosQuiz=true;
                    }
                    else if (choiceBIOS==2 && biosQuiz==true)
                        System.out.println("You have already done this quiz.\n");
                }

                //Topic Menu: CD-Burners
                while (menuSelect==5 && (choiceBurner==1 || choiceBurner==2))
                {
                    System.out.format("%-30s %20s", "「CD-BURNERS」", "Points: " + points + "\n");
                    System.out.println("--------------------------------------------------------");
                    System.out.println("◈◈ What would you like to do? ◈◈\n");
                    System.out.println("1. Learn the lesson.");
                    System.out.println("2. Take the quiz!");
                    System.out.println("3. Exit to the main menu. (Enter any number other than 1 or 2.)");
                    System.out.print("Please enter the number of your choice: ");
                    choiceBurner= inputInt.nextInt();
                    System.out.println("--------------------------------------------------------");

                    //Lesson: CD-Burners
                    if (choiceBurner==1)
                    {
                        System.out.format("%-30s %20s", "「CD-BURNERS」", "Points: " + points + "\n");
                        System.out.println("--------------------------------------------------------");
                        System.out.println("◈◈ Lesson ◈◈\n");

                        System.out.println("╔═══════════════════════════════╗\n" +
                                "║  \t\t\t\t\t\t  ║\n" +
                                "║  \t████████████    ║\n" +
                                "║  \t\t\t\t\t\t  ║\n" +
                                "║\t\t\t\t   ▬\t  ║\n" +
                                "╚═══════════════════════════════╝");

                        System.out.println("This lesson will share some similarities to the CDs lesson, " +
                                "however, it will focus on how data is actually written to CDs.\n");

                        System.out.format("%-40s %-30s %50s","Type of CD","Functionality","How it works?\n");
                        System.out.format("%-40s %-30s %50s","CD-ROM","Read-only","This compact disc storage is\n");
                        System.out.format("%-40s %-30s %50s","","(Compact Disc - Read","produced with a complex\n");
                        System.out.format("%-40s %-30s %50s","","Only Memory)","manufacturing process, not practical\n");
                        System.out.format("%-40s %-30s %50s","","","for home use. It uses a high-power\n");
                        System.out.format("%-40s %-30s %50s","","","laser to etch the bump pattern into a\n");
                        System.out.format("%-40s %-30s %50s","","","photoresist material coated onto a\n");
                        System.out.format("%-40s %-30s %50s","","","glass plate. The etched glass is then\n");
                        System.out.format("%-40s %-30s %50s","","","pressed onto acrylic disks to imprint\n");
                        System.out.format("%-40s %-30s %50s","","","the discs with the bump pattern.\n\n");

                        System.out.format("%-40s %-30s %50s","CD-R"," Read and Write","CD-recordable discs do not have" +
                                " any\n");
                        System.out.format("%-40s %-30s %50s","","(Compact Disc - ","bumps or flat areas but a\n");
                        System.out.format("%-40s %-30s %50s","","Recordable","photosensitive dye. With a blank\n");
                        System.out.format("%-40s %-30s %50s","","","disc, the dye is translucent, but when\n");
                        System.out.format("%-40s %-30s %50s","","","heated the dye becomes opaque. By\n");
                        System.out.format("%-40s %-30s %50s","","","darkening certain points and leaving\n");
                        System.out.format("%-40s %-30s %50s","","","other points translucent, it creates a\n");
                        System.out.format("%-40s %-30s %50s","","","pattern which a CD drive can read,\n");
                        System.out.format("%-40s %-30s %50s","","","similar to the bumps.\n\n");

                        System.out.format("%-40s %-30s %50s","CD-RW"," Read, Write, and Erase","Taking CD-R a step " +
                                "further and\n");
                        System.out.format("%-40s %-30s %50s","","(Compact Disc - ","adding an erase function,\n");
                        System.out.format("%-40s %-30s %50s","","Rewritable","CD-rewritable uses different\n");
                        System.out.format("%-40s %-30s %50s","","","technology to create a readable\n");
                        System.out.format("%-40s %-30s %50s","","","pattern. Using phase-change\n");
                        System.out.format("%-40s %-30s %50s","","","technology, a drive heats up the\n");
                        System.out.format("%-40s %-30s %50s","","","chemical compound for melting and\n");
                        System.out.format("%-40s %-30s %50s","","","creates an opaque liquid which can\n");
                        System.out.format("%-40s %-30s %50s","","","be cooled to from a translucent\n");
                        System.out.format("%-40s %-30s %50s","","","solid. The translucent and opaque\n");
                        System.out.format("%-40s %-30s %50s","","","areas will reflect light differently,\n");
                        System.out.format("%-40s %-30s %50s","","","similar to how bumps reflect light on\n");
                        System.out.format("%-40s %-30s %50s","","","a regular CD-ROM.\n\n");

                        System.out.print("Enter any character to return to the CD-burners menu: ");
                        inputStr.nextLine();
                        System.out.println("--------------------------------------------------------");
                    }

                    //Quiz: CD-Burners
                    else if (choiceBurner == 2 && burnerQuiz==false)
                    {
                        System.out.format("%-30s %20s", "「CD-BURNER」", "Points: " + points + "\n");
                        System.out.println("--------------------------------------------------------");
                        System.out.println("◈◈ Quiz ◈◈");
                        System.out.println("1. How does a CD-R simulate the bumps imprinted on a CD-ROM?");
                        System.out.println("\t a. It uses photosensitive dye to create opaque and transparent areas.");
                        System.out.println("\t b. It uses phase-change technology to create opaque and transparent areas.");
                        System.out.println("\t c. Trick question, it has bumps imprinted as well.");
                        System.out.println("\t d. Instead of using bumps, CD-R uses magnets to store data.");
                        System.out.print("Type in the answer: ");
                        q13 = inputStr.nextLine();

                        if (q13.trim().equalsIgnoreCase("It uses photosensitive dye to create opaque " +
                                "and transparent areas.")
                            ||q13.trim().equalsIgnoreCase("It uses photosensitive dye to create opaque " +
                                "and transparent areas")
                            ||q13.trim().equalsIgnoreCase("photosensitive dye")
                            ||q13.trim().equalsIgnoreCase("a"))
                        {

                            System.out.println("✔️ Correct!");
                            points++;
                            System.out.println("👍 POINTS INCREASE BY 1.");
                        }
                        else
                        {
                            System.out.println("✖️ Incorrect.");
                            System.out.println("CD-R simulates the bumps imprinted on a CD-ROM using photosensitive dye" +
                                    " to create opaque and transparent areas.");
                        }
                        System.out.println("--------------------------------------------------------");

                        System.out.format("%-30s %20s", "「CD-BURNER」", "Points: " + points + "\n");
                        System.out.println("--------------------------------------------------------");
                        System.out.println("◈◈ Quiz ◈◈");
                        System.out.println("2. Is the following statement true or false?\n Phase-change technology " +
                                "is what allows for CD-RWs to be rewritten.");
                        System.out.print("Enter true or false: ");
                        q14 = inputStr.nextLine();

                        if (q14.trim().equalsIgnoreCase("true") ||
                            q14.trim().equalsIgnoreCase("T"))
                        {
                            System.out.println("✔️ Correct!");
                            points++;
                            System.out.println("👍 POINTS INCREASE BY 1.");
                        }
                        else
                        {
                            System.out.println("✖️ Incorrect.");
                            System.out.println("The correct answer was true, phase-change technology found in CD-RW" +
                                    " uses a compound which can be cooled or heated to change how it reflects light, " +
                                    "essentially making it rewritable.");
                        }
                    System.out.println("--------------------------------------------------------");

                        System.out.format("%-30s %20s", "「CD-BURNER」", "Points: " + points + "\n");
                        System.out.println("--------------------------------------------------------");
                        System.out.println("◈◈ Quiz ◈◈");
                        System.out.println("3. When heating the dye of a CD-R, what happens to its transparency?");
                        System.out.println("\t a. The dye goes from opaque to translucent");
                        System.out.println("\t b. The dye goes from translucent to opaque");
                        System.out.println("\t c. The dye on the CD-R does not change.");
                        System.out.println("\t d. None of the above.");
                        System.out.print("Type in the answer: ");
                        q15 = inputStr.nextLine();

                        if (q15.trim().equalsIgnoreCase("The dye goes from translucent to opaque")
                            || q15.trim().equalsIgnoreCase("translucent to opaque")
                            || q15.trim().equalsIgnoreCase("b"))
                        {
                            System.out.println("✔️ Correct!");
                            points++;
                            System.out.println("👍 POINTS INCREASE BY 1.\n");
                        }
                        else
                        {
                            System.out.println("✖️ Incorrect.");
                            System.out.println("The dye on a CD-R goes from translucent to opaque when heated.\n");
                        }

                        burnerQuiz=true;

                    }
                    else if (choiceBurner==2 && burnerQuiz==true)
                        System.out.println("You have already done this quiz.\n");
                }

                //Topic Menu: Piracy
                while (menuSelect==6 && (choicePiracy==1||choicePiracy==2) && (points>=12||piracyOverride==true))
                {
                    System.out.format("%-30s %20s", "「PIRACY」", "Points: " + points + "\n");
                    System.out.println("--------------------------------------------------------");
                    System.out.println("◈◈ What would you like to do? ◈◈\n");
                    System.out.println("1. Learn the lesson.");
                    System.out.println("2. Take the quiz!");
                    System.out.println("3. Exit to the main menu. (Enter any number other than 1 or 2.)");
                    System.out.print("Please enter the number of your choice: ");
                    choicePiracy= inputInt.nextInt();
                    System.out.println("--------------------------------------------------------");

                    //Lesson: Piracy
                    if (choicePiracy==1)
                    {
                        System.out.format("%-30s %20s", "「PIRACY」", "Points: " + points + "\n");
                        System.out.println("--------------------------------------------------------");
                        System.out.println("◈◈ Lesson ◈◈\n");

                        System.out.println("                 uuuuuuu\n" +
                                "             uu$$$$$$$$$$$uu\n" +
                                "          uu$$$$$$$$$$$$$$$$$uu\n" +
                                "         u$$$$$$$$$$$$$$$$$$$$$u\n" +
                                "        u$$$$$$$$$$$$$$$$$$$$$$$u\n" +
                                "       u$$$$$$$$$$$$$$$$$$$$$$$$$u\n" +
                                "       u$$$$$$$$$$$$$$$$$$$$$$$$$u\n" +
                                "       u$$$$$$\"   \"$$$\"   \"$$$$$$u\n" +
                                "       \"$$$$\"      u$u       $$$$\"\n" +
                                "        $$$u       u$u       u$$$\n" +
                                "        $$$u      u$$$u      u$$$\n" +
                                "         \"$$$$uu$$$   $$$uu$$$$\"\n" +
                                "          \"$$$$$$$\"   \"$$$$$$$\"\n" +
                                "            u$$$$$$$u$$$$$$$u\n" +
                                "             u$\"$\"$\"$\"$\"$\"$u\n" +
                                "  uuu        $$u$ $ $ $ $u$$       uuu\n" +
                                " u$$$$        $$$$$u$u$u$$$       u$$$$\n" +
                                "  $$$$$uu      \"$$$$$$$$$\"     uu$$$$$$\n" +
                                "u$$$$$$$$$$$uu    \"\"\"\"\"    uuuu$$$$$$$$$$\n" +
                                "$$$$\"\"\"$$$$$$$$$$uuu   uu$$$$$$$$$\"\"\"$$$\"\n" +
                                " \"\"\"      \"\"$$$$$$$$$$$uu \"\"$\"\"\"\n" +
                                "           uuuu \"\"$$$$$$$$$$uuu\n" +
                                "  u$$$uuu$$$$$$$$$uu \"\"$$$$$$$$$$$uuu$$$\n" +
                                "  $$$$$$$$$$\"\"\"\"           \"\"$$$$$$$$$$$\"\n" +
                                "   \"$$$$$\"                      \"\"$$$$\"\"\n" +
                                "     $$$\"                         $$$$\"");

                        System.out.println("This section of learning refers to the concept of software piracy.\n");

                        System.out.println("Software piracy is the unauthorized use or distribution of copyrighted " +
                                "software. It denies those who hold the copyright for said software their " +
                                "compensation for their work. For example, if this game were not free, " +
                                "you would have to pay to obtain this software. Software piracy is “stealing” " +
                                "this game instead of paying. This is possible because of “pirates” " +
                                "distributing the software for others to use. \n");

                        System.out.println("According to the Business Software Alliance, about 41% " +
                                "of all software in current use is stolen. This costs companies a lot " +
                                "of money as they are not being paid, yet the software they spent time " +
                                "and resources to develop is being used. \n");

                        System.out.println("Software piracy is commonly distributed through means of peer to peer " +
                                "transferring also known as torrenting. The idea of peer to peer transferring is " +
                                "letting multiple people host and share content instead of it downloading from just " +
                                "one source. When a user wants to torrent a file, they are connected to a " +
                                "network in which dozens of users are constantly uploading (known as seeding) " +
                                "pieces of the file for other members to download which the torrent software " +
                                "then assembles.\n");

                        System.out.println("Software piracy is an international issue and is taken seriously " +
                                "amongst government around the world. Canadian copyright law has been used to " +
                                "shut down websites which host the piracy services, and many people can be " +
                                "brought to court over piracy. If a user is caught pirating software through " +
                                "the tracking of their IP (internet protocol) address, their internet service " +
                                "provider will be notified and a notice will be sent to the user.\n");

                        System.out.print("Enter any character to return to the piracy menu: ");
                        inputStr.nextLine();
                        System.out.println("--------------------------------------------------------");
                    }

                    //Quiz: Piracy
                    else if (choicePiracy == 2 && piracyQuiz==false)
                    {
                        System.out.format("%-30s %20s", "「PIRACY」", "Points: " + points + "\n");
                        System.out.println("--------------------------------------------------------");
                        System.out.println("◈◈ Quiz ◈◈");
                        System.out.println("1. What is software piracy?");
                        System.out.println("\t a. The purchasing of the video game, \"Pirates\". ");
                        System.out.println("\t b. When software uses terms like \"Arrrr.\".");
                        System.out.println("\t c. The unauthorized use or distribution of copyrighted software.");
                        System.out.println("\t d. Software which sails the seven seas/is distributed globally.");
                        System.out.print("Type in the answer: ");
                        q16 = inputStr.nextLine();

                        if (q16.trim().equalsIgnoreCase("The unauthorized use or distribution " +
                                "of copyrighted software.")
                            ||q16.trim().equalsIgnoreCase("The unauthorized use or distribution " +
                                "of copyrighted software")
                            ||q16.trim().equalsIgnoreCase("unauthorized use or distribution " +
                                "of copyrighted software")
                            ||q16.trim().equalsIgnoreCase("c"))
                        {

                            System.out.println("✔️ Correct!");
                            points++;
                            System.out.println("👍 POINTS INCREASE BY 1.");
                        }
                        else
                        {
                            System.out.println("✖️ Incorrect.");
                            System.out.println("Software piracy refers to the unauthorized use or distribution of" +
                                    " copyrighted software.");
                        }
                        System.out.println("--------------------------------------------------------");

                        System.out.format("%-30s %20s", "「PIRACY」", "Points: " + points + "\n");
                        System.out.println("--------------------------------------------------------");
                        System.out.println("◈◈ Quiz ◈◈");
                        System.out.println("2. How do people distribute pirated software?");
                        System.out.println("\t a. Torrenting");
                        System.out.println("\t b. Peer to speaker connections");
                        System.out.println("\t c. Government websites");
                        System.out.println("\t d. Through the Business Software Alliance");
                        System.out.print("Type in the answer: ");
                        q17 = inputStr.nextLine();

                        if (q17.trim().equalsIgnoreCase("Torrenting") ||
                                q17.trim().equalsIgnoreCase("a"))
                        {
                            System.out.println("✔️ Correct!");
                            points++;
                            System.out.println("👍 POINTS INCREASE BY 1.");
                        }
                        else
                        {
                            System.out.println("✖️ Incorrect.");
                            System.out.println("Torrenting is how pirated software is often distributed. It " +
                                    "utilizes peer to peer transfers.");
                        }
                        System.out.println("--------------------------------------------------------");

                        System.out.format("%-30s %20s", "「PIRACY」", "Points: " + points + "\n");
                        System.out.println("--------------------------------------------------------");
                        System.out.println("◈◈ Quiz ◈◈");
                        System.out.println("3. Fill in the blank: \n Your _ _ _ _ _ _ _ _  _ _ _ _ _ _ _ _ (IP) " +
                                "address can be tracked to catch users that pirate software.");
                        System.out.print("Type in the answer: ");
                        q18 = inputStr.nextLine();

                        if (q18.trim().equalsIgnoreCase("internet protocol")
                            ||q18.trim().equalsIgnoreCase("i n t e r n e t p r o t o c o l"))
                        {
                            System.out.println("✔️ Correct!");
                            points++;
                            System.out.println("👍 POINTS INCREASE BY 1.\n");
                        }
                        else
                        {
                            System.out.println("✖️ Incorrect.");
                            System.out.println("Your internet protocol address can be tracked.\n");
                        }
                        System.out.println("--------------------------------------------------------");
                        piracyQuiz=true;

                    }
                    else if (choicePiracy==2 && piracyQuiz==true)
                        System.out.println("You have already done this quiz.\n");
                }

                if (menuSelect==6 && points<12 && piracyOverride==false)
                {
                    System.out.println("You do not have enough points for this game mode.");
                    System.out.println("--------------------------------------------------------");
                }

                //Topic Menu: Help
                while (menuSelect==7&&(choiceHelp==1||choiceHelp==2||choiceHelp==3||choiceHelp==4||choiceHelp==5))
                {
                    System.out.format("%-30s %20s", "「HELP」", "Points: " + points + "\n");
                    System.out.println("--------------------------------------------------------");
                    System.out.println("◈◈What do you need help with?◈◈\n");
                    System.out.println("1. How to approach the units?");
                    System.out.println("2. How to answer the questions?");
                    System.out.println("3. How to exit the game?");
                    System.out.println("4. How to attempt a quiz twice?");
                    System.out.println("5. What is your goal?");
                    System.out.println("6. Nothing, I want to leave the help menu. (Enter any number " +
                            "other than 1-5)");
                    System.out.print("Enter your choice here: ");
                    choiceHelp= inputInt.nextInt();
                    System.out.println("--------------------------------------------------------");

                    if(choiceHelp==1)
                    {
                        System.out.format("%-30s %20s", "「HELP」", "Points: " + points + "\n");
                        System.out.println("--------------------------------------------------------");
                        System.out.println("How to approach the units? \n");
                        System.out.println("It is recommended for users to first learn the lesson and then" +
                                " attempt the quiz. This is done by first selecting option 1 when you enter a " +
                                "topic's menu. Once you have learnt the lesson, you can go ahead and try the " +
                                "quiz out.\n");
                        System.out.print("Enter any character when you are ready to return to the help menu: ");
                        inputStr.nextLine();
                        System.out.println("--------------------------------------------------------");
                    }
                    else if (choiceHelp==2)
                    {
                        System.out.format("%-30s %20s", "「HELP」", "Points: " + points + "\n");
                        System.out.println("--------------------------------------------------------");
                        System.out.println("How to answer the questions? \n");
                        System.out.println("There are multiple types of questions within the game, but they" +
                                " all take similar input to answer.\n");
                        System.out.println("When given a question which has four options, you can either" +
                                " type in the letter which the option corresponds to, or the label of the option" +
                                " itself. For example: ");
                        System.out.println("\nQuestion");
                        System.out.println("\t a. Option 1");
                        System.out.println("\t b. Option 2");
                        System.out.println("\t c. Option 3");
                        System.out.println("\t d. Option 4");
                        System.out.println("\n In this situation, if you think a. Option 1 is the right answer," +
                                " you can either enter \"a\" or \"option 1\".\n");
                        System.out.print("Enter any character when you are ready to return to the help menu: ");
                        inputStr.nextLine();
                        System.out.println("--------------------------------------------------------");
                    }
                    else if (choiceHelp==3)
                    {
                        System.out.format("%-30s %20s", "「HELP」", "Points: " + points + "\n");
                        System.out.println("--------------------------------------------------------");
                        System.out.println("How to exit the game? \n");
                        System.out.println("To exit the game, you have to first reach the main menu. To do this," +
                                " you have to first return to the help menu as described below, and then once you" +
                                " are at the main menu, enter a number either below 1 or greater than 7.\n");
                        System.out.print("Enter any character when you are ready to return to the help menu: ");
                        inputStr.nextLine();
                        System.out.println("--------------------------------------------------------");
                    }
                    else if (choiceHelp==4)
                    {
                        System.out.format("%-30s %20s", "「HELP」", "Points: " + points + "\n");
                        System.out.println("--------------------------------------------------------");
                        System.out.println("How to attempt a quiz twice? \n");
                        System.out.println("Unfortunately, you will not be able to attempt a quiz again during" +
                                " the same compile sequence. This is to prevent users from obtaining more than" +
                                " 3 points per quiz section of topics. A workaround would be to stop the " +
                                "execution of the current program by either leaving through the main menu or" +
                                " the stop button on the IDE's console. You can then relaunch the program and " +
                                "attempt any quiz you would like again.\n");
                        System.out.print("Enter any character when you are ready to return to the help menu: ");
                        inputStr.nextLine();
                        System.out.println("--------------------------------------------------------");
                    }
                    else if (choiceHelp==5)
                    {
                        System.out.format("%-30s %20s", "「HELP」", "Points: " + points + "\n");
                        System.out.println("--------------------------------------------------------");
                        System.out.println("What is your goal? \n");
                        System.out.println("The goal of this program is to teach you about computer hardware, " +
                                "and your goal would be to absorb as much information as possible. Your knowledge " +
                                "is then tested with quizzes, in which you should try to get the most points as " +
                                "possible.\n");
                        System.out.print("Enter any character when you are ready to return to the help menu: ");
                        inputStr.nextLine();
                        System.out.println("--------------------------------------------------------");
                    }
                }
                //Allows user to exit the program.
                if (menuSelect<1||menuSelect>7)
                    exit=-1;

                //Reset choices to allow for main menu selection again.
                choiceBIOS=1;
                choiceBurner=1;
                choiceCD=1;
                choiceDisk=1;
                choiceMemory=1;
                choicePiracy=1;
                choiceHelp=1;
            }
        }
        if (exit == -1)
        {

            if(points>0)
            {
                System.out.println("Before you go, the points you have accumulated can be redeemed to view an image. " +
                        "The greater the points, the greater the image.");
                System.out.println("Would you like to see the image?");
                System.out.print("Enter \"yes\" if so: ");
                redeemPoints=inputStr.nextLine();

                if (redeemPoints.trim().equalsIgnoreCase("yes"))
                {
                    if (points<5)
                        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⣤\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿\n" +
                                "⠀⠀⣶⠀⠀⣀⣤⣶⣤⣉⣿⣿⣤⣀\n" +
                                "⠤⣤⣿⣤⣿⠿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣀\n" +
                                "⠀⠛⠿⠀⠀⠀⠀⠉⣿⣿⣿⣿⣿⠉⠛⠿⣿⣤\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠿⣿⣿⣿⠛⠀⠀⠀⣶⠿\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⣀⣿⣿⣿⣿⣤⠀⣿⠿\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⣶⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠿⣿⣿⣿⣿⣿⠿⠉⠉\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠉⣿⣿⣿⣿⠿\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⠉\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⣛⣿⣭⣶⣀\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⠉⠛⣿\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⠀⠀⣿⣿\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣉⠀⣶⠿\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⣶⣿⠿\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠛⠿⠛\n");
                    else if (points <10)
                        System.out.println("⢀⡴⠑⡄⠀⠀⠀⠀⠀⠀⠀⣀⣀⣤⣤⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ \n" +
                                "⠸⡇⠀⠿⡀⠀⠀⠀⣀⡴⢿⣿⣿⣿⣿⣿⣿⣿⣷⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀ \n" +
                                "⠀⠀⠀⠀⠑⢄⣠⠾⠁⣀⣄⡈⠙⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀ \n" +
                                "⠀⠀⠀⠀⢀⡀⠁⠀⠀⠈⠙⠛⠂⠈⣿⣿⣿⣿⣿⠿⡿⢿⣆⠀⠀⠀⠀⠀⠀⠀ \n" +
                                "⠀⠀⠀⢀⡾⣁⣀⠀⠴⠂⠙⣗⡀⠀⢻⣿⣿⠭⢤⣴⣦⣤⣹⠀⠀⠀⢀⢴⣶⣆ \n" +
                                "⠀⠀⢀⣾⣿⣿⣿⣷⣮⣽⣾⣿⣥⣴⣿⣿⡿⢂⠔⢚⡿⢿⣿⣦⣴⣾⠁⠸⣼⡿ \n" +
                                "⠀⢀⡞⠁⠙⠻⠿⠟⠉⠀⠛⢹⣿⣿⣿⣿⣿⣌⢤⣼⣿⣾⣿⡟⠉⠀⠀⠀⠀⠀ \n" +
                                "⠀⣾⣷⣶⠇⠀⠀⣤⣄⣀⡀⠈⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀ \n" +
                                "⠀⠉⠈⠉⠀⠀⢦⡈⢻⣿⣿⣿⣶⣶⣶⣶⣤⣽⡹⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀ \n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠉⠲⣽⡻⢿⣿⣿⣿⣿⣿⣿⣷⣜⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀ \n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣷⣶⣮⣭⣽⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀ \n" +
                                "⠀⠀⠀⠀⠀⠀⣀⣀⣈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀ \n" +
                                "⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀ \n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀ \n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠻⠿⠿⠿⠿⠛⠉              \n");
                    else
                        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣧⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣧⠀⠀⠀⢰⡿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⡟⡆⠀⠀⣿⡇⢻⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀⣿⠀⢰⣿⡇⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⡄⢸⠀⢸⣿⡇⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⡇⢸⡄⠸⣿⡇⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⢸⡅⠀⣿⢠⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⣿⣥⣾⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⡿⡿⣿⣿⡿⡅⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠉⠀⠉⡙⢔⠛⣟⢋⠦⢵⠀⠀⠀⠀⠀⠀⠀\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣄⠀⠀⠁⣿⣯⡥⠃⠀⢳⠀⠀⠀⠀⠀⠀⠀\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⡇⠀⠀⠀⠐⠠⠊⢀⠀⢸⠀⠀⠀⠀⠀⠀⠀\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿⣿⡿⠀⠀⠀⠀⠀⠈⠁⠀⠀⠘⣿⣄⠀⠀⠀⠀⠀\n" +
                                "⠀⠀⠀⠀⠀⣠⣿⣿⣿⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⣷⡀⠀⠀⠀\n" +
                                "⠀⠀⠀⠀⣾⣿⣿⣿⣿⣿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⣿⣧⠀⠀\n" +
                                "⠀⠀⠀⡜⣭⠤⢍⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⢛⢭⣗⠀\n" +
                                "⠀⠀⠀⠁⠈⠀⠀⣀⠝⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠄⠠⠀⠀⠰⡅\n" +
                                "⠀⠀⠀⢀⠀⠀⡀⠡⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⠔⠠⡕⠀\n" +
                                "⠀⠀⠀⠀⣿⣷⣶⠒⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⠀⠀⠀⠀\n" +
                                "⠀⠀⠀⠀⠘⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠰⠀⠀⠀⠀⠀\n" +
                                "⠀⠀⠀⠀⠀⠈⢿⣿⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠊⠉⢆⠀⠀⠀⠀\n" +
                                "⠀⢀⠤⠀⠀⢤⣤⣽⣿⣿⣦⣀⢀⡠⢤⡤⠄⠀⠒⠀⠁⠀⠀⠀⢘⠔⠀⠀⠀⠀\n" +
                                "⠀⠀⠀⡐⠈⠁⠈⠛⣛⠿⠟⠑⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                "⠀⠀⠉⠑⠒⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n");

                    System.out.println();
                }

            }

            System.out.println("\n© 2019 Jimmy Huynh. ");

        }
    }
}
