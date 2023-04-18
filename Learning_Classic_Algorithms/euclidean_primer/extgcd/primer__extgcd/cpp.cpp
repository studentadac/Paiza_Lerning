#include <iostream>

using namespace std;

int extgcd(int a, int b, int *x, int *y) {
  int c = a;
  if (b != 0) {
    c = extgcd(b, a % b, y, x);
    *y -= (a / b) * (*x);
  } else {
    *x = 1;
    *y = 0;
  }
  return c;
}

int main() {
  int A, B;
//  cout << "A: ";
  cin >> A;
//  cout << "B: ";
  cin >> B;

  int x, y;
// int gcd = 
 extgcd(A, B, &x, &y);

  cout << x << " " << y << endl;

  return 0;
}