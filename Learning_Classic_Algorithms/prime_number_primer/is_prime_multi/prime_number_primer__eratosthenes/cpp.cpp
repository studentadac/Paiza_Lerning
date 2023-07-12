//言語：cpp
//問題URL：https://paiza.jp/works/mondai/prime_number_primer/prime_number_primer__eratosthenes
//コメント：
//コード：
//```cpp
#include <iostream>
using namespace std;
int main(void){
    
    int n;std::cin >> n;
    bool is_prime[n+1];
    
    for (int i = 0; i < n+1; i++) {
        /* code */
        is_prime[i]=true;
    }
    is_prime[0]=false;
    is_prime[1]=false;
    
    for (int i = 2; i < n+1; i++) {
      
      if(is_prime[i])
      {
        //  std::cout << "Yes" << std::endl;
          for (int j = i+i; j < n+1; j+=i) {
             is_prime[j]=false;
             
          }
          
          
      }
      
      
    }
    if(is_prime[n])
    {
        puts("YES");
    }
    else
    {
        puts("NO");
    }
    
  
    return 0;
}




//```