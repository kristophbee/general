//Kółko und krzyżyk czyli wielowymiarowe macierze
#include <iostream>

using namespace std;

int main()
{
    const int ROWS = 3;
    const int COLS = 3;
    char board[ROWS][COLS] = { {'O','X','O'},
                                {' ','X','X'},
                                {'X','O','O'} };
    cout << "Heres the tic tac toe board:\n";
    for (int i=0; i<ROWS; ++i)
    {
        for (int j=0;j<COLS; ++j)
            cout << board[i][j];
            cout << endl;
    }
    cout << "\n'X' moves to the empty location.\n\n";
    board[1][0] = 'X';

    cout << "Now the tic tac toe board is:\n";
    for (int i=0; i<ROWS; ++i)
    {
        for (int j=0;j<COLS; ++j)
            cout << board[i][j];
            cout << endl;
    }
    cout << "\n'X' wins!";
    return 0;
}
