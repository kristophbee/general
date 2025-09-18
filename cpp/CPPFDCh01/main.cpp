//conversion program page 36 C++FD
//Celsius to Fahrenheit
//Fahrenheit = Celsius * (212 - 32)/100 +32
#include <cstdio>
#include <iostream>
#include <cstdlib>
using namespace std;
// hula, kurwa mać nie zapisałem strony :(
int main(int nNumberofArgs, char* pszArgs[])
{
    int celsius;
    cout << "Enter the temp in Celsius: ";
    cin >> celsius;
    // convrsion factor integer decl.
    int factor;
    //set for math ops
    factor = 212 - 32;
    int fahrenheit;
    fahrenheit = factor * celsius/100 + 32;
    cout << "Fahrenheit value is: ";
    cout << fahrenheit << endl;
    //cout drukuje endl zamyka linię jak \n
    system("PAUSE");
    return 0;
}
