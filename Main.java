import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.io.IOException;

public class Main {
    // MAIN MENU
    public static void main(String[] args) {
        int inputChoice = 0;
        int inputChoiceYear = 0;
        int inputChoiceSem = 0;
        int inputChoiceGradingMenu = 0;
        int inputSubjYear = 0;
        int inputChoiceSubjElectivesMenu = 0;
        do {
            System.out.println("--------------------------");
            System.out.println("* * * G R A D I N G * S Y S T E M * M A I N * M E N U * * *");
            System.out.println("");
            System.out.println("[1] View Grading Scheme");
            System.out.println("[2] View Grading Formula");
            System.out.println("[3] Calculate Grade");
            System.out.println("[4] Exit Program");
            System.out.println("--------------------------");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your choice: ");
            inputChoice = Integer.valueOf(scanner.nextLine());
            System.out.println("");
            cls();

            switch (inputChoice) {
                case 1:
                    System.out.println("* T. I. P.  G R A D I N G  S C H E M E *");

                    // arrays
                    String[][] data = {
                            { "94.00 - 100.00", "1.00", "Excellent" },
                            { "88.50 - 93.99 ", "1.25", "Superior" },
                            { "83.00 - 88.49 ", "1.50", "Meritorious" },
                            { "77.50 - 82.99 ", "1.75", "Very Good" },
                            { "72.00 - 77.49 ", "2.00", "Good" },
                            { "65.50 - 71.99 ", "2.25", "Very Satisfactory" },
                            { "61.00 - 65.49 ", "2.50", "Satisfactory" },
                            { "55.50 - 60.99 ", "2.75", "Fair" },
                            { "50.00 - 55.49 ", "3.00", "Passing" },
                            { "              ", "4.00", "Incomplete" },
                            { "0.00 - 49.99  ", "5.00", "Failed" },
                            { "              ", "6.00", "Officially Dropped" },
                            { "              ", "7.00", "Unofficially Dropped" },
                            { "              ", "8.00", "No Credit" }

                    };
                    // row column
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("PERCENTAGE OF GRADE" + "\t" + "EQUIVALENT GRADE" + "\t" +
                            "DESCRIPTIVE RATING");
                    // System.out.println("");
                    System.out.println("-----------------------------------------------------------------------------");
                    // System.out.println();
                    // CONTENTSS
                    for (int row = 0; row < data.length; row++) {
                        for (int col = 0; col < data[row].length; col++) {
                            System.out.print(data[row][col] + "\t" + "\t" + "\t");
                        }
                        System.out.println("");
                    }
                    System.out.println("-----------------------------------------------------------------------------");
                    pressEnterKeyToContinue();
                    cls();
                    // option to go back to main menu

                    break;

                case 2:

                    // option: yr and sem + subject
                    // options: subject with year and sem
                    // cls();
                    do {
                        System.out.println(
                                "-----------------------------------------------------------------------------");
                        System.out.println("* G E N E R A L  F O R M U L A *");
                        System.out.println("");
                        printGradingFormula();
                        System.out.println(
                                "-----------------------------------------------------------------------------");
                        System.out.println("");

                        System.out.println("* * * G R A D E S * A N D * S U B J E C T S * M E N U * * *");
                        System.out.println("");
                        System.out.println("[1] View Subject Menu");
                        System.out.println("[2] View Class Standing of Each Subjects");
                        System.out.println("[3] View Subject Electives Menu");
                        System.out.println("[4] Go Back to Main Menu");
                        System.out.println("[5] Exit");
                        System.out.print("");

                        System.out.print("Enter Choice: ");
                        inputChoiceGradingMenu = Integer.valueOf(scanner.nextLine());
                        cls();
                        if (inputChoiceGradingMenu == 1) {
                            // [1] View Subject Menu
                            do {
                                System.out.println("* Y E A R  A N D  S E M E S T E R *");
                                System.out.println("");

                                System.out.println("[1] First Year");
                                System.out.println("[2] Second Year");
                                System.out.println("[3] Third Year");
                                System.out.println("[4] Fourth Year");
                                System.out.println("[5] Go Back");
                                System.out.println("[6] Exit");

                                System.out.print("");

                                System.out.print("Enter Choice: ");
                                inputSubjYear = Integer.valueOf(scanner.nextLine());
                                cls();

                                if (inputSubjYear >= 1 && inputSubjYear <= 4) {
                                    subjectMenu(inputSubjYear);
                                    pressEnterKeyToContinue();
                                    cls();
                                } else if (inputSubjYear == 5) {
                                    cls();

                                    break;
                                } else if (inputSubjYear == 6) {
                                    exitProgram();
                                    break;
                                }
                            } while (inputSubjYear != 6);

                            // cls();
                        }

                        if (inputChoiceGradingMenu == 2) {
                            // [2] View Class Standing of Each Subjects
                            do {

                                System.out.println(
                                        "-----------------------------------------------------------------------------");
                                System.out.println("* T I P  C L A S S  S T A N D I N G *");
                                System.out.println("");
                                System.out.println("[1] First Year");
                                System.out.println("[2] Second Year");
                                System.out.println("[3] Third Year");
                                System.out.println("[4] Fourth Year");
                                System.out.println("[5] Go Back");
                                System.out.println("[6] Exit");

                                System.out.println("");

                                System.out.print("Enter Choice: ");
                                inputChoiceYear = Integer.valueOf(scanner.nextLine());
                                cls();
                                if (inputChoiceYear >= 1 && inputChoiceYear <= 4) {
                                    System.out.println(
                                            "-----------------------------------------------------------------------------");
                                    System.out.println("* T I P  C L A S S  S T A N D I N G *");
                                    System.out.println("");
                                    System.out.println("[1] First Semester");
                                    System.out.println("[2] Second Semester");
                                    System.out.println("[3] Go Back");
                                    System.out.println("[4] Exit");
                                    System.out.println("");
                                    System.out.print("Enter Choice: ");
                                    inputChoiceSem = Integer.valueOf(scanner.nextLine());
                                    cls();
                                    if (inputChoiceSem == 1 || inputChoiceSem == 2) {
                                        yearSemChoice(inputChoiceYear, inputChoiceSem);
                                        pressEnterKeyToContinue();
                                        cls();
                                    }
                                    if (inputChoice == 3) {
                                        cls();
                                        break;
                                    }
                                    if (inputChoice == 4) {
                                        exitProgram();
                                        break;
                                    }
                                }

                                else if (inputChoiceYear == 5) {
                                    cls();

                                    break;
                                } else if (inputChoiceYear == 6) {
                                    exitProgram();
                                    break;
                                }
                            } while (inputChoiceYear != 5 || inputChoiceYear != 6);
                            break;
                        }
                        if (inputChoiceGradingMenu == 3) {
                            // [3] View Subject Electives Menu
                            do {
                                System.out.println("* * * S U B J E C T * E L E C T I V E S * M E N U * * *");
                                System.out.println("");
                                System.out.println("[1] CS Elective Courses");
                                System.out.println("[2] Free Elective Courses");
                                System.out.println("[3] Go Back");
                                System.out.println("[4] Exit");
                                System.out.println("");
                                System.out.print("Enter Choice: ");
                                inputChoiceSubjElectivesMenu = Integer.valueOf(scanner.nextLine());
                                cls();
                                if (inputChoiceSubjElectivesMenu == 1 || inputChoiceSubjElectivesMenu == 2) {
                                    printChoiceElective(inputChoiceSubjElectivesMenu);
                                    pressEnterKeyToContinue();
                                    cls();
                                }

                                if (inputChoiceSubjElectivesMenu == 3) {
                                    cls();
                                    break;
                                }
                                if (inputChoiceSubjElectivesMenu == 4) {
                                    exitProgram();
                                    break;
                                }
                            } while (inputChoiceSubjElectivesMenu != 4);

                        }

                        if (inputChoiceGradingMenu == 4) {
                            cls();
                            break;
                        }

                        if (inputChoiceGradingMenu == 5) {
                            exitProgram();
                            break;
                        }

                    } while (inputChoiceGradingMenu != 4);

                    break;

                case 3:
                    System.out.println("T.I.P. CALCULATE GRADE");

                    break;

                case 4:
                    exitProgram();
                    break;
                default:
                    System.out.println("Invalid! Try Again!");

            }
        } while (inputChoice != 4);

    }

    public static void cls() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception E) {
            System.out.println(E);
        }
    }

    public static void exitProgram() {
        System.out.println("Exiting program...");
        System.exit(0);
    }

    public static void pressEnterKeyToContinue() {
        System.out.println("");
        System.out.println("Press Enter key to continue...");
        Scanner s = new Scanner(System.in);
        s.nextLine();
    }

    // content per year sem
    public static void yearSemChoice(int inputChoiceYear, int inputChoiceSem) {
        int inputChoiceSubj = 0;
        switch (inputChoiceYear) {
            case 1:
                // 1 st year
                if (inputChoiceSem == 1) {
                    System.out.println("First Year, First Semester");

                    System.out.println("[1] GEC  001    Understanding the Self");
                    System.out.println("[2] GEC  004    Mathematics in the Modern World");
                    System.out.println("[3] MATH 013    Linear Algebra with MATLAB");
                    System.out.println("[4] MATH 014    Number Theory");
                    System.out.println("[5] CS   001    Introduction to Computing");
                    System.out.println("[6] ITE  001    Computer Programming 1");
                    System.out.println("[7] PE   001    Physical Education 1");
                    System.out.println("[8] NSTP 001    National Service Training Program 1");
                    System.out.println("");

                    printSubject(inputChoiceYear, inputChoiceSem, inputChoiceSubj);

                    // break;
                } else if (inputChoiceSem == 2) {
                    System.out.println("First Year, Second Semester");
                    System.out.println("[1] GEC 003     The Contemporary World");
                    System.out.println("[2] GEC 005     Purposive Communication");
                    System.out.println("[3] GEC 006     Art Appreciation");
                    System.out.println("[4] MATH 015    Symbolic Logic");
                    System.out.println("[5] MATH 007    Differential Calculus");
                    System.out.println("[6] ITE 012     Computer Programming 2");
                    System.out.println("[7] PE 002      Physical Education 2");
                    System.out.println("[8] NSTP 002    National Service Training Program 2");
                    printSubject(inputChoiceYear, inputChoiceSem, inputChoiceSubj);

                    // break;
                }

                break;
            case 2:
                // 2nd year
                if (inputChoiceSem == 1) {
                    System.out.println("Second Year, First Semester");

                    System.out.println("[1] GEC 007     Science, Technology, and Society");
                    System.out.println("[2] SOCSC 005   Life and Works of Rizal");
                    System.out.println("[3] MATH 009CS  Probability and Statistics (w/lab)");
                    System.out.println("[4] CS 004      Networks and Communications");
                    System.out.println("[5] ITE 013     Application Development and Emerging Technologies");
                    System.out.println("[6] CS 403      Intelligent Agents");
                    System.out.println("[7] CS 300      Automata Theory and Formal Languages");
                    System.out.println("[8] CS 301      Software Engineering 1");
                    printSubject(inputChoiceYear, inputChoiceSem, inputChoiceSubj);

                } else if (inputChoiceSem == 2) {
                    System.out.println("Second Year, Second Semester");
                    System.out.println("[1] GEE 002     General Education Elective 2");
                    System.out.println("[2] MATH 012A   Introduction to Numerical Analysis");
                    System.out.println("[3] PHYS 001C   Calculus-Based Physics (Physics for Engineers)");
                    System.out.println("[4] MATH 006    Discrete Mathematics");
                    System.out.println("[5] ITE 005     Operating Systems");
                    System.out.println("[6] CS 201A     Data Structures and Algorithms Analysis	");
                    System.out.println("[7] ITE 014     Information Management");
                    System.out.println("[8] PE 004      Physical Education 4");
                    printSubject(inputChoiceYear, inputChoiceSem, inputChoiceSubj);

                }
                break;
            case 3:
                // 3rd year
                if (inputChoiceSem == 1) {
                    System.out.println("Third Year, First Semester");
                    System.out.println("[1] GEC 007     Science, Technology, and Society");
                    System.out.println("[2] SOCSC 005   Life and Works of Rizal");
                    System.out.println("[3] MATH 009CS  Probability and Statistics (w/lab)");
                    System.out.println("[4] CS 004      Networks and Communications");
                    System.out.println("[5] ITE 013     Application Development and Emerging Technologies");
                    System.out.println("[6] CS 403      Intelligent Agents");
                    System.out.println("[7] CS 300      Automata Theory and Formal Languages");
                    System.out.println("[8] CS 301      Software Engineering 1");
                    printSubject(inputChoiceYear, inputChoiceSem, inputChoiceSubj);

                } else if (inputChoiceSem == 2) {
                    System.out.println("Third Year, Second Semester");
                    System.out.println("[1] GEE 003     General Education Elective 3");
                    System.out.println("[2] CHEM 001C   Chemistry for Engineers");
                    System.out.println("[3] ITE 015     Social Issues and Professional Practice");
                    System.out.println("[4] CS 005      Information Assurance and Security");
                    System.out.println("[5] CS 302	   Modeling and Simulation");
                    System.out.println("[6] CS 006	   Algorithms and Complexity");
                    System.out.println("[7] ITE 010A	   Human Computer Interaction");
                    System.out.println("[8] CSELEC 001  CS Elective 1");
                    printSubject(inputChoiceYear, inputChoiceSem, inputChoiceSubj);

                }
                break;
            case 4:
                // 4th year
                if (inputChoiceSem == 1) {
                    System.out.println("Fourth Year, First Semester");
                    System.out.println("[1] GEC 008	  Ethics");
                    System.out.println("[2] TECH 101	  Technopreneurship");
                    System.out.println("[3] CS 307	  Thesis 1");
                    System.out.println("[4] FELEC 001  Free Elective");
                    System.out.println("[5] CSELEC 003 CS Elective 3");
                    printSubject(inputChoiceYear, inputChoiceSem, inputChoiceSubj);

                } else if (inputChoiceSem == 2) {
                    System.out.println("Fourth Year, Second Semester");
                    System.out.println("[1] CS 402  Internship in Computing");
                    System.out.println("[2] CS 401  Thesis 2");
                    printSubject(inputChoiceYear, inputChoiceSem, inputChoiceSubj);

                }
                break;

            default:
                System.out.println("Invalid. Try Again!");

        }

        // break;
    }

    public static void subjectChoice(int inputChoiceYear, int inputChoiceSem, int inputChoiceSubj) {
        switch (inputChoiceSubj) {
            case 1:
                if (inputChoiceYear == 1 && inputChoiceSem == 1) {
                    System.out.println("GEC  001    Understanding the Self");
                    System.out.println("");
                    System.out.println("CLASS STANDING:");
                    System.out.println("Assignment  - 30%");
                    System.out.println("Quiz        - 35%");
                    System.out.println("Recitation  - 35%");
                    System.out.println("");

                }

                if (inputChoiceYear == 1 && inputChoiceSem == 2) {
                    System.out.println("GEC 003     The Contemporary World");

                }
                if (inputChoiceYear == 2 && inputChoiceSem == 1) {
                    System.out.println("GEE 001	General Education Elective 1");

                }
                if (inputChoiceYear == 2 && inputChoiceSem == 2) {
                    System.out.println("GEE 002     General Education Elective 2");

                }
                if (inputChoiceYear == 3 && inputChoiceSem == 1) {
                    System.out.println("GEC 007     Science, Technology, and Society");

                }
                if (inputChoiceYear == 3 && inputChoiceSem == 2) {
                    System.out.println("GEE 003     General Education Elective 3");

                }
                if (inputChoiceYear == 4 && inputChoiceSem == 1) {
                    System.out.println("GEC 008	  Ethics");

                }
                if (inputChoiceYear == 4 && inputChoiceSem == 2) {
                    System.out.println("CS 402  Internship in Computing");

                }
                break;
            case 2:
                if (inputChoiceYear == 1 && inputChoiceSem == 1) {
                    System.out.println("GEC  004    Mathematics in the Modern World");

                }

                if (inputChoiceYear == 1 && inputChoiceSem == 2) {
                    System.out.println("GEC 003     The Contemporary World");

                }
                if (inputChoiceYear == 2 && inputChoiceSem == 1) {
                    System.out.println("GEE 001	General Education Elective 1");

                }
                if (inputChoiceYear == 2 && inputChoiceSem == 2) {
                    System.out.println("GEE 002     General Education Elective 2");

                }
                if (inputChoiceYear == 3 && inputChoiceSem == 1) {
                    System.out.println("GEC 007     Science, Technology, and Society");

                }
                if (inputChoiceYear == 3 && inputChoiceSem == 2) {
                    System.out.println("GEE 003     General Education Elective 3");

                }
                if (inputChoiceYear == 4 && inputChoiceSem == 1) {
                    System.out.println("GEC 008	  Ethics");

                }
                if (inputChoiceYear == 4 && inputChoiceSem == 2) {
                    System.out.println("CS 402  Internship in Computing");

                }
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;

            default:
                System.out.println("Invalid. Try Again!");

        }
    }

    public static void printSubject(int inputChoiceYear, int inputChoiceSem, int inputChoiceSubj) {
        // int inputChoiceSubj = 0;

        System.out.print("Enter Subject: ");
        Scanner scanner = new Scanner(System.in);
        inputChoiceSubj = Integer.valueOf(scanner.nextLine());
        cls();

        subjectChoice(inputChoiceYear, inputChoiceSem, inputChoiceSubj);
        System.out.println("-----------------------------------------------------------------------------");

        System.out.println("");
    }

    public static void printGradingFormula() {
        System.out.println("CS  - Class Standing");
        System.out.println("ME  - Major Exam");
        System.out.println("P   - Prelim");
        System.out.println("M   - Midterm");
        System.out.println("F   - Final");
        System.out.println("G   - Grade");
        System.out.println("");

        System.out.println("Prelim Grade:");
        System.out.println("PG = 50% PCS + 50% PME");
        System.out.println("");

        System.out.println("Midterm Grade:");
        System.out.println("MG = 1/3(PG) + 2/3 (50% MCS + 50% MME)");
        System.out.println("");

        System.out.println("Final Grade:");
        System.out.println("FG = 1/3(MG) + 2/3 (50% FCS + 50% FME)");
    }

    public static void printChoiceElective(int inputChoiceSubjElectivesMenu) {

        switch (inputChoiceSubjElectivesMenu) {
            case 1:
                System.out.println("***** C S * E L E C T I V E S * C O U R S E S *****");
                System.out.println("");
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("TRACK 1: Intelligent Systems");
                System.out.println("");

                System.out.println("CS 404      Expert Systems");
                System.out.println("CS 405      Natural Language Processing");
                System.out.println("CS 406      Machine Learning");
                System.out.println("-----------------------------------------------------------------------------");

                System.out.println("");
                System.out.println("-----------------------------------------------------------------------------");

                System.out.println("TRACK 2: GAME DEVELOPMENT");
                System.out.println("");
                System.out.println("CS 407      Multimedia Technology");
                System.out.println("CS 008      Level Design and Scripting");
                System.out.println("CS 009      Multiplayer and Online Programming");
                System.out.println("-----------------------------------------------------------------------------");

                System.out.println("");
                System.out.println("-----------------------------------------------------------------------------");

                System.out.println("TRACK 3: Data Science");
                System.out.println("");
                System.out.println("ITE 404     Introduction to Data Science in Python");
                System.out.println("ITE 405     Applied Plotting, Charting, and Data Representation");
                System.out.println("ITE 406     Applied Text Mining / Applied Social Network Analysis");
                System.out.println("-----------------------------------------------------------------------------");

                break;
            case 2:
                System.out.println("***** F R E E * E L E C T I V E S * C O U R S ES *****");
                System.out.println("");
                System.out.println("ITE 503     Current Trends and Issues in Computing");
                System.out.println("SAP 501     SAP / SAS");
                System.out.println("IS 015      Big Data Analytics");
                System.out.println("IS 005      Introduction to Project Management");
                System.out.println("IT 401      Data Mining and Warehousing");
                System.out.println("ITE 020     Quality Assurance");
                System.out.println("IT 008      Systems Administration and Maintenance");
                System.out.println("ELF 413     Mandarin");
                System.out.println("ELF 423     Spanish");
                System.out.println("IE 003B     Operations Reseach");

                break;

            default:
                System.out.println("Invalid! Try Again.");
        }

    }

    public static void subjectMenu(int inputSubjYear) {

        System.out.println("S U B J E C T S");
        System.out.println("");
        switch (inputSubjYear) {
            case 1:
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("FIRST YEAR - FIRST SEMESTER");
                System.out.println("");

                System.out.println("GEC  001        Understanding the Self");
                System.out.println("GEC  004        Mathematics in the Modern World");
                System.out.println("MATH 013        Linear Algebra with MATLAB");
                System.out.println("MATH 014        Number Theory");
                System.out.println("CS   001        Introduction to Computing");
                System.out.println("ITE  001        Computer Programming 1");
                System.out.println("PE   001        Physical Education 1");
                System.out.println("NSTP 001        National Service Training Program 1");
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("");

                System.out.println("-----------------------------------------------------------------------------");

                System.out.println("FIRST YEAR - SECOND SEMESTER");
                System.out.println("");
                System.out.println("GEC 003         The Contemporary World");
                System.out.println("GEC 005         Purposive Communication");
                System.out.println("GEC 006         Art Appreciation");
                System.out.println("MATH 015        Symbolic Logic");
                System.out.println("MATH 007        Differential Calculus");
                System.out.println("ITE 012         Computer Programming 2");
                System.out.println("PE 002          Physical Education 2");
                System.out.println("NSTP 002        National Service Training Program 2");
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("");

                break;
            case 2:
                System.out.println("SECOND YEAR - FIRST SEMESTER");
                System.out.println("");
                System.out.println("GEE 001         General Education Elective 1");
                System.out.println("GEC 002         Readings in Philippine History");
                System.out.println("MATH 008        Integral Calculus");
                System.out.println("CS 002          Advanced Object-Oriented Programming");
                System.out.println("CS 409          Mobile Computing");
                System.out.println("CS 200          Principles of Programming Languages");
                System.out.println("CS 003          Computer Architecture and Organization");
                System.out.println("PE 003          Physical Education 3");
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("");

                System.out.println("SECOND YEAR - SECOND SEMESTER");
                System.out.println("");
                System.out.println("GEE 002         General Education Elective 2");
                System.out.println("MATH 012A       Introduction to Numerical Analysis");
                System.out.println("PHYS 001C       Calculus-Based Physics (Physics for Engineers)");
                System.out.println("MATH 006        Discrete Mathematics");
                System.out.println("ITE 005         Operating Systems");
                System.out.println("CS 201A         Data Structures and Algorithms Analysis	");
                System.out.println("ITE 014         Information Management");
                System.out.println("PE 004          Physical Education 4");
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("");
                break;
            case 3:
                System.out.println("THIRD YEAR - FIRST SEMESTER");
                System.out.println("");
                System.out.println("GEC 007         Science, Technology, and Society");
                System.out.println("SOCSC 005       Life and Works of Rizal");
                System.out.println("MATH 009CS      Probability and Statistics (w/lab)");
                System.out.println("CS 004          Networks and Communications");
                System.out.println("ITE 013         Application Development and Emerging Technologies");
                System.out.println("CS 403          Intelligent Agents");
                System.out.println("CS 300          Automata Theory and Formal Languages");
                System.out.println("CS 301          Software Engineering 1");
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("");

                System.out.println("THIRD YEAR - SECOND SEMESTER");
                System.out.println("");
                System.out.println("GEE 003         General Education Elective 3");
                System.out.println("CHEM 001C       Chemistry for Engineers");
                System.out.println("ITE 015         Social Issues and Professional Practice");
                System.out.println("CS 005          Information Assurance and Security");
                System.out.println("CS 302          Modeling and Simulation");
                System.out.println("CS 006          Algorithms and Complexity");
                System.out.println("ITE 010A        Human Computer Interaction");
                System.out.println("CSELEC 001      CS Elective 1");
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("");

                System.out.println("THIRD YEAR - SUMMER");
                System.out.println("");
                System.out.println("CS 304          Software Engineering 2");
                System.out.println("CS 007          Parallel and Distributed Computing");
                System.out.println("CSELEC 002      CS Elective 2");
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("");
                break;
            case 4:
                System.out.println("FOURTH YEAR - FIRST SEMESTER");
                System.out.println("");
                System.out.println("[1] GEC 008         Ethics");
                System.out.println("[2] TECH 101        Technopreneurship");
                System.out.println("[3] CS 307          Thesis 1");
                System.out.println("[4] FELEC 001       Free Elective");
                System.out.println("[5] CSELEC 003      CS Elective 3");
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("");

                System.out.println("FOURTH YEAR - SECOND SEMESTER");
                System.out.println("");
                System.out.println("[1] CS 402          Internship in Computing");
                System.out.println("[2] CS 401          Thesis 2");
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("");
                break;
            case 5:
                break;
        }

    }

}
