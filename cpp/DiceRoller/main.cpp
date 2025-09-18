#include <iostream>
#include <cstdlib>
#include <ctime>

using namespace std;

int main()
{
    srand(time(0)); // seed random number
    int randomNumber = rand(); // generate random number
    int die = (randomNumber % 6) +1;//get a number between 1 and 6
    cout << "You rolled a " << die << endl;
    cout << "RAND_MAX is " << RAND_MAX << endl;
    return 0;
}
