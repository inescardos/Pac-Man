package model;

public final class Constants {

    /**********************************************************
     *         G  H  O  S  T  S
     */

    public static final String[] RIGHT_GHOST= {
            "     ####",
            "   ########",
            "  #00####00#",
            " #0000##0000#",
            " #0011##0011#",
            " #0011##0011#",
            "##0011##0011##",
            "###00####00###",
            "##############",
            "## ###  ### ##",
            "#   ##  ##   #",
    };

    public static final String[] LEFT_GHOST= {
            "     ####",
            "   ########",
            "  #00####00#",
            " #0000##0000#",
            " #1100##1100#",
            " #1100##1100#",
            "##1100##1100##",
            "###00####00###",
            "##############",
            "## ###  ### ##",
            "#   ##  ##   #",
    };

    public static final String[] UP_GHOST= {
            "     ####",
            "   ########",
            "  #11####11#",
            " #1111##1111#",
            " #0110##0111#",
            " #0000##0000#",
            "##0000##0000##",
            "###00####00###",
            "##############",
            "## ###  ### ##",
            "#   ##  ##   #",
    };


    public static final String[] DOWN_GHOST= {
            "     ####",
            "   ########",
            "  #00####00#",
            " #0000##0000#",
            " #0000##0000#",
            " #0110##0110#",
            "##1111##1111##",
            "###11####11###",
            "##############",
            "## ###  ### ##",
            "#   ##  ##   #",
    };

    public static final String[] FRIGHTENED_GHOST= {
            "     ####",
            "   ########",
            "  ##########",
            " ##11####11##",
            " ##11####11##",
            " ############",
            "###1###1###1##",
            "#1###1###1###1",
            "##############",
            "## ###  ### ##",
            "#   ##  ##   #",
    };




    /**********************************************************
     *          P   A   C   M   A   N
     */

    public static final String[] PAC_OPEN_RIGHT = {
            "     #####",
            "   #########",
            "  ##### #####",
            "  #########",
            " #######",
            " ####",
            " #######",
            "  #########",
            "  ###########",
            "   #########",
            "     #####"};


    public static final String[] PAC_CLOSE = {
            "     #####",
            "   #########",
            "  #### ######",
            "  #### ######",
            " #############",
            " #############",
            " #############",
            " #############",
            "  ###########",
            "   #########",
            "     #####"};

    public static final String[] PAC_OPEN_LEFT = {
            "     #####",
            "   #########",
            "  ##### #####",
            "    #########",
            "       #######",
            "         ####",
            "       #######",
            "    #########",
            "  ###########",
            "   #########",
            "     #####"};


    public static final String[] PAC_OPEN_UP = {
            "  #     # ",
            "  #     # ",
            " ###   ###",
            " ###   ###",
            "####   ####",
            "## ## #####",
            "##### #####",
            "###########",
            "###########",
            " ######### ",
            " ######### ",
            "  #######  ",
            "    # #    "};

    public static final String[] PAC_OPEN_DOWN = {
            "    # # ",
            "  ####### ",
            " #########",
            " #########",
            "###########",
            "###########",
            "## ## #####",
            "##### #####",
            "####   ####",
            " ###   ### ",
            " ###   ### ",
            "  #     #  ",
            "  #     #  "};


    /**********************************************************
     *           C O I N S
     */

    public static final String[] POWER_COIN = {

            "   ###### ",
            "  ##    ##",
            " ##      ##",
            " ##      ##",
            " ##      ##",
            " ##      ##",
            "  ##    ##",
            "   ######",
    };

    public static final String[] SMALL_COIN = {

            " ### ",
            "#####",
            "#####",
            " ### ",
    };


}
