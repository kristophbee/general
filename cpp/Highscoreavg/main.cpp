//display 3 highscores ang count average

#include <iostream>
using namespace std;

int main()
{
    int score1=1000, score2=980, score3=840;
    cout << "Top scores:\n1.\t" << score1 << "\n2.\t" << score2 << endl;
    cout << "3.\t" << score3 << endl;
    cout << "\nThe average score is " << (score1+score2+score3)/3 << endl;
    return 0;
}
