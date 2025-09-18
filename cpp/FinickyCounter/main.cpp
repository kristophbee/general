#include <iostream>
using namespace std;

int main()
{
    int count = 0;
    while(true)
    {
        count += 1;
        // złam dla 10
        if (count > 10)
            break;
        //pomiń 5
        if (count == 5)
            continue;

        cout << count << "\t";
    }
    return 0;
}
