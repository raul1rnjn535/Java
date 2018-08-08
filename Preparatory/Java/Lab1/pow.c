#include<stdio.h>
#define MOD 1000000007

int main() {
	long long int ans=1;
	// your code goes here
	for(int i=2;i<=35;i++){
		ans=(ans*2)%MOD;
	}
	printf("%lld\n",ans);
	return 0;
}
